package test.main;

import test.dao.MemberDao;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 *  MemberDao 객체를 이용해서 
		 *  3번 회원의 정보를 삭제해 보세요.
		 */
		
		MemberDao dao=MemberDao.getInstance();
		dao.delete(3);
		
	}
}








