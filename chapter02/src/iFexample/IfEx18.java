package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
     
         Scanner scan = new Scanner(System.in);
         // 정거장 수 변수 
         System.out.print("이용할 정거장 수를 입력하세요 :");
         int station = scan.nextInt();
         int fee =0;
         
         if(station>0 && station<=5) {   // 1 ~5 , 500원
        	    fee = 500;
         }else if(station>=6 && station<=10) { // 6 ~ 10 , 600원
        	    fee = 600;
         }else { // 11 ~ 이후, 2정거장씩 50원추가
//        	   11, 13, 15, 17, 19...홀수역
        	 //    12, 14, 16, 18, ....짝수역
        	     if(station % 2 ==1) { //홀수역일때
        	    	    fee=600;
        	    	    // station = 13 + (13-10)/2 =1
        	    	    int feeadd =(station-10)/2 * 50;
        	    	    // 홀수 일때 50원이 적게 계산 되므로
        	    	    // 50원을 더해주는 코드
        	    	    fee = fee + feeadd + 50;
        	     }else if(station % 2 == 0) { //짝수역일때
        	    	    fee = 600;
        	    	    int feeadd=(station-10)/2*50;
        	    	    fee = fee + feeadd;
        	     }
         }
         
         System.out.println("요금 ="+fee+"원");
	}

}
