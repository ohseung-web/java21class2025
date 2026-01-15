package abstractTest;

class define{
	public static final int MIN = 1;
	public static final int MAX = 9999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MONING = "good moning";
}

public class FinalTest {

	public static void main(String[] args) {
		// Final 예약어
		// final 변수는 값이 변경될 수 없는 상수이다.
		// 예) public static final double pi = 3.14
		//  재할당할 수 없다. pi = 3.0 (X)
		//  final a = 20;
        // final 메소드는 하위 클래스에 재정의 할 수 없다.
		// final 클래스는 상속되지 않는다.
		// final 선언과 동시에 할당하거나 또는 생성자에서 한번만 할당 가능하다.
		
		// static키워드로 작성된 변수는 인스턴스 하지 않아도 접근 가능하다.
		System.out.println(define.GOOD_MONING);
		System.out.println("영어과목 코드는"+define.ENG+"입니다.");
		System.out.println("수학과목 코드는"+define.MATH+"입니다.");
		
		//define.PI = 3.1; //final 재할당 안됨
		double num = define.PI * 1000;
		System.out.println(num);
	}

}
