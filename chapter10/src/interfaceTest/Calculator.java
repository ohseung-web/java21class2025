package interfaceTest;

// Calc 인터페이스를 상속 받을 때 키워드 implements
public abstract class Calculator implements Calc {

	// implements는 인터페이스 타입을 상속했다라는 의미이다.
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	
 
}
