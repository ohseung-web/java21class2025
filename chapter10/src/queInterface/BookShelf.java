package queInterface;

// Shelf가 Queue를 implements
// BookShelf가 Shelf extends 받을 예정
// 실무에서 많이 사용하는 방식이다.
public class BookShelf extends Shelf implements Queue{

	@Override
	public void inQueue(String title) {
		//맨 뒤로 넣기
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		//꺼네기 => 삭제
		// ArrayList<>는 삭제되고나면 뒤 데이터 앞으로 이동
		return shelf.remove(0);// 제일 첫 번째 자료를 삭제
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
