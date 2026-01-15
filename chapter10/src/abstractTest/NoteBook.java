package abstractTest;

// 부모 추상 클래스 Computer에서 상속받은 추상 메소드 일부만 구현하기 원하면
// 반드시 abstract 키워드를 입력하여 추상 클래스임을 명시하여야 한다.
public abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook display()---");
	}

	

}
