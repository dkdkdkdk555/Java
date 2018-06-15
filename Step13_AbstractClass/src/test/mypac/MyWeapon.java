package test.mypac;

public class MyWeapon extends Weapon{
	
	// 추상 클래스에 정의된 추상메소드는 반드시 오버라이드 해야한다.
	@Override
	public void attack() {
		System.out.println("내 마음대로 공격해요~");
	}

}
