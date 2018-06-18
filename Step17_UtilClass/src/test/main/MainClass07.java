package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		/*	
		 *  1. MemberDto type 을 담을 ArrayList 객체를 생성하고
		 *  
		 *  2. 3 명의 회원정보를 각각 MemberDto 객체에 담아서
		 *  
		 *  3. MemberDto 객체의 참조값을 ArrayList 객체에 저장하기
		 */
		
		//1.
		List<MemberDto> members=new ArrayList<>();
		
		//2.
		//MemberDto dto1=new MemberDto(1, "김구라", "노량진");
		//MemberDto dto2=new MemberDto(2, "해골", "행신동");
		//MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto();
		dto2.setNum(2);
		dto2.setName("해골");
		dto2.setAddr("행신동");
		
		MemberDto dto3=new MemberDto();
		dto3.setNum(3);
		dto3.setName("원숭이");
		dto3.setAddr("동물원");
		
		//3.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		//참조 연습
		List<MemberDto> a=members;
		MemberDto b=members.get(0);
		int c=members.get(0).getNum();
		String d=members.get(0).getName();
		String e=members.get(0).getAddr();
	}
}












