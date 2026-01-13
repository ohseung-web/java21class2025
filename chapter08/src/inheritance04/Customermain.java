package inheritance04;

public class Customermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속을 받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.
		Customer cus02 = new VIPCustomer(0200,"김길동",1010);
		int money = cus02.calcPrice(10000);
		System.out.println("지불 금액은"+money+"이고,"+cus02.ShowCustomerInfo());
		
        Customer cus = new Customer(0100,"이성계");
        int price = cus.calcPrice(10000);
        System.out.println("지불 금액은"+price+"이고,"+cus.ShowCustomerInfo());
	}

}
