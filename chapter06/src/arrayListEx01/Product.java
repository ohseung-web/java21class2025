package arrayListEx01;

public class Product {
	//상품 목록에 필요한 멤버변수 생성
	String itemName;
	int itemPrice;
	
	//생성자
	public Product() {};
	
	//매개변수 생성자
	public Product(String itemName, int itemPrice ) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	//상품 출력 메소드
	public void printItem() {
		System.out.printf("%s : %d원%n",itemName,itemPrice);
	}
}
