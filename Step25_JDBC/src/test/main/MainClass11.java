package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		/* 
			MemberDao 객체를 이용해서 1번회원의 정보를 
			얻어와서(리턴받아서) useDto() 메소드를 
			호출해 보세요.
		*/
		MemberDao dao=MemberDao.getInstance();
		//1번 회원의 정보를 얻어와서 
		MemberDto dto=dao.getData(1);
		//메소드 호출하면서 전달
		useDto(dto);
	}
	
	public static void useDto(MemberDto dto) {
		System.out.println(dto.getNum()+"|"
				+dto.getName()+"|"+dto.getAddr());
	}
}









