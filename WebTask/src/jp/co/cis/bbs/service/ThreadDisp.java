package jp.co.cis.bbs.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import jp.co.cis.bbs.dao.ThreadDao;
import jp.co.cis.bbs.model.ThreadBean;

public class ThreadDisp {
	public void execute(HttpServletRequest request)throws Exception{
		ThreadDao td=null;
		try {
			td=new ThreadDao();
			ArrayList<ThreadBean>threadList=td.getThreadList();
			if(threadList.size()==0) {
				request.setAttribute("message", "新しい掲示板を作ってください");	
			}else {
				request.setAttribute("threadList", threadList);
			}
		}finally {
			if(td!=null) {
				td.close();
			}
		}
	}

}
