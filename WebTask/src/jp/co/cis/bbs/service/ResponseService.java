package jp.co.cis.bbs.service;

import javax.servlet.http.HttpServletRequest;

import jp.co.cis.bbs.dao.ResponseDao;
import jp.co.cis.bbs.model.ResponseBean;

public class ResponseService {
	
	
	public void select(HttpServletRequest request) throws Exception{

		ResponseDao rDao=null;
		String t_id="1";

		try {

			if(t_id !=null && !t_id.isEmpty()) {

				rDao=new ResponseDao();
				rDao.threadIdSeach(Integer.parseInt(t_id),request);


			}else {

				request.setAttribute("message", "トッピクIDが見つかりません");

			}

		}finally {

			if(rDao !=null) {

				rDao.close();

			}

		}
	}
	
	public void insert (HttpServletRequest request) throws Exception{

		ResponseDao rDao=null;

		//登録に必要な情報取得（ページからの入力より）
		String t_id="1";
		String r_name=request.getParameter("r_name");
		String r_coment=request.getParameter("r_coment");

		try {

			//登録する為の全ての情報があるか確認
			if(t_id!=null && !t_id.isEmpty() && r_name!=null && !r_name.isEmpty() && r_coment != null && !r_coment.isEmpty()) {

				ResponseBean rBean=new ResponseBean();

				//Beanに登録したい情報を格納
				rBean.setT_id(Integer.parseInt(t_id));
				rBean.setR_name(r_name);
				rBean.setR_coment(r_coment);

				//ResponseInsertDaoに情報を引数で渡す
				rDao=new ResponseDao();
				rDao.insertResponseDao(rBean, request);

			}else {

				//記入欄に未入力がある場合
				request.setAttribute("message", "コメント欄に未記入があります。投稿できません");

			}


		}finally {
			if(rDao !=null) {
				rDao.close();
			}
		}


	}


}
