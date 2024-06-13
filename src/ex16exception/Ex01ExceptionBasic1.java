package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {
	
	public static void main(String[] args)
	throws IOException
	
	
	{

		/*
		 Syntax에러(구문에러)
		 : 실행 자체가 되지 않는 코드로 오류를 수정해야만 정상적으로 실행된다.
		 즉 코드에 문법적 오류가 발생했음을 의미한다.
		 */
//		Int number =10; ->int를 Int로 표기했음
//		if(true);
//		{}
//		else -> if문이 세미콜론으로 종료되어 의미없는 else문이 됨
//		{}
		
		//위 코드를 정상적으로 수정하면 아래 와 같다.
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		
		/*
		 외부 자원(Java이외)을 사용할때 발생하는 예외
		 처리방법1] 예외가 발생한 지점을 try~catch문으로 직접 감싸서 처리
		 
		 처리방법2] "예외던지기"를 수행한다
		 main메서드에 throws IOException을 기술하면 해당 메서드 내에서
		 발생하는 예외를 프로그램 외부로 던지기 할 수 있다.
		 여기서 던지기의 의미는 예외를 처리하지 않고 무시하겠다는 뜻이다.
		 */
		System.out.print("문자 하나를 입력하세요:");
		try
		{
			int iChar = System.in.read();
			
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}


}
