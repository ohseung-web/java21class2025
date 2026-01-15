package interfaceTest02;

// 인터페이스는 동시에 두개이상 implements가능
public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
	 System.out.println("구매하기");
	}
	// Buy, Sell의 디폴트 메서드의 이름이 같은 경우
	// 상속 받는 하위 클래스는 반드시 재정의 하여야한다.
	@Override
	public void order() {
		System.out.println("고객의 판매 주문");
	}
	
	
	

}
