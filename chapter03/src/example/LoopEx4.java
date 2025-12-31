package example;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
//		 while  반복문 종료(-100)
//		 1. 무한 반복을 하면서 숫자를 입력 받는다.
//		 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int log = -1;
		// while (조건 ) => true는 무한루프 돈다는 의미
		while (run == true) {
			System.out.print("수를 입력[EXIT: -100");
			num = scan.nextInt();
			if (num == -100) {
				System.out.println("종료");
				run = false;
			}
		}

	}

}
