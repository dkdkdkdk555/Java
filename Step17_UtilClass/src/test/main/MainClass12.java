package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(20);
		set1.add(40);
		set1.add(50);
		/*
		 * HashSet 객체에 있는 모든 숫자를 콘솔에 출력해 보세요.
		 * 
		 * 검색!
		 */
		
		// Iterator(반복자) 객체 
		Iterator<Integer> iter=set1.iterator();
		
		while(iter.hasNext()) {// 다음 데이터가 있는지 확인해서 
			//있다면 다음 데이터 불러와서 출력하기 
			System.out.println(iter.next());
		}
		
		System.out.println("-- 확장 for 문도 이용할수 있다. ");
		for(int tmp:set1) {
			System.out.println(tmp);
		}
		
		
	}
}















