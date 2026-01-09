package arrayListEx01;

import java.util.ArrayList;

public class Cart {
   
	// ArrayList<>이용해서 장바구니에 담는 역활을 해야 한다.
	ArrayList<Product> list = new ArrayList<Product>();
	
	// 현재 작성한 Product 클래스는 데이터 타입이다.
	// cart에서 하고싶은 기능 
	// 상품추가, 상품삭제, 상품출력, 상품총계
	
	// 상품 추가함수
	// 매개변수로 Product p의미 => 현재 Product클래스에 멤버변수, 생성자, 메소드
	// p로 접근할 수 있다. p.itemName, p.itemPrice, p.printItem
	public void addProduct(Product p) {
		list.add(p);
	}
	
	//상품 삭제 함수
	//ArrayList<>에서 remove(index)는 반드시 index가 필수이다.
	public void removeProduct(int index) {
		list.remove(index);
	}
	
	//상품 목록 출력
	public void showItem() {
		// 확장 for문 이용
		for(Product p:list) {
			p.printItem();
		}
	}
	
	//총계 구하는 함수
	public int totalPrice() {
		int sum =0;
		for(Product p : list) {
			sum += p.itemPrice;
		}
		return sum;
	}
}
