package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  MemberDao 객체를 이용해서 
		 *  2 번 회원의 정보를 다음과 같이 수정해 보세요.
		 *  
		 *  이름 : 이주환
		 *  주소 : 상도동
		 */
		//MemberDao 객체의 참조값 얻어오기 
		MemberDao dao=MemberDao.getInstance();
		
		//dao.update(new MemberDto(2, "이주환", "상도동"));
		
		// default 생성자를 호출해서 객체 생성후
		MemberDto dto=new MemberDto();
		//setter 메소드를 이용해서 회원정보를 전달하고
		dto.setNum(2);
		dto.setName("이주환");
		dto.setAddr("상도동");
		
		//MemberDao 객체를 이용해서 DB 에 수정 반영한다.
		dao.update(dto);
		
	}
}









