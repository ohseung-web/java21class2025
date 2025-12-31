package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
//       [문제]
//		 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
//		 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
//		 3. 위 숫자는 연산자 기호에 해당된다.
//		     1) 덧셈   2) 뺼셈   3) 곱셈	 4) 나머지
//		 4. 사용자는 연산자 기호를 맞추는 게임이다.

         Random ra = new Random();
         Scanner scan = new Scanner(System.in);
         
         //왼쪽 수
         int lNum = ra.nextInt(10)+1;
         //오른쪽 수
         int rNum = ra.nextInt(10)+1;
         //계산결과 값
         int result =0;
         // answer의 역할 => 1)+ 2)- 3)* 4)%
         int answer = ra.nextInt(4)+1;
      
//         +, -, * ,% 구하는 식을 계산
         if(answer==1) {
        	    result = lNum+rNum;
         }else if(answer==2) {
        	    result = lNum - rNum;
         }else if(answer==3) {
				result = lNum * rNum;
		 }else if(answer==4) {
			result = lNum % rNum;
		 }
         
         System.out.printf("%d ? %d = %d%n",lNum,rNum,result);
         System.out.println("1)+  2)-  3)*  4)%");
         System.out.print("번호를 선택하세요 :");
         int myAnswer = scan.nextInt();
         
         if(answer == myAnswer) {
        	 System.out.println("정답");
         }else {
        	 System.out.println("오답");
         }
         
         
         
         
         
	}

}
