package example;

import java.util.Scanner;

public class LoopEx9 {

	public static void main(String[] args) {
		/*
		 * # ATM[2단계]
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 * 3. 입금
		 * . 로그인 후 이용가능
		 * 4. 출금
		 * . 로그인 후 이용가능
		 * * 5. 이체
		 * . 로그인 후 이용가능
		 * 6. 조회
		 * . 로그인 후 이용가능
		 * 7. 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	

	    int log = -1; // -1(로그아웃),1(dbAcc1로그인),2(dbAcc2로그인)
	    boolean run = true;
	    
	    while(run) {
			System.out.println("dbMoney1 = " + dbMoney1 + "원");
			System.out.println("dbMoney2 = " + dbMoney2 + "원");
			// ===== 상태관리 시작
			System.out.print("상태 :");
			if (log == -1) {
				System.out.println("로그아웃");
			} else if (log == 1) {
				System.out.println(dbAcc1 + "로그인");
			} else {
				System.out.println(dbAcc2 + "로그인");
			}
			// ========= 상태관리 종료
			System.out.printf("1.로그인%n2.로그아웃%n3.입금%n4.출금%n5.이체%n6.조회%n0.종료%n");
	    	    System.out.print("메뉴 선택 :"); 
	    	    int sel = scan.nextInt();
	    	    
	    	    // 메뉴선택 부분
	    	    if(sel == 1) { //로그인 선택
	    	    	if(log == -1) { //현재 로그 아웃 상태
	    	    		System.out.println("계좌번호 입력 :");
	    	    		int myAcc=scan.nextInt();
	    	    		System.out.println("비밀번호 입력 :");
	    	    		int myPw=scan.nextInt();
	    	    		if(myAcc==dbAcc1 && myPw==dbPw1) {
	    	    			log = 1;
	    	    			System.out.println(dbAcc1+"님 환영");
	    	    		}else if(myAcc==dbAcc2 && myPw==dbPw2) {
	    	    			log = 2;
	    	    			System.out.println(dbAcc2+"님 환영");
	    	    		}else {
	    	    			System.out.println("계좌 및 비밀번호 확인");
	    	    			System.out.println();
	    	    		}
	    	    		
	    	    	}else {
	    	    		System.out.println("로그인 중....");
	    	    	}// 로그인 메뉴처리 끝
	    	    }else if(sel==2) { //로그아웃 메뉴
	    	    	if(log != -1) { //현재 로그인 상태
	    	    		log = -1;
	    	    		System.out.println("로그아웃 되었습니다.");
	    	    		System.out.println();
	    	    	}else {
	    	    		System.out.println("로그인 후 이용가능");
	    	    		System.out.println();
	    	    	}
	    	    	// 로그아웃 메뉴 끝
	    	    }else if(sel ==3) {
	    	    	
	    	    }else if(sel==4) {
	    	    	
	    	    }else if(sel==5) {
	    	    	
	    	    }else if(sel==6) {
	    	    	
	    	    }else {
//	    	    	시스템 종료
	    	    	run=false;
	    	    	System.out.println("프로그램 종료");
	    	    }
	    	
	    }
	    
	    scan.close();
	}

}
