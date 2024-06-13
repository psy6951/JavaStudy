package ex16exception;

import java.io.IOException;

public class Ex03ExceptionCase3 {
	
	static void compileFunc() throws IOException
	/*
	 예외처리방법3

	 예외가 발생한 지점에서는 처리하지 않고 예외던지기를 한다.
	 대신 메서드릃 호출한 지점에서 예외인스턴스를 받은 후 try~catch로 처리한다.
	 */
	{
		System.out.println("하나의 문자를 입력하세요:");
		int userChr = System.in.read();
		System.out.println("입력한 문자는: "+(char)userChr);
	}
	public static void main(String[] args) 
	{
		try {
			compileFunc();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("끝!!!");

	}

}
