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
		
		int y = 1;
		while (y<=5) {
			int x =1;
			while (x<=y) {
				System.out.print("* ");
				x++;
			}
			System.out.println();
			y++;
		}

	}

}
