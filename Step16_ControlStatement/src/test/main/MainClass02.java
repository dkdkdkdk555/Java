package test.main;

public class MainClass02 {
	//무기의 상태값을 정의한 상수 
	public static final int SWORD=0;
	public static final int GUN=1;
	public static final int ARROW=2;
	public static final int FIST=3;
	
	public static void main(String[] args) {
		//무기의 현재 상태값
		int weaponState=ARROW;
		
		if(weaponState==SWORD){
			System.out.println("칼로 공격해요");
		}else if(weaponState==GUN){
			System.out.println("총으로 공격해요");
		}else if(weaponState==ARROW){
			System.out.println("활로 공격해요");
		}else if(weaponState==FIST){
			System.out.println("주먹으로 공격해요");
		}else{
			System.out.println("무기가 선택되지 않아서 공격할수 없음");
		}
	}
}











