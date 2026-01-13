package inheritance04;

public class VIPCustomer  extends Customer{
	//멤버 변수
	protected int agentId;//상담번호
	double salePoint;//할인율
	
	//생성자
	public VIPCustomer() {};
	public VIPCustomer(int customerID, String customerName,int agentId) {
		super(customerID, customerName);
//		super.customerID = customerID;
//		super.customerName = customerName;
		customerGread ="VIP";
		bonusRatio = 0.05;
		this.agentId =agentId;
		this.salePoint = 0.1;
	};
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		// int로 명시적 형변환을 한다. 이유는: 멤버변수에 데이터 타입이 double이기때문
		return price - (int)(price* salePoint);
	}
	
	@Override
	//출력 메소드
		public String ShowCustomerInfo() {
			return super.ShowCustomerInfo() + "\n, 담당 전문 상담은:"+agentId+"번 입니다.";
		}
		
    
}
