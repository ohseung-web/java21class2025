package classpart07;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// while()문은 main()메소드에서 작성 할 것
		// main() 계산 로직(X), 저장 로직(X), 처리 로직(X)
		// main()은 => 객체화(인스턴스화), 메소드 호출, 실행순서 정하기를 작성한다.
		
		Scanner scan = new Scanner(System.in);
		ClassEx07 e7 = new ClassEx07(); // 객체화 작업
		//ClassEx07 클래스에 접근 하는 방법
		// 참조변수.멤버변수, 참조변수.메소드
		e7.name ="맥도날드";
		
		//순서정하기
		boolean run = true;
		while(run) {
			e7.printMenu();
			System.out.print("메뉴 선택 :");
			int sel = scan.nextInt();
			
			//메뉴 선택
			if(sel >=1 && sel<=4) {
				e7.order(sel-1); //index는 0부터 시작
			}else if(sel == 5) {
				// 주문 완료 
				if(!e7.hasOrder()) { //false는 주문 안된 상태
					System.out.println("주문 내역이 없습니다.");
					continue;
				}
				// 총금액 함수 호출한다.
				e7.calcTotal();
				System.out.println("총 금액 :"+e7.total+"원");
				System.out.print("지불 금액 :");
				int money = scan.nextInt();
				
				// 지불 금액 부족할때 예외처리
				if(money < e7.total) {
					System.out.println("지불 금액이 부족합니다.");
					continue;
				}
				
				//영수증 출력 함수 호출
				e7.printReceipt(money);
				run=false;
			}
		}
		
		
		
	}

}
