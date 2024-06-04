package ex10accessmodifier.sub;
/*
 E01AccessModifier1 클래스와 선언된 패키지미ㅏㄴ 다르고 모든 내용이 동일하게 작성된 클래스이다.
 */

class DefaultClass2 {
	void myFunc() {
		System.out.println("DefaultClass의 myFunc()메소드 호출");
	}
}
 

public class E01AccessModifier2 {
	
	//멤버변수 : 3가지 접근지정자 사용
	private int privateVar;
	int defaultVar;
	public int publicVar;

	//멤메메서드 : 3가지 접근지정자 사용
	private void privateMethod() {
		privateVar=400;
		System.out.println("PrivateMethod() 메소드 호출");
	}
	
	void DefaultMethod() {
		privateVar=500;
		System.out.println("DefaultMethod() 메소드 호출");
	}
	
	public void publicMethod() {
		privateVar=600;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
	


}
