package test.main;

public class MainClass03 {
	//무기의 상태값을 정의한 상수 
	public static final int SWORD=0;
	public static final int GUN=1;
	public static final int ARROW=2;
	public static final int FIST=3;
	
	public static void main(String[] args) {
		//무기의 현재 상태값
		int weaponState=ARROW;
		
		switch(weaponState) {
			case SWORD:
				System.out.println("칼로 공격해요");
				break;
			case GUN:
				System.out.println("총으로 공격해요");
				break;
			case ARROW:
				System.out.println("활로 공격해요");
				break;
			case FIST:
				System.out.println("주먹으로 공격해요");
				break;
			default:
				System.out.println("무기가 없어서 공격불가");
				break;
		}
	}
}











