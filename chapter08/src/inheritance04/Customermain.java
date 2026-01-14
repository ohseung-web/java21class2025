package inheritance04;

import java.util.ArrayList;

public class Customermain {

	public static void main(String[] args) {
		//ArrayList<Customer>
		
		ArrayList<Customer> customerlist = new ArrayList<Customer>();
		
		//인스턴스 진행
		Customer c1 = new Customer(10010,"이순신");
		Customer c2 = new Customer(10011,"신사임당");
		GoldCustomer g1 = new GoldCustomer(20010, "홍길동");
		GoldCustomer g2 = new GoldCustomer(20011, "이율곡");
		VIPCustomer v1 = new  VIPCustomer(30010,"김유신",1234);
		
		// 업캐스팅 
		customerlist.add(v1);
		customerlist.add(c1);
		customerlist.add(c2);
		customerlist.add(g1);
		customerlist.add(g2);
		
		System.out.println("========== 고객 정보 =========" );
		for(int i=0; i<customerlist.size(); i++) {
			System.out.println(customerlist.get(i).ShowCustomerInfo());
		}
		
		System.out.println("======== 보너스 포인트와 할인율 결과 =====" );
		int price = 10000;
		for(int i=0; i<customerlist.size(); i++) {
			int money = customerlist.get(i).calcPrice(price);
			System.out.println(customerlist.get(i).customerName+"님이"+money+"지불 하셨습니다.");
			System.out.println(customerlist.get(i).ShowCustomerInfo());
		}
		
		 //상속을 받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.
//		Customer cus02 = new VIPCustomer(0200,"김길동",1010);
//		int money = cus02.calcPrice(10000);
//		System.out.println("지불 금액은"+money+"이고,"+cus02.ShowCustomerInfo());
//		
//        Customer cus = new Customer(0100,"이성계");
//        int price = cus.calcPrice(10000);
//        System.out.println("지불 금액은"+price+"이고,"+cus.ShowCustomerInfo());
	
	
	
	}

}
