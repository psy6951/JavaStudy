package ex10accessmodifier;

class FruitSeller {
	
	/*
	 멤버변수에 private 접근지정자를 추가한다. 
	 이렇게 하면 클래스 내부에서만 접근할 수 있고, 
	 외부에서의 접근은 원천적으로 차단된다.
	 */
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	
	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE =price;
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

class FruitBuyer {
	private int myMoney;
	private int numOfApple; 
	
	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}

}

public class E03InfomationHiding {
	
	public static void main(String[] args) {
		
		FruitSeller seller1 =new FruitSeller(0, 100, 1000);
		FruitSeller seller2 =new FruitSeller(0, 80, 500);
		FruitBuyer buyer =new FruitBuyer(10000, 0);

		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 각 판매자에게 1000원씩 지불하고 사과를 구매한다.
		 멤버메서드를 통한 구매이므로 판매의 규칙이 잘 지켜지게 된다.
		 이와 같은 이유로 객체지향 프로그래밍에서는 "정보은닉"을 권장하고 있다.
		 */
		buyer.buyApple(seller1, 1000);
		buyer.buyApple(seller2, 1000);
		
//////////////////////////////////////////
		
		
//		seller1.myMoney += 1000; 
//		buyer.myMoney -= 1000; 
//		seller1.numOfApple -= 50; 
//		buyer.numOfApple += 50; 
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult(); 
		buyer.showBuyResult(); 
		
	}

}
