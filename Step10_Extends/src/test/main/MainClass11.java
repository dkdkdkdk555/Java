package test.main;

import test.mypac.Bullet;
import test.mypac.MyGun;

public class MainClass11 {
	public static void main(String[] args) {
		MyGun gun1=new MyGun(new Bullet());
		gun1.fire();
	}
}
