package test.main;

import test.mypac.OurWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1=new OurWeapon();
		useWeapon(w1);
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}











