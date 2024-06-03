package ex04controlstatement;

public class QuPyramid03 {
	/*
		 문제4) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		파일명 : QuPyramid03.java
		실행결과]
	         *
	       * * *
	     * * * * *
	   * * * * * * *
	 * * * * * * * * *

	 */

	 public static void main(String[] args) {
		
//	        int rows = 5;
//
//	        for (int i = 1; i <= rows; i++) {
//	            // 공백 출력
//	            for (int j = 1; j <= rows - i; j++) {
//	                System.out.print("  ");
//	            }
//	            // 별표 출력
//	            for (int k = 1; k <= i * 2 - 1; k++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
//	 }
		 
		 //행의 개수 지정
		 int num =5;
		 
		 for(int i=0 ; i<num ; i++) {
			 //공백 출력하기
			 for(int j=1 ; j<=(num-i) ; j++ ) {
				 //i가 증가함에  따라 j의 반복은 감소함.
				 System.out.print(" ");
			 }
			 
			 
			 //*출력하기. 조건의 일반식에 의해 1,3,5,7...이 생성된다.
			 for(int k=0 ; k<(i*2+1) ; k++) {
				 System.out.print("*");
			 }
			 //한 행 출력 후 줄바꿈
			 System.out.println();
		 }
			 
		 }
		 

}
