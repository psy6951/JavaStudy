package ex05method;
/*
		 문제5) 파일명 : QuFibonacci.java
		피보나치 수열은 첫항이 0, 두번째항이 1로 구성되어 이전 2개의 항을 더해서 다음 항을 만들어낸다.
		입력한 정수의 갯수만큼 항목을 출력하도록 프로그램을 작성하시오.
		메서드명 : fibonacciProgression()
		형식]
		첫번째 항 0 / 두번째항 1
		세번째항 : 0 + 1 = 1
		네번째항 : 1 + 1 = 2
		다섯번째항 : 1 + 2 = 3
		실행결과
		숫자를 입력하세요 : 10
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */
import java.util.Scanner;

public class QuFibonacci {
//	public static void fibonacciProgression(int n) {
//        if (n <= 0) {
//            System.out.println("양수를 입력하세요.");
//            return;
//        }
//
//        int[] fibonacci = new int[n];
//        fibonacci[0] = 0;
//
//        if (n > 1) {
//            fibonacci[1] = 1;
//        }
//
//        for (int i = 2; i < n; i++) {
//            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci[i]);
//            if (i < n - 1) {
//                System.out.print(", ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 : ");
//        int number = scanner.nextInt();
//        fibonacciProgression(number);
//    }
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int n = scanner.nextInt();
		fibonacciProgression1(n);
		fibonacciProgression2(n);
	}
	
	//배열로 구현
	public static void fibonacciProgression1(int n) {
		if(n<=2) {
			System.out.println("피보나치 수열은 0,1로 시작하므로 "+ "3부터 입력해주세요");
			return;
		}
		
		//출력항목의 크기로 배열 선언
		int[] fibo = new int[n];
		
		//피보나치 수열은 0,1로 시작하므로 아래와 같이 초기화
		fibo[0] = 0;
		fibo[1] = 1;
		
		//나머지 수를 계산
		for(int i=2 ; i<n ; i++) {
			fibo[i] = fibo[i-2]+ fibo[i-1];
		}

		//피보나치수열 출력
		for(int i=0 ; i<n ; i++) {
			System.out.printf("%d ", fibo[i]);
		}
		System.out.println("\n=============================");
	}
	
	
	//일반변수로 구현
	public static void fibonacciProgression2(int n) {
		if(n<=2) {
			System.out.println("피보나치 수열은 0,1로 시작하므로 "+ "3부터 입력해주세요");
			return;
		}
		
		int f1=0, f2=1, f3;
		System.out.printf("%d %d ", f1, f2);
		
		//앞에서 이미 0,1을 출력했으므로 n-2만큼 반복한다.
		for(int i=1 ; i<=n-2 ; i++) {
			//첫번째 수와 두번째 수를 더한 후 즉시 출력
			f3= f1 + f2;
			System.out.printf("%d ",f3);
			
			//각 변수에 새로운값(다음항목)을 할당
			f1=f2;
			f2=f3;
		}
	}


	

}
