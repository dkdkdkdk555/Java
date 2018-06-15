package test.main;

import test.mypac.BoxFactory;
import test.mypac.BoxFactory.Box;

public class MainClass04 {
	public static void main(String[] args) {
		BoxFactory f=new BoxFactory();
		
		Box box=f.getBox();
		box.useBox();
	}
}
