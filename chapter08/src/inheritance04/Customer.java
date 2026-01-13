package inheritance04;

//부모 클래스
public class Customer {
  
	//고객 등급기본 생성자에서 지정되는 기본 등급은 SILVER입니다.
	// 고객의 보너스 포인트- 고객이 제품을 구매할 경우 누적되는 보너스 포인트입니다.
	// 기본 생성자에서 지정되는 적립 비율은 1%입니다. 즉, 10,000원을 사면 100원이 적립됩니다.
	
	// 멤버 변수
	protected int customerID; // 고객ID
	protected String customerName; // 고객이름
	protected String customerGread; // 고객등급
	int bonusPoint; // 고객 보너스 포인트
	double bonusRatio; // 고객의 포인트 적립비율
	
	//디폴트 생성자
	public Customer() {
		customerGread = "SILVER";
		bonusRatio = 0.01;
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGread = "SILVER";
		bonusRatio = 0.01;
	}
	
	// 메소드
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price;
	}
	
	//출력 메소드
	public String ShowCustomerInfo() {
		return customerName + "님의 등급은"+customerGread+"이며, 보너스 포인트는 "+ bonusPoint+"입니다.";
	}
	
	
	
	
	
	
	
	
	
}
