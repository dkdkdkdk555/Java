package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서 회원 목록을 받아와서
		 * useList() 메소드를 호출하면서 전달해 보세요.
		 */
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> list=dao.getList();
		useList(list);
	}
	
	public static void useList(List<MemberDto> list) {
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+
					tmp.getName()+"|"+tmp.getAddr());
		}
	}
}








