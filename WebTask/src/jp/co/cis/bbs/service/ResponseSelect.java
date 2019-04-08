package jp.co.cis.bbs.service;

import javax.servlet.http.HttpServletRequest;

import jp.co.cis.bbs.dao.ResponseDao;


public class ResponseSelect {

	public void execute(HttpServletRequest request) throws Exception{

		ResponseDao rDao=null;
		String t_id=request.getParameter("t_id");

		try {

			if(t_id !=null && t_id.isEmpty()) {

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

}
