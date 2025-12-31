package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
//		1. 1~100사이의 랜덤 숫자를 저장한다.
//        2. 저장된 랜덤 숫자를 보여주고,
//        3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.

         Random ra = new Random();
         Scanner scan = new Scanner(System.in);
         
         // 랜덤 숫자 저장하는 변수 지정
         // 100 => 0 ~ 99, ra.nexInt(100)+1 => 1 ~ 100
         int raNum = ra.nextInt(100)+1;
         System.out.printf("문제 [%d]%n1.홀수%n2.짝수%n",raNum);
         System.out.print("번호를 선택하세요 :");
         int select = scan.nextInt();
         
         // 짝수인지 홀수인지 구분하는 로직 
         // => 수 % 2 => 나머지 0이면 짝수, 아니면 홀수
         int selCheck = raNum % 2;
         if((select == 1 && selCheck != 0) || (select==2 && selCheck == 0)) {
        	 System.out.println("정답");
         }else {
        	 System.out.println("오답");
         }
         
	}

}
