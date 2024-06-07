package ex12inheritance;
/*
 상속관계에서 오버로딩 vs 오버라이딩
 오버로딩: 
 오버라이딩:
 */


class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}

class C extends B {
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	}
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
}


public class E07RideAndLoad01 {

	public static void main(String[] args) {
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod(); //0
		ref2.rideMethod(); //0
		ref3.rideMethod(); //0
		
		System.out.println("오버로딩 처리된 메소드");
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
		ref2.loadMethod();
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1);
		
		ref1.loadMethod();
//		ref1.loadMethod(1);
//		ref1.loadMethod(1.1);

		
///////////////////////////
		/*
		 부모의 참조변수로 자식의 인스턴스를 참조할 수 있다.
		 좌측은 부모, 우측은 자식이므로 모두 가능한 문장이다.
		 */
		A refNum1 = new B();
		A refNum2 = new C();
		B refNum3 = new C();
		
		//같은 타입이므로 참조가능
		C refAddr1 = new C();
		//B타입->C타입을 참조하므로 가능
		B refAddr2 = refAddr1;
		//A타입->C타입을 참조하므로 가능
		A refAddr3 = refAddr1;

		//A타입->C타입 참조하므로 가능
		A refId1 = new C();
		//B->A 이므로 불가능(자식은 부모를 참조할 수 없다)
//		B refId2 = refId1;
		//C->A 이므로 불가능(자식은 부모를 참조할 수 없다)
//		C refId3 = refId1;
		
		/*
		 자식으로 부모인스턴스를 참조하는 것은 기본적으로 불가능하다.
		 하지만 다운캐스팅(강제형변환)을 하면 참조가 가능해진다.
		 즉 부모타입을 자식타입으로 변경하는 것이다. 
		 이는 클래스가 상속관계에 있기 때문에 가능하고, 
		 방식은 기본자료형과 동일하게 소괄호를 이요하면 된다.
		 */
		B refId2 = (B)refId1;
		C refId3 = (C)refId1;
		
	}

}







