package iFexample;

import java.util.Scanner;

public class ifEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		System.out.print("성적을 입력하세요(0-100:");
		score = scan.nextInt();
		
		if(score <0 || score >100 ) {
			System.out.println("성적을 잘못 입력하였습니다.");
		}else if(score >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
        
	}

}
