package multiexample;

import java.util.Scanner;

public class Shoppingmall {

	public static void main(String[] args) {
//		<문제> 쇼핑몰 [장바구니]
//		1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
//		    1) 사과
//		    2) 바나나
//		    3) 딸기
//		2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
//		3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
//		4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
//	    예)
//	{
//			{0, 0},				qwer회원 			> 사과구매
//			{1, 1},				javaking회원 		> 바나나구매
//	 		{2, 0},				abcd회원			> 사과구매
//			{0, 2},				qwer회원			> 딸기구매
//			...
//	}
		// 클래스는 Scanner => 이미 자바 존재하는 클래스이다.
		// 개발자는 존재하진 않는 클래스를 개발하는 것이다.
		// 존재하지 않는 함수를 생성하고, 만드는 것이다.
		Scanner scan = new Scanner(System.in);
//		Scanner scan2 = new Scanner(System.in);
//		Scanner scan3 = new Scanner(System.in);
		// 인스턴스화  = 객체화 한다.
		// Heap 메모리에 각각의 객체의 주소가 다 다르게 저장됨
		
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "사과", "바나나", "딸기" };
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		// 회원별, 상품별 개수를 담는 변수
		// int[] = new int[3] => 초기값은 모두 0
		int[][] cartCount  = new int[ids.length][items.length];
	    
	
		// 로그인 체크키
		int log = -1;
		// 아이템을 사는 개수
		int count=0;
		
		boolean run = true;
		while (run) {
			// 로그인 상태 관리 부분
				System.out.println("------------");
				System.out.print("상테 :");
				if(log == -1) {
					System.out.println("로그아웃");
				}else {
					System.out.println(ids[log]);
				}	
				System.out.println("------------");	
			// 메뉴 출력 부분
			System.out.println("-----------");
			System.out.println("[GREEN MART]");
			System.out.printf("[1]로그인%n[2]로그아웃%n[3]쇼핑%n[4]장바구니%n[5]전체출력%n[0]종료%n");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) { //로그인 부분
				System.out.print("ID입력:");
				String myId = scan.next();
				System.out.print("PW입력:");
				String myPw = scan.next();
				
				// 로그인 성공 boolean
				boolean loginSuccess = false;
				for(int i=0; i<ids.length; i++) {
					if(ids[i].equals(myId) && pws[i].equals(myPw)) {
						log = i;
						loginSuccess = true;
						break;
					}
				}
				if(loginSuccess) {
					System.out.println(ids[log]+"님 환영합니다.");
				}else {
					System.out.println("아이디와 비밀번호를 확인해주세요");
				}
				
			} else if (sel == 2) { //로그아웃
				log = -1;
				System.out.println("로그아웃 되었습니다.");

			} else if (sel == 3) { //쇼핑
				//쇼핑몰 출력 => 반드시 로그인 후 장바구니 확인
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}
				// 쇼핑목 반복
				// [1]사과 [2]바나나 [3]딸기 => 반복 출력
				// while()문 이용한다.
				while(run) {
					System.out.println("[상품목록]");
					for(int i=0; i<items.length; i++) {
						System.out.printf("[%d]%s%n",(i+1),items[i]);
					}
					System.out.println("[4]뒤로가기");
					System.out.print("상품번호를 선택하세요:");
					int itemNum = scan.nextInt();
					if(itemNum == 4) {
						//뒤로가기
						break;
					}
					
					// max_size 100이 넘어가면 예외처리하기
					if(count == MAX_SIZE) {
						System.out.println("장바구니가 찼습니다.");
						break;
					}
					
					// ids별 쇼핑한 items별들의 개수를 cartCount에 담는다.
					// 장바구니 0번째열에 log인한 index 번호를 담는다.
					jang[count][0] = log;
					// 장바구니 1번째열에 내가 산 item index 번호를 담는다.
					jang[count][1] = itemNum -1;
					//id별 쇼핑한 item들의 개수를 item별로 cartCount 담는다.
					// cartCount[log][itemNum-1] = cartCount[log][itemNum-1] + 1
					// log=0,회원 qwer, itemNum-1 =>0 , 상품 사과
					// cartCount[0][0] =  cartCount[0][0] +1 
					cartCount[log][itemNum-1]++;
					count++;
				}

			} else if (sel == 4) { //장바구니 출력
				// 내 장바구니는 로그인 상태에서만 출력 가능
				if(log == -1) {
					System.out.println("로그인 후 이용 가능");
				}else {
					System.out.println("-- 내 장바구니 목록 --");
					for(int i=0; i<items.length; i++) {
						System.out.println(items[i]+": "+cartCount[log][i]+"개");
					}
					// cartCount에 담긴 수량 확인하는 코드 부분
					System.out.println("------------------");
					 for(int i=0; i<cartCount.length; i++) {
				    	 for(int j=0; j<cartCount[i].length; j++) {
				    		 System.out.print(cartCount[i][j]+" ");
				    	 }
				    	 System.out.println();
				     }
					// cartCount에 담긴 수량 확인하는 코드 부분 종료
				}

			} else {
				// [0]프로그램 종료
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		
		scan.close();
	}

}
