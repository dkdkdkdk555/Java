package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;
import test.mypac.Person;

public class MainClass05 {
	public static void main(String[] args) {
		// Generic 클래스를 Object 로 하면 어떤 type 이든
		// 다 저장할수 있지만 여러개의 type 을 섞어서 저장하는
		// 경우는 없다고 보면 된다. 
		List<Object> list=new ArrayList<>();
		// 아래와 같이 여러 type 을 저장하는 경우는 없다...
		list.add(10);  //Integer 저장
		list.add(10.1); //Double 저장
		list.add(true); //Boolean 저장
		list.add("abcd"); //String 저장
		list.add(new Person()); //Person 저장
		list.add(new Car()); //Car 저장 
	}
}







