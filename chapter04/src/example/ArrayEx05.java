package example;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
//		문제) 학번을 입력받아 성적 출력
//		        단, 없는학번 입력 시 예외처리
//		 예)
//		      학번 입력 : 1002		성적 : 11점
//		      학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		
		System.out.println("학번 입력");
		int hak = scan.nextInt();
		int chk = -1; // 학번이 존재하는지 여부 체크하는 키
		for(int i=0; i<hakbuns.length; i++) {
			// if 기존 배열의 학번과 내가입력한 학번 같은지 조건
			if(hakbuns[i] == hak) {
				chk = i; // 1002 -> 1, 현재 chk=1
			}
		}

		if(chk != -1) {
			System.out.println(hakbuns[chk]);
		}else {
			System.out.println("존재하지 않는 학번 입니다.");
		}
		
	}

}
