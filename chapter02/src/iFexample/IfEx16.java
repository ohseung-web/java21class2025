package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
//		가운데 숫자 맞추기 게임
//		1. 150~250 사이의 랜덤 숫자 저장
//		2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다
//		     예)   249  : 4


         Random ra = new Random();
         Scanner scan = new Scanner(System.in);
         int rNum = ra.nextInt(100)+150;
         System.out.println("문제 = "+rNum);
         
         // 가운데 숫자를 추출하는 식
         // 250=> (250 % 100)/10
         int answer = (rNum % 100)/10; // 가운데 수 추출
         System.out.print("가운데 숫자를 입력하세요 :");
         int inputanswer = scan.nextInt();
         
         if(answer == inputanswer) {
        	 System.out.println("정답");
         }else {
        	 System.out.println("오답");
         }
         
	}

}
