package test.main;
/*
*  3. 실수형
*  
*  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
*  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
*  
*  표현 가능 범위가 다르다
*  float < double 
*/
public class MainClass03 {
	public static void main(String[] args) {
		//실수형 변수 선언과 동시에 값 대입하기
		float iFloat=10.1f;
		double iDouble=10.1d;
		//double type 데이터를 만들어 낼때 d 는 생략가능
		double iDouble2=10.2;
		
		double result1 = 1.2f + 1.3d;
		double result2 = iFloat + 1.5;
		
		//연산후 결과를 casting 해서 변수에 담기 
		float result3 = (float)(iFloat + 1.5);		
	}
}














