package test.main;

import java.util.ArrayList;

import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * String type 을 담을수 있는 ArrayList 객체를 생성해서
		 * 문자열을 3개 저장해 보세요.
		 */
		ArrayList<String> msgs=new ArrayList<>();
		msgs.add("하나");
		msgs.add("두울");
		msgs.add(new String("세엣"));
		
		// Person type 을 담을수 있는 ArrayList 객체를 생성해서
		ArrayList<Person> persons=new ArrayList<>();
		// Person 객체를 3개 저장해 보세요.
		persons.add(new Person());
		persons.add(new Person());
		Person p=new Person();
		persons.add(p);
		
	}
}











