package ex08class;
/*
 문제3) QuMarbles.java (난이도:상)
구슬치기 하는 아이들을 추상화하여 클래스로 정의해보자.
*어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
*놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
*어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
초기화는 다음과 같이 진행한다.
◆어린이1의 보유갯수 : 구슬 20개
◆어린이2의 보유갯수 : 구슬 15개
게임은 다음과 같이 진행한다.
◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
# 어린이 객체를 생성시 구슬의 보유갯수는 생성자를 통해 초기화 되어야 한다.

메인메소드 샘플코드]
public static void main(String[] args)
{
ChildProperty child1 = new ChildProperty(20);
ChildProperty child2 = new ChildProperty(15);
System.out.println("게임 전 구슬의 보유 개수");
System.out.print("어린이1 : ");
child1.showProperty();
System.out.print("어린이2 : ");
child2.showProperty();
///*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
//child1.obtainBead(child2, 5);
///*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
//child2.obtainBead(child1, 9);
//System.out.println("\n게임 후 구슬의 보유 개수");
//System.out.print("어린이1 : ");
//child1.showProperty();
//System.out.print("어린이2 : ");
//child2.showProperty();
//}

/*
실행결과]
게임 전 구슬의 보유 개수
어린이1 : 보유 구슬의 개수 20
어린이2 : 보유 구슬의 개수 15
게임 후 구슬의 보유 개수
어린이1 : 보유 구슬의 개수 16
어린이2 : 보유 구슬의 개수 19
 */

public class ChildProperty {
    // 어린이가 보유한 구슬 개수를 저장하는 변수
    private int beadCount;

    // 생성자를 통해 구슬 개수를 초기화
    public ChildProperty(int beadCount) {
        this.beadCount = beadCount;
    }

    // 현재 보유한 구슬 개수를 출력하는 메소드
    public void showProperty() {
        System.out.println("보유 구슬의 개수 " + beadCount);
    }

    // 다른 어린이에게 구슬을 얻거나 잃는 메소드
    public void obtainBead(ChildProperty otherChild, int beadCount) {
        // 자신의 구슬 개수를 증가시키고, 다른 어린이의 구슬 개수를 감소시킴
        this.beadCount += beadCount;
        otherChild.beadCount -= beadCount;
    }

public class QuMarbles {

	public static void main(String[] args)
	{        	
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}


}
}
