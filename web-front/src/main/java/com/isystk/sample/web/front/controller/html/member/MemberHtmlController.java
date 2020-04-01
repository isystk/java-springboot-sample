package com.isystk.sample.web.front.controller.html.member;

import static com.isystk.sample.web.base.FrontUrl.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isystk.sample.domain.dao.AuditInfoHolder;
import com.isystk.sample.domain.dao.TUserDao;
import com.isystk.sample.domain.dto.TPostCriteria;
import com.isystk.sample.domain.dto.TUserCriteria;
import com.isystk.sample.domain.dto.common.Pageable;
import com.isystk.sample.web.front.service.PostService;
import com.isystk.sample.web.base.controller.html.AbstractHtmlController;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(MEMBER_URL)
public class MemberHtmlController extends AbstractHtmlController {

	@Autowired
	PostService postService;

	@Autowired
	TUserDao tUserDao;

	@Override
	public String getFunctionName() {
		return "F_MEMBER";
	}

	/**
	 * 会員表示
	 * @param postId
	 * @param model
	 * @return
	 */
	@GetMapping()
	public String index(@ModelAttribute MemberHtmlForm form, Model model) {
		// 入力値を詰め替える
		var inputPost = new TPostCriteria();
		// ログインユーザーID
		var criteria = new TUserCriteria();
		criteria.setEmailEqual(AuditInfoHolder.getAuditUser());
	    var tUser = tUserDao.select(criteria).orElseThrow();
		inputPost.setUserId(tUser.getUserId());
		// TODO 10件区切りで取得する
		val pages = postService.findAll(inputPost, Pageable.NO_LIMIT);

		// 画面に検索結果を渡す
		model.addAttribute("pages", pages);

		return "modules/member/index";
	}

}
