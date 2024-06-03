package ex04controlstatement;
/*
문제3) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
파일명 : QuPyramid02.java
실행결과]
* * * * *
* * * *
* * *
* *
*
*/
public class QuPyramid02 {

	public static void main(String[] args) {
		
		 int i = 5; // 행을 위한 변수, 초기값은 5로 설정
	        
	        do {
	            int j = 1; // 각 행의 별 출력을 위한 변수
	            do {
	                System.out.print("* ");
	                j++;
	            } while (j <= i);
	            System.out.println(); // 행이 끝나면 줄바꿈
	            i--;
	        } while (i > 0);


	}

}
