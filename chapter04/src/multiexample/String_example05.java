package multiexample;

import java.util.Scanner;

public class String_example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//객체 데이터 타입의 기본값은 null이다.
		String[][] items = new String[100][2];
		
		// null값을 해결하기위해 공백으로 초기화 함
		for(int i=0; i<items.length; i++) {
			 for(int j=0; j<items[i].length; j++) {
				 items[i][j] ="";
			 }
		}
		
		// 0번째열은 카테고리, 1뻔째 열은 아이템 
		boolean run = true;
		int itemCount = 0; // 아이템 개수
		while(run) {
			System.out.println();
			System.out.println("[관리자 모드]");
			System.out.printf("[1]카테고리 관리%n[2]아이템 관리%n[3]전체품목 출력%n[0]종료%n");
			System.out.print("관리자 모드를 선택 :");
			int sel = scan.nextInt();
			
		if(sel>=0 && sel <=3) {
			if(sel == 1) {
				//카테고리 관리 => [0]과일류 , [1]생선류,  [2]어류....
				System.out.print("추가할 카테고리 입력 :");
				String categoryName = scan.next();//문자 입력 메소드
				items[itemCount][0] = categoryName;
				itemCount ++; 
				
			}else if(sel ==2) {
				// [0]과일류 출력하는 코드
				for(int i = 0; i<itemCount; i++) {
					System.out.printf("[%d] %s%n",i,items[i][0]);
				}
				System.out.print("카테고리를 선택하세요:");
				int choice = scan.nextInt(); //0, 1, 2, 3...
				System.out.print("추가할 아이템을 입력하세요:");
				String addItem = scan.next();
				items[choice][1] += addItem;
				items[choice][1] += "/";
				
			}else if(sel ==3) {
				
				for(int i=0; i<itemCount; i++) {
					System.out.printf("%s: %s%n",items[i][0],items[i][1]);
				}
				
			}else {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}else {
			System.out.println("선택을 다시하세요");
		}
			
		}
		
	}

}
