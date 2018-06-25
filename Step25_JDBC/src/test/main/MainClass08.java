package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		//DB 에 저장할 회원 정보라고 가정!
		int num=4;
		String name="주뎅이";
		String addr="봉천동";
		
		//MemberDao 객체의 참조값 얻어와서 
		MemberDao dao=MemberDao.getInstance();
		//회원정보 저장하기
		dao.insert(new MemberDto(num, name, addr));
	}
}









