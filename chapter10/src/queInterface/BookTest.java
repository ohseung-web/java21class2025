package queInterface;

public class BookTest {

	public static void main(String[] args) {
		// Queue 데이터 타입으로 업캐스팅
		Queue qshelf = new BookShelf();
		//문자 삽입: FIFO
		// ---------------
    //<--- A | B | C | D      <----
		// --------------- 
		qshelf.inQueue("A");
		qshelf.inQueue("B");
		qshelf.inQueue("C");
		qshelf.inQueue("D");
		System.out.println(qshelf.deQueue());
		System.out.println(qshelf.deQueue());
		System.out.println(qshelf.deQueue());
		System.out.println(qshelf.deQueue());
	}

}
