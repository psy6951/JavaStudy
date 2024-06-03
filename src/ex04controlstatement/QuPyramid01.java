package ex04controlstatement;
		/*
		문제2) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
		파일명 : QuPyramid01.java
		실행결과]
		*
		* *
		* * *
		* * * *
		* * * * *
		*/
public class QuPyramid01 {

	public static void main(String[] args) {
		
//		int y = 1;
//		while (y<=5) {
//			int x =1;
//			while (x<=y) {
//				System.out.print("* ");
//				x++;
//			}
//			System.out.println();
//			y++;
//		}
		
		//for문으로 구현
		//행을 반복
		for(int i=1 ; i<=5 ; i++) {
			//열을 반복
			for(int j=1 ; j<=5 ; j++) {
				//i(행)의 개수만큼 j(열)를 출력한다.
				if (j<=i) {
			System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("##################################");
		
		
		//while문으로 구현
		int i =1; //i,j가 for문의 지역변수이므로 새롭게 선언가능
		while(i<=5) {
			int j =1;
			//i번만큼 반복해서 출력
			while(j<=i) {
				 {
				System.out.print("* ");
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
