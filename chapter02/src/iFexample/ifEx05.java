package iFexample;

import java.util.Scanner;

public class ifEx05 {

	public static void main(String[] args) {
		        //1. 로그인 ==> 1.입금 2.출금 3.조회		
				int cash = 20000; // 입금시 감소 , 출금시 증가
				int balance = 30000; // 입금시 증가 , 출금시 감소 
				int account = 11111; // 로그인시 사용
				int password = 1234; // 로그인시 사용 
				Scanner scan = new Scanner(System.in);
				System.out.println("===MEGA ATM===");
				System.out.println("1.로그인 2.종료");
				int input1 = scan.nextInt();
				
				switch(input1) {
				case 1:// 로그인
					System.out.println("계좌와 비밀번호를 입력하세요");
					int inputAcc = scan.nextInt(); //계좌
					int inputPw = scan.nextInt();   //비밀번호
					if(inputAcc==account && inputPw==password) {
						System.out.println("1.입금  2.출금  3.조회");
						int input2 = scan.nextInt();
						switch(input2) {
						case 1: // 입금
							System.out.println("입금할 금액을 입력하세요");
							int cash2 = scan.nextInt(); //입금할 금액
							if(cash2>cash) {
								System.out.println("현금 잔액이 부족합니다.");
							}else {
								cash -= cash2;
								balance += cash2;
								System.out.println("입금 후 통장잔액 :" +balance+"원");
								System.out.println("입금 후 내 현금 잔액 :" +cash+"원");
							}
							break;
						case 2: //출금
							System.out.println("출금할 금액을 입력하세요");
							int delcash = scan.nextInt();
							if(delcash>balance) {
								System.out.println("통장 잔액이 부족합니다.");
							}else {
								cash += delcash;
								balance -= delcash;
								System.out.println("출금 후 통장잔액 :" +balance+"원");
								System.out.println("출금 후 내 현금 잔액 :" +cash+"원");	
							}
							break;
						case 3:	//조회
							System.out.println("현재 통장잔액 :" +balance+"원");
							System.out.println("현재 내 현금 잔액 :" +cash+"원");
							break;
						}
						break;
					}else {
						System.out.println("아이디와 패스워드를 확인하세요");
					}
					break; 
				case 2: // 종료
					System.out.println("종료");
					break;
				}
				
		
		scan.close();
		
		
		
	}

}
