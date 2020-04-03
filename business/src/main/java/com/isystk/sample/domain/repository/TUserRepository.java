package com.isystk.sample.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isystk.sample.common.exception.NoDataFoundException;
import com.isystk.sample.common.service.BaseRepository;
import com.isystk.sample.common.util.DateUtils;
import com.isystk.sample.domain.dao.TUserDao;
import com.isystk.sample.domain.entity.TUser;

import lombok.val;

/**
 * ユーザーリポジトリ
 */
@Repository
public class TUserRepository extends BaseRepository {

	@Autowired
	TUserDao tUserDao;

	/**
	 * ユーザーを追加します。
	 *
	 * @param inputUser
	 * @return
	 */
	public TUser create(final TUser inputUser) {

		// 1件登録
		val time = DateUtils.getNow();

		inputUser.setRegistTime(time); // 作成日
		inputUser.setUpdateTime(time); // 更新日
		inputUser.setDeleteFlg(false); // 削除フラグ
		inputUser.setVersion(0L); // 楽観ロック改定番号
		tUserDao.insert(inputUser);

		return inputUser;
	}

	/**
	 * ユーザーを更新します。
	 *
	 * @param inputUser
	 * @return
	 */
	public TUser update(final TUser inputUser) {
		// 1件更新
		val time = DateUtils.getNow();
		inputUser.setUpdateTime(time); // 更新日
		int updated = tUserDao.update(inputUser);

		if (updated < 1) {
			throw new NoDataFoundException("user_id=" + inputUser.getUserId() + " のデータが見つかりません。");
		}

		return inputUser;
	}

	/**
	 * ユーザーを論理削除します。
	 *
	 * @return
	 */
	public TUser delete(final Integer id) {
		val user = tUserDao.selectById(id)
				.orElseThrow(() -> new NoDataFoundException("user_id=" + id + " のデータが見つかりません。"));

		int updated = tUserDao.delete(user);

		if (updated < 1) {
			throw new NoDataFoundException("user_id=" + id + " は更新できませんでした。");
		}

		return user;
	}
}