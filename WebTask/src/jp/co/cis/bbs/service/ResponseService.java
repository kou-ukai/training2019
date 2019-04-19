package jp.co.cis.bbs.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import jp.co.cis.bbs.dao.ResponseDao;
import jp.co.cis.bbs.model.ResponseBean;

public class ResponseService {

	public void select(HttpServletRequest request) throws Exception {

		ResponseDao rDao = null;

		String id = request.getParameter("id");

		ArrayList<ResponseBean> comentList = new ArrayList<>();

		int threadId;

		try {

			if (id != null && !id.isEmpty()) {

				threadId = Integer.parseInt(id);

				rDao = new ResponseDao();

				comentList = rDao.threadIdSeach(threadId);

				request.setAttribute("comentList", comentList);

				request.setAttribute("id", threadId);

			} else {

				request.setAttribute("message", "データを受け取る事ができませんでした。");

			}

		} finally {

			if (rDao != null) {

				rDao.close();

			}

		}

	}

	public void insert(HttpServletRequest request) throws Exception {

		ResponseDao rDao = null;

		//登録に必要な情報取得（ページからの入力より）
		String id = request.getParameter("id");

		String name = request.getParameter("r_name");

		String coment = request.getParameter("r_coment");

		int threadId;

		try {

			//登録する為の全ての情報があるか確認
			if (id != null && !id.isEmpty() && name != null && !name.isEmpty() && coment != null
					&& !coment.isEmpty()) {

				ResponseBean rBean = new ResponseBean();

				threadId = Integer.parseInt(id);

				//Beanに登録したい情報を格納
				rBean.setT_id(threadId);

				rBean.setR_name(name);

				rBean.setR_coment(coment);

				//ResponseInsertDaoに情報を引数で渡す
				rDao = new ResponseDao();

				rDao.insertResponseDao(rBean);

				request.setAttribute("id", id);

			} else {

				//記入欄に未入力がある場合
				request.setAttribute("message", "コメント欄に未記入があります。投稿できません。");

			}

		} finally {

			if (rDao != null) {

				rDao.close();

			}

		}

	}

}
