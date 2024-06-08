package ex12inheritance;

class Parent {
	int parentMember;
	void parentMethod() {
		System.out.println("부모의메소드:parentMethod()");
	}
}
class Child extends Parent {
	int childMember;
	void childMethod() {
		System.out.println("자식의메소드:parentMethod()");
	}
	@Override
	void parentMethod(){
		System.out.println("자식에서 Overriding한 메소드"+":parentMethod()");
	}
	void parentMehod(int childMember){
		this.childMember = childMember;
		System.out.println("Overloading: 자식에서 확장한 메소드"+":parentMethod(int childMember)");
	}
}

public class E11Polymorphism {

	public static void main(String[] args) {
		//// TODO Auto-generated method stubkkkkkkkkk

	}

}
