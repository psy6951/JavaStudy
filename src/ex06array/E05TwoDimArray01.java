package ex06array;

import ex01start.E02SystemOutPrintln;

public class E05TwoDimArray01 {

	public static void main(String[] args) {
		
		//1차원 배열 생성
		int[] arr2 = new int[5];
		//0번 요소만 1로 초기화한다.
		arr2[0] =1;
		
		//배열명을 출력하면 참조값이 나온다.
		System.out.println("arr2 배열명 출력:"+ arr2);
		//0번 인덱스는 1이 출력
		System.out.println("arr2[0] 원소 출력:"+ arr2[0]);
		//초기화하지 않은 요소는 0이 출력된다.
		System.out.println("arr2[3] 원소 출력:"+ arr2[3]);
		
		/*
		 아래와 같이 2차원 배열을 초기화하면 3행 4열짜리 배열이 생성된다.
		 초기화할 원소가 없는 부분은 null로 채워진다.
		 
		 *null값: 아무것도 없는 값을 일컫는다. 즉 빈값을 말한다.
		 		스페이스와 같은 공백문자 혹은ㅇ 0과는 다르다는 것에 주의하자
		 */
		
		//2차원 배열 생성 및 초기화
		int[][] arr= {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		/*
		 2차원 배열에서는 배열변수.length를 통해 전체 행의 크기를 확인할 수 있다.
		 */
		System.out.println("배열의 세로크기:"+ arr.length); //3 출력
		System.out.println("배열명이 가진값 출력(arr):"+ arr); //참조값 출력
		
		//각 행의 크기를 출력하기 위해 반복한다.
		for(int i=0 ; i<arr.length ; i++) {
			/* 2차원 배열에서 각 행의 크기는 배열명[인덱스]를 사용한다.*/
			System.out.printf("%d행의 크기:%d\n", i, arr[i].length);
			//각행의 참조값을 출력한다.
			System.out.printf("%d행 출력: %s\n", i, arr[i]);
		}
		
		/*
		 2차원 배열에서 특정 요소에 접근하기 위해서는 2개의 배열기호가 필요하다.
		 또한 값이 없는 원소, 즉 null로 채워져있는 부분을 출력하면 예외가 발생한다.
		 배열의 인덱스를 초과했다는 에러가 발생하면서 실행이 종료된다.
		 */
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]="+arr[0][1]);
		System.out.println("arr[0][3]="+arr[0][3]); //예외발생 
	}

}
