package ex05method;
/*
		 문제3) 파일명 : QuTemperature.java
		섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로
		변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다
		메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
		공식]
		화씨 = 1.8 * 섭씨 + 32
		섭씨 = (화씨 - 32) / 1.8
 */

public class QuTemperature {
	
//	// 섭씨를 화씨로 변환하는 함수
//    public static double celsiusToFahrenheit(double celsius) {
//        return 1.8 * celsius + 32;
//    }
//
//    // 화씨를 섭씨로 변환하는 함수
//    public static double fahrenheitToCelsius(double fahrenheit) {
//        return (fahrenheit - 32) / 1.8;
//    }
//
//    public static void main(String[] args) {
//        double celsius = 25;
//        double fahrenheit = 77;
//
//        // 섭씨를 화씨로 변환하여 출력
//        System.out.println(celsius + " Celsius is equal to " + celsiusToFahrenheit(celsius) + " Fahrenheit.");
//
//        // 화씨를 섭씨로 변환하여 출력
//        System.out.println(fahrenheit + " Fahrenheit is equal to " + fahrenheitToCelsius(fahrenheit) + " Celsius.");
//    }
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("섭씨 28도=>화씨:"+ celsiusToFahrenheit(28));
//		System.out.println("화씨 98도=>섭씨:"+ fahrenheitToCelsius(98));
		System.out.printf("화씨 98도=>섭씨:%2f", fahrenheitToCelsius(98));
	}
	
	//섭씨를 화씨로...
	public static double celsiusToFahrenheit(double cel) {
		//화씨 = 1.8 * 섭씨 + 32
		return 1.8 * cel + 32;
	}
	//화씨를 섭씨로...
	public static double fahrenheitToCelsius(double fah) {
		//섭씨 = (화씨 - 32) / 1.8
		double cel = (fah -32) -1.8;
		return cel;


	}

}
