package test.main;

import java.util.HashSet;

/*
 *  [ HashSet ]
 *  
 *  - 순서가 없다
 *  - 키값도 없다
 *  - 중복을 허용하지 않는다.
 *  - 집합의 개념으로 데이터를 관리하고 싶을때 사용한다.
 *  - Set 인터페이스를 구현 했다. 
 */
public class MainClass12 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 HashSet 객체 
		HashSet<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(20);
		set1.add(40);
		set1.add(50);
	}
}






