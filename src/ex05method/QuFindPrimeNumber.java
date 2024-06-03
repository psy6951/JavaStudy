package ex05method;
/*
		 문제4) 파일명 : QuFindPrimeNumber.java
		전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
		이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
		메소드명 : isPrimeNumber()
		소수란 : 특정 정수를 나눌수 있는것이 1과 자기 자신밖에 없는 수.
		실행결과]
		2
		3
		5
		……중략……
		97
 */

public class QuFindPrimeNumber {

//	// 소수를 판별하는 메소드
//    public static boolean isPrimeNumber(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // 1부터 100까지의 소수를 출력하는 메소드
//    public static void main(String[] args) {
//        System.out.println("Prime numbers between 1 and 100:");
//        for (int i = 2; i <= 100; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i);
//            }
//        }
//    }
	
	public static boolean isPrimeNumber(int n) {
		
		//1은 소수가 아니므로 확인절차 없이 false반환
		if(n==1)
		return false;
		
		/*
		 만약 7이라면 1과 7로는 나눠서 떨어지므로 확인이 필요없다
		 2~6까지만 나눠보면 되므로 n-1까지만 확인한다.
		 */
		
		for(int x=2 ; x<n ; x++) {
			
		/*
		 만약 나눠떨어지는것이 발견되었다면 이미 소수가 아니므로 뒷부분은 확인할
		 필요가 없다. 따라서 즉시 false를 반환하여 메서드를 종료한다.
		 */
			if(n % x ==0)
				return false;
		}
		//위 반복문은ㄹ 벗어났다면 소수이므로 true를 반환한다.
		return true;
	
	}
	public static void main(String[] args) {
		//1~100까지의 정수 중 소수인지 판단하기 위해 반복호출
		for(int i=1 ; i<=100 ; i++) {
			
		//소수인지 판단하여 boolean을 받음
			boolean result = isPrimeNumber(i);
			//소수인 경우에만 콘솔에 출력
			if(result==true) {
				System.out.printf("소수=%d%n", i);
			}	
		}
	}
}