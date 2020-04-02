package com.isystk.sample.web.front.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.isystk.sample.common.dto.mail.EntryRegist1;
import com.isystk.sample.common.exception.NoDataFoundException;
import com.isystk.sample.common.helper.SendMailHelper;
import com.isystk.sample.common.service.BaseTransactionalService;
import com.isystk.sample.common.util.DateUtils;
import com.isystk.sample.common.values.MailTemplate;
import com.isystk.sample.common.values.UserStatus;
import com.isystk.sample.domain.dao.MMailTemplateDao;
import com.isystk.sample.domain.dto.MMailTemplateCriteria;
import com.isystk.sample.domain.entity.MMailTemplate;
import com.isystk.sample.domain.entity.TUser;
import com.isystk.sample.domain.entity.TUserOnetimeValid;
import com.isystk.sample.domain.repository.TUserOnetimeValidRepository;
import com.isystk.sample.domain.repository.TUserRepository;

import lombok.val;

@Service
public class EntryService extends BaseTransactionalService {

	@Value("${spring.mail.properties.mail.from}")
	String fromAddress;

	@Value("${server.address}")
	String domain;

	@Autowired
	TUserRepository tUserRepository;

	@Autowired
	TUserOnetimeValidRepository tUserOnetimeValidRepository;

	@Autowired
	MMailTemplateDao mMailTemplateDao;

	@Autowired
	SendMailHelper sendMailHelper;

	/**
	 * 仮会員登録
	 *
	 * @param user
	 */
	public void registTemporary(TUser tUser) {

		// DB登録する
		tUser.setStatus(UserStatus.TEMPORARY.getCode());
		tUserRepository.create(tUser);

		// 会員-初期承認を登録する
		TUserOnetimeValid tUserOnetimeValid = new TUserOnetimeValid();
		tUserOnetimeValid.setUserId(tUser.getUserId());
		String onetimeKey = generateOnetimeKey();
		tUserOnetimeValid.setOnetimeKey(onetimeKey);
		tUserOnetimeValid.setOnetimeValidTime(DateUtils.addHour(DateUtils.getNow(), 7));
		tUserOnetimeValidRepository.create(tUserOnetimeValid);

		// 仮会員登録メールを送信する
		val mailTemplate = getMailTemplate(MailTemplate.ENTRY_REGIST_TEMPORARY.getCode());
		val subject = mailTemplate.getTitle();
		val templateBody = mailTemplate.getText();
		EntryRegist1 dto = new EntryRegist1();
		dto.setFamilyName(tUser.getFamilyName());
		dto.setDomain(domain);
		dto.setOnetimeKey(onetimeKey);
		Map<String, Object> objects = new HashMap<>();
		objects.put("dto", dto);
		val body = sendMailHelper.getMailBody(templateBody, objects);
		sendMailHelper.sendMail(fromAddress, new String[] { tUser.getEmail() }, subject, body);
	}

	/**
	 * 仮会員登録
	 *
	 * @param onetimeKey
	 */
	public void registComplete(String  onetimeKey) {

		// ワンタイムキーからユーザーIDを取得する
		var tUserOnetimeValid = tUserOnetimeValidRepository.findOneByOnetimeKey(onetimeKey)
				.orElseThrow(() -> new NoDataFoundException("指定されたワンタイムキーが見つかりません。[onetimeKey=" + onetimeKey + "]"));

		// ユーザー情報を取得する
		TUser tUser = tUserRepository.findById(tUserOnetimeValid.getUserId());

		// DB登録する
		tUser.setStatus(UserStatus.VALID.getCode());
		tUserRepository.update(tUser);

		// 本会員登録完了メールを送信する
		val mailTemplate = getMailTemplate(MailTemplate.ENTRY_REGIST_VALID.getCode());
		val subject = mailTemplate.getTitle();
		val templateBody = mailTemplate.getText();
		EntryRegist1 dto = new EntryRegist1();
		dto.setFamilyName(tUser.getFamilyName());
		dto.setDomain(domain);
		Map<String, Object> objects = new HashMap<>();
		objects.put("dto", dto);
		val body = sendMailHelper.getMailBody(templateBody, objects);
		sendMailHelper.sendMail(fromAddress, new String[] { tUser.getEmail() }, subject, body);
	}

    /**
     * ワンタイムキー生成
     *
     * @return 生成されたワンタイムキー
     */
    private String generateOnetimeKey() {
	String onetimeKey = "";
	boolean loopFlg = true;

	do {
	    // ランダムな文字列を生成する。
	    onetimeKey = RandomStringUtils.randomAlphanumeric(32);

	    // 生成したキーが存在しないか確認する
	    if (null == getTUserOnetimeValid(onetimeKey)) {
		loopFlg = false;
	    }
	} while (loopFlg);

	return onetimeKey;
    }

    /**
     * 会員-初期承認Entityを取得する
     *
     * @param onetimeKey ワンタイムキー
     * @return 会員Entity
     */
    public TUserOnetimeValid getTUserOnetimeValid(String onetimeKey) {
    	return tUserOnetimeValidRepository.findOneByOnetimeKey(onetimeKey).orElse(null);
    }

	/**
	 * メールテンプレートを取得する。
	 *
	 * @return
	 */
	protected MMailTemplate getMailTemplate(Integer templateId) {
		val criteria = new MMailTemplateCriteria();
		criteria.setMailTemplateIdEqual(templateId);
		val mailTemplate = mMailTemplateDao.select(criteria).orElseThrow(
				() -> new NoDataFoundException("templateKey=" + criteria.getMailTemplateId() + " のデータが見つかりません。"));

		return mailTemplate;
	}

}
