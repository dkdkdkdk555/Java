package test.mypac;
/*
 *  가상의 지갑 역활을 하는 클래스 
 */
public class Wallet {
	//static 맴버필드
	public static int totalMoney;
	//돈을 저장하는 static 맴버 메소드
	public static void addMoney(int money) {
		totalMoney += money;
	}
	//돈을 인출하는 static 맴버 메소드
	/*
	 *  한개 이상의 스레드에서 동일한 메소드를 사용할때 
	 *  충돌 방지를 하기 위해서 synchronized 예약어를 메소드에 
	 *  붙여준다. 
	 */
	public static synchronized int getMoney(String name){
		if(totalMoney>0) {
			totalMoney -= 1;
			System.out.println
				(name+" 가 1만원 인출! 현재 잔고:"+totalMoney);
			return 1;
		}else{
			System.out.println
				(name+" 이 인출요청, 더이상 인출할 돈이 없어요");
			return 0;
		}
	}	
	
}











