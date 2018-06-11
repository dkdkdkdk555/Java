package test.main;

import test.mypac.Person;

/*
 *  1. test.mypac 페키지에 Person 이라는 이름의 클래스를 만들기
 *  2. static 을 붙이지 않고 필드 1개 정의하기
 *  3. static 을 붙이지 않고 메소드 2개 정의하기 
 *  4. main() 메소드에서 Person 클래스를 이용해서 객체 생성후 
 *     2개의 메소드를 호출해 보세요. 
 */
public class MainClass07 {
	public static void main(String[] args) {
		Person p=new Person();
		p.sing();
		p.study();
	}
}










