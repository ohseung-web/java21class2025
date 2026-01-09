package arrayListEx01;

import java.util.ArrayList;
import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {
		// UI 부분
		// 계산 로직, 저장로직... 사용 절제
		Scanner scan = new Scanner(System.in);
		// 인스턴스화 해야 하는 클래스는 Cart이다.
		Cart cart = new Cart();
		// 기본 장바구니 상품 목록 추가
		// ArrayList<Product> list = new ArrayList<Product>();
		// 위의 list 참조변수안에 => 아래의 cart에 상품들이 담겨 있다.
		// ------------------
		// | itemName:사과   |   
		// | itemPrice:1000 |
		// ------------------
		cart.addProduct(new Product("사과",1000));
		cart.addProduct(new Product("바나나",2000));
		cart.addProduct(new Product("망고",5000));
		cart.addProduct(new Product("포도",8000));
		cart.addProduct(new Product("수박",10000));
		
		System.out.println("[장바구니 목록]");
		cart.showItem();
		System.out.println("총 금액 :"+cart.totalPrice());
		System.out.println("------------------");
		
		System.out.print("삭제할 상품 입력");
		int index = scan.nextInt();
		cart.removeProduct(index-1);
		System.out.println("[삭제한 후 장바구니 목록]");
		cart.showItem();
		System.out.println("------------------");
		
		System.out.print("추가할 상품 입력");
		String name = scan.next();
		cart.addProduct(new Product(name,1000));
		System.out.println("[추가한 후 장바구니 목록");
		cart.showItem();
		System.out.println("------------------");
		
	}

}
