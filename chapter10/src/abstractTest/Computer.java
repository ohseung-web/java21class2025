package abstractTest;

//추상 클래스는 반드시 abstract 키워드를 입력한다.
public abstract class Computer {
	
	//추상 클래스 작성이유
	// - 어떻게 구현해야 할지 구체적 방법을 모를때
	//   각 하위 클래스에서 알아서 구현해야 할때 사용한다.
	//추상 클래스는 구현은 하지 않고 선언만 하는 메소드를 작성한다.
	// public abstract display(){body}, => 
	//  body는 코드를 구현하는 부분이다.
	// 구현체가 존재하지 않는 메소드는 추상메소드이다.
	public abstract void display();
	public abstract void typing();

	//모두 공통으로 구현해야 되는 경우는 메소드로 작성한다.
	// 단, body => 코드를 구현하는 구현체까지 작성한다.
	// 구현체가 존재하는 메소드는 추상메소드가 아니다.
	public void turnOn() {
		System.out.println("전원 ON");
	}
	public void turnOff() {
		System.out.println("전원 OFF");
	}
	
}
