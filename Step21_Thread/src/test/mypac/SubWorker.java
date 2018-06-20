package test.mypac;
/*
 *  [ 스레드 만들기 ]
 *  
 *  (방법1)
 *  
 *  1. Thread 클래스를 상속 받은 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩 한다.
 *  3. 새로운 작업단위가 필요한 시점에 지금 정의한 클래스를 
 *     이용해서 객체를 생성하고 start() 메소드를 호출하면 
 *     run() 메소드에서 새로운 스레드가 시작 된다.
 */
public class SubWorker extends Thread{
	@Override
	public void run() {
		//새로운 작업단위가 시작되는 메소드 이다.
		System.out.println("새로운 스레드 시작!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("새로운 스레드가 종료 됩니다.");
	}
}



















