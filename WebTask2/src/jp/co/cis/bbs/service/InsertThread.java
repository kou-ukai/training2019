package jp.co.cis.bbs.service;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import jp.co.cis.bbs.dao.ThreadDao;
import jp.co.cis.bbs.model.ThreadBean;

public class InsertThread  {
	public void execute(HttpServletRequest request)throws Exception{
		ThreadDao dao=null;
		String id=request.getParameter("id");
		String title=request.getParameter("title");
		try {
			if(id!=null&&!id.isEmpty()&&title!=null&&!title.isEmpty()) {
				ThreadBean bean=new ThreadBean();
				bean.setId(id);
				bean.setTitle(title);
				bean.setTime(LocalDate.now().toString());
				dao=new ThreadDao();
				int numRow=dao.insertThread(bean);
				if(numRow>0) {
					request.setAttribute("message","新しい掲示板を作りました");
				}else {
					request.setAttribute("message", "掲示板を作れませんでした");
				}
				
			}else {
				request.setAttribute("messaage","掲示板ID、掲示板タイトルに未入力欄があります");
			}
	    }finally {
	    	if(dao!=null) {
	    		dao.close();
	    	}
	    }
	}

}
