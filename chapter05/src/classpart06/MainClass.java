package classpart06;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 // 객체화 시킨다.
	 ClassEx06 e06 = new ClassEx06();
	 boolean run = true;
	 e06.name ="Mega Bank";
	 
	 while(run) {
		 System.out.println("---------------");
		 System.out.println("계좌번호\t비밀번호\t계좌잔액");
		 System.out.println("---------------");
		 for(int i=0; i<e06.count; i++) {
			  System.out.println(e06.arAcc[i]+"\t"+e06.arPw[i]+"\t"+e06.arMoney[i]);
		 }
		 System.out.println("---------------");
		 System.out.println("\n["+e06.name+"]");
		 //상태함수 호출함
		 e06.printStatus();
		 System.out.println("[1]회원가입");
		 System.out.println("[2]로그인");
		 System.out.println("[3]로그아웃");
		 System.out.println("[4]입금");
		 System.out.println("[5]이체");
		 System.out.println("[6]잔액조회");
		 System.out.println("[0]종료");
		 System.out.print("선택 :");
		 int sel = scan.nextInt();
		 if(sel==1) {
			 System.out.print("계좌:");
			 String acc = scan.next();
			 System.out.print("비번 :");
			 String pw = scan.next();
			 System.out.print("금액 :");
			 int money = scan.nextInt();
			 //회원 가입함수 호출 함
			 System.out.print(e06.join(acc, pw, money)?"가입 성공":"중복 계좌");
			 System.out.println();
		 }else if(sel == 2) {
			 System.out.print("계좌:");
			 String acc = scan.next();
			 System.out.print("비번 :");
			 String pw = scan.next();
			 //로그인 함수 호출
			 System.out.println(e06.login(acc, pw)?"로그인 성공":"로그인 실패");
		 }else if(sel ==3) {
			 // 로그아웃 함수 호출
			 e06.logout();
			 System.out.println("로그아웃");
		 }else if(sel==4) {
			 //입금 함수 호출
			 // isLogin()메소드가 true를 반환하면 현재 로그인상태 임
			 if(e06.isLogin()) {
				 continue;
			 }
			 System.out.print("입금액:");
			 int money = scan.nextInt();
			 e06.deposit(money);
		 }else if(sel==5) {
			 //이체 함수 호출
			 //로그인된 상태에서만 이체 가능 함
			 if(e06.isLogin()) continue;
			 System.out.print("상대 계좌:");
			 String acc = scan.next();
			 System.out.print("금액 :");
			 int money = scan.nextInt();
			 System.out.println(e06.transfer(acc, money)?"이체 성공":"이체 실패");
			 
		 }else if(sel==6) {
			 // 잔액 조회 함수 호출
			 // 로그인상태에서만 잔액조회 가능
			 if(e06.isLogin()) continue;
			 System.out.println("잔액 :"+e06.getBalance());
		 }else {
			 run = false;
		 }
		 
	 }

	}

}
