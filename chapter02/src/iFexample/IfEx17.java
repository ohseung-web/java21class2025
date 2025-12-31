package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx17 {

	public static void main(String[] args) {
     
		// 래덤 숫자 1 ~ 50까지
		// 수중에  369에 해당하는 값이 2개이상 :짝짝, 1개:짝, 0:본인수
           

         Random ra = new Random();
         Scanner scan = new Scanner(System.in);
         int rNum = ra.nextInt(100)+1;
         System.out.println("문제 = "+rNum);
         
         //십의 자리 => /10
         int ten = rNum / 10;
         //일의 자리 => % 10
         int one = rNum % 10;
         // 개수를 누적할 변수를 지정
         int cnt = 0;
         
         if(ten==3 || ten==6 || ten==9) {
        	 cnt++;
         }
         if(one==3 || one==6 || one==9) {
        	 cnt++;
         }
         
         if(cnt == 2) {
        	 System.out.println("짝짝");
         }else if(cnt == 1) {
        	 System.out.println("짝");
         }else {
        	 System.out.println(rNum);
         }
	}

}
