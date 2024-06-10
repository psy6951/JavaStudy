package quiz;
/*
업그레이드 구구단
※quiz 패키지에서 작성하세요.

아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.
파일명] QuUpgradeGuGu.java

실행결과]
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 3874204892

 */

 
public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		for(int dan=2 ; dan<=9 ; dan++) {
			for(int su=2 ; su<=9 ; su++) {
				
				double result= Math.pow(dan, su);

				System.out.println(result);
			}
		}
		
//		double result = Math.pow(6, 2);
//		System.out.println(result);
	}
		
}
