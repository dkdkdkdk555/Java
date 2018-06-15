package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		// 수열씨를 공격하고 싶다면?
		Weapon w1=new Weapon() {
			@Override
			public void attack() {
				System.out.println("수열씨를 공격해요");
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("누군가를 공격해요");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}









