package interfaceTest;

// Calculator 추상 클래스를 extends로 상속 받는다.
public class CompleteCalc extends Calculator {
	// extends는 구현체를 상속한다라는 의미이다.

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}

	// 출력 메소드 생성
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하겠습니다.");
	}
	
}
