package test.main;

import test.mypac.MemberDao;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		MemberDao dao1=MemberDao.getInstance();
		MemberDao dao2=MemberDao.getInstance();
		MemberDao dao3=MemberDao.getInstance();
		MemberDao dao4=MemberDao.getInstance();
		MemberDao dao5=MemberDao.getInstance();
	}
}
