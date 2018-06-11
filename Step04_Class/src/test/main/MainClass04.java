package test.main;

import test.mypac.AttackUnit;

public class MainClass04 {
	public static void main(String[] args) {
		// AttackUnit 클래스로 객체 생성해서 참조값 변수에 담기
		AttackUnit unit1=new AttackUnit();
		//움직이고
		unit1.move();
		//방어하고
		unit1.defence();
		//공격하기
		unit1.attack();
	}
}
