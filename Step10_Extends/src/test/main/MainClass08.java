package test.main;

import test.mypac.MyNavi;
import test.mypac.Navi;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  1. Navi 클래스를 상속받은 클래스를 정의해서
		 *  2. 그 클래스로 생성한 객체의 참조값을 얻어내서
		 *  3. 아래의 useNavi 메소드를 호출해 보세요.
		 */
		MyNavi n=new MyNavi();
		MainClass08.useNavi(n);
	}
	
	public static void useNavi(Navi navi) {
		navi.findWay();
	}
}	








