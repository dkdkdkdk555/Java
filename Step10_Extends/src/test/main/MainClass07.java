package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		HandPhone p2=new HandPhone();
		SmartPhone p3=new SmartPhone();
		
		// 메소드 호출하면서 변수에 담긴 참조값 전달
		MainClass07.usePhone(p1);
		MainClass07.usePhone(p2);
		MainClass07.usePhone(p3);
		
		// 메소드 호출하면서 객체를 생성해서 참조값 전달 
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
		// NullPointerException 발생 
		MainClass07.usePhone(null);
	}
	
	public static void usePhone(Phone p) {
		p.call();
	}
}
























