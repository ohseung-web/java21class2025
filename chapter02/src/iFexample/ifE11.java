package iFexample;

import java.util.Scanner;

public class ifE11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// /: 나누기(몫) => 지폐개수, %: 나머지 => 잔돈
		
		int money = 0;
		System.out.print("금액을 입력하시오 >>");
		money = scan.nextInt();
		
		int oman = money/50000; // 5만원권 화폐개수
		int charge50000 = money%50000; // 잔돈
		
		int oneman = charge50000/10000;
		int charge10000 = charge50000%10000;
		
		System.out.printf("오만원권 %d매%n 만원권 %d매%n",oman,oneman);
		
        
	}

}
