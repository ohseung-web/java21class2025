package queInterface;

import java.util.ArrayList;

public class Shelf {
   // 멤버 변수
	protected ArrayList<String> shelf;
	
	//생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	// 문자 개수 출력하는 메소드
	public int getCount() {
		return shelf.size();
	}
	
}
