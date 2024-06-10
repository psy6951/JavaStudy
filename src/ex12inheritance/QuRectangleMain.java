package ex12inheritance;
/*
 문제3) QuRectangleMain.java
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의
소스를 참조하여 구현하시오.
샘플코드]
//직사각형을 표현한 클래스
class Rectangle
{
//블라블라
}
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
//블라블라
}
class QuRectangleMain {
public static void main(String[] args) {
Rectangle rec = new Rectangle(4, 3);
rec.showAreaInfo();
Square sqr = new Square(7);
sqr.showAreaInfo();
}
}
실행결과]
직사각형 면적: 12
정사각형 면적: 49
 */


//직사각형을 표현한 클래스
class Rectangle {
    // 멤버변수: 가로와 세로길이를 표현
    private int width;
    private int height;

    // 생성자를 통해 멤버변수(가로, 세로)를 초기화
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 면적을 계산하고 출력하는 메소드
    public void showAreaInfo() {
        int area = width * height;
//        System.out.println("직사각형 넓이: " + area);
        System.out.println("직사각형 넓이: " + (this.width * this.height));

    }
}

// 정사각형을 표현하는 클래스 (정사각형은 직사각형의 일종)
class Square extends Rectangle {
	
	/*
	 직사각형은 가로, 세로 두변의 길이가 서로 다르므로 2개의 멤버변수가 필요하다.
	 하지만 정사각형은 길이가 동일하므로 1개의 값으로 2개의 멤버변수를 초기화할 수있다.
	 즉 해당 클래스는 멤버변수의 확장이 필요하지 않다.
	 */
    // 정사각형의 한 변의 길이를 저장하는 변수
    private int w;

    // 생성자를 통해 한 변의 길이를 초기화
    public Square(int w) {
        // 부모 클래스의 생성자를 호출하여 가로와 세로를 동일한 값으로 초기화
        super(w, w);
    }
    public void showAreaInfo() {
        int area = w * w;
    }
        System.out.println("정사각형 면적: " + (super.width*super.height));
      
}
class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
 	}
}
