package service;

import javax.servlet.http.HttpServletRequest;

import bean.ResponseBean;
import dao.ResponseDao;


/**
 *データベースに登録・追加を行う為の前処理
 */
public class ResponseInsert {
	
	/**コメントの追加する為の確認・情報の取り出しメソッド
	 * @param request　ページからの情報受け取り
	 * @throws Exception
	 */
	public void excute (HttpServletRequest request) throws Exception{
		
		ResponseDao rDao=null;
		
		//登録に必要な情報取得（ページからの入力より）
		String t_id=request.getParameter("t_id");
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
