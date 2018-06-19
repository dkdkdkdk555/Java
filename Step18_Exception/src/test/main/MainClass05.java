package test.main;
/*
 *  Exception 의 종류
 *  
 *  1. Checked Exception
 *  - RuntimeException 클래스를 상속 받지 않은 Exception Type
 *  - 반드시 try~catch 블럭으로 처리하거나 혹은 throws 해야한다.
 *  
 *  2. Unchecked Exception
 *  - RuntimeException 클래스를 상속 받은 Exception Type
 *  - try~catch 블럭으로 처리하지 않아도 컴파일 오류는 발생하지 
 *    않으므로 필요시 선택적으로 처리한다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		//Thread 클래스의 static 메소드 호출 
		
		try {
			//실행의 흐름(스레드) 을 5초동안 잡아두기 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됨");
	}
}















