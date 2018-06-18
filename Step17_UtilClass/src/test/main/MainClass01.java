package test.main;

import java.util.ArrayList;
/*
 *  [ ArrayList ]
 *  
 *  - 가변 배열이다.
 *  - 기본 data type 은 저장할수 없고 참조값(id)만 저장할수 있다.
 *  - Generic 클래스를 지정하지 않으면 Object 가 Generic 클래스로
 *    지정된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//Object type 을 저장할수 있는 가변 배열
		ArrayList list1=new ArrayList<>();
		//Object type 을 저장할수 있는 가변 배열 
		ArrayList<Object> list2=new ArrayList<>();
		//정수를 저장할수 있는 가변 배열
		ArrayList<Integer> list3=new ArrayList<>();
		//실수를 저장할수 있는 가변 배열
		ArrayList<Double> list4=new ArrayList<>();
		//문자열을 저장할수 있는 가변 배열
		ArrayList<String> list5=new ArrayList<>();
	}
}















