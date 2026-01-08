package classpart07;

public class ClassEx07 {
  // 멤버 변수, 생성자, 기능 메서드 작성
  // 멤버 변수 이면서 전역 변수 이다.	
	int[] arPrice = { 2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	String name;

	// 객체 생성 시  초기화에 필요한 디폴트 생성자
	// 생성자 반드시 클래스이름과 동일해야 함
	public ClassEx07() {};
	
	//메뉴 출력 
	// void는 반환할 값이 없는 메소드 생성할때 사용한다.
	public void printMenu() {
		System.out.println("\n["+name+"]");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1)+":"+arMenu[i]+"("+arPrice[i]+"원)");
		}
		System.out.println("5. 주문하기");
	}
	
	// 주문 추가 함수
	public void order(int sel) {
		arCount[sel]++;
		System.out.println(arMenu[sel]+"추가됨");
	}
	
	// 총 금액 계산 함수
	public void calcTotal() {
		total = 0;
		for(int i=0; i<arMenu.length; i++) {
			total += (arPrice[i]*arCount[i]);
		}
	}
	
	// 주문 여부를 확인하는 함수
	// 반환할 값이 필요한 경우 반드시 데이터 타입으로 메소드를 작성한다.
	public boolean hasOrder() {
		for(int i=0; i<arMenu.length; i++) {
			if(arCount[i] > 0) {
				return true; //주문 됨
			}
		}
		return false; // 주문 안됨
	}
	
	//영수증 출력하는 함수
	public void printReceipt(int money) {
		System.out.println("====== 영수증 ======");
		System.out.println("매장명 :"+name);
		System.out.println("-------------------");
		System.out.println("메뉴\t수량\t금액");
		
		for(int i=0; i<arMenu.length; i++) {
			if(arCount[i] > 0) {
				System.out.println(arMenu[i]+"\t"+arCount[i]+"\t"+(arPrice[i])*arCount[i]);
			}
		}
		
		System.out.println("-------------------");
		System.out.println("총 금액 :"+total);
		System.out.println("받은 돈 :"+money);
		System.out.println("잔   돈 :"+(money - total));
		System.out.println("-------------------");
	}
	
	
	
	
	
}
