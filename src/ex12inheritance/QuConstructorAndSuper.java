package ex12inheritance;
/*
 문제1) 파일명 : QuConstructorAndSuper.java
상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를
삽입해보자. 그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
샘플코드]
class Car
{
int gasoline;
}
class HybridCar extends Car
{
int electric;
}
class HybridWaterCar extends HybridCar
{
int water;
public void showNowGauge()
{
System.out.println("남은가솔린:"+gasoline);
System.out.println("남은전기량:"+electric);
System.out.println("남은워터량:"+water);
}
}
public class QuConstructorAndSuper {
public static void main(String[] args)
{
HybridWaterCar hcar = new HybridWaterCar(10,20,30);
hcar.showNowGauge();
}
}
실행결과]
남은가솔린:10
남은전기량:20
남은워터량:30
 */
class Car
{
int gasoline;
}
class HybridCar extends Car
{
int electric;
}
class HybridWaterCar extends HybridCar
{
int water;
public void showNowGauge()
{
System.out.println("남은가솔린:"+gasoline);
System.out.println("남은전기량:"+electric);
System.out.println("남은워터량:"+water);
}
}
public class QuConstructorAndSuper {
public static void main(String[] args)
{
HybridWaterCar hcar = new HybridWaterCar(10,20,30);
hcar.showNowGauge();
}
}
