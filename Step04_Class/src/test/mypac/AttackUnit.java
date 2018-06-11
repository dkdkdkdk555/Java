package test.mypac;

public class AttackUnit{
	//non static 맴버필드 
	public int energy=100;
	
	//non static 맴버 메소드 
	// 공격하는 메소드 
	public void attack() {
		System.out.println("공격해요!");
	}
	//방어하는 메소드 
	public void defence() {
		System.out.println("방어해요!");
	}
	//움직이는 기능
	public void move() {
		System.out.println("움직여요!");
	}
}





