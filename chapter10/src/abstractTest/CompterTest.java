package abstractTest;

public class CompterTest {
	public static void main(String[] args) {
		//추상 클래스는 인스턴스화(=객체화) 할 수 없다.
		//Computer com = new Computer();
		//Computer 추상클래스를 상속 받고 있는 하위 클래스의
		// 데이터 타입으로 업캐스팅은 할 수 있다.
		// => 다형성이 성립된다. 
		// 다형성의 성립요건 => 상속, 오버라이딩, 업캐스팅
		Computer com1 = new DeskTop();
		Computer com2 = new MyNoteBook();
		com1.display();
		com1.typing();
		com2.display();
		com2.typing();
	}
}
