package abstractTest;

public class DeskTop extends Computer {

	@Override //"부모 메소드를 상속 받아 재정의 한다"라는 의미이다.
	public void display() {
		System.out.println("DeskTop display()---");
	}

	@Override
	public void typing() {
	System.out.println("DestkTop typing()----");
	}

}
