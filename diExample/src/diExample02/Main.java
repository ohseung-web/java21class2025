package diExample02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingService gs = new GreetingService();
		gs.greet("홍길동", new KoreanGreeting());
		gs.greet("janny", new EnglishGreeting());
		gs.greet("아사코", new JapaneseGreeting());
	}

}
