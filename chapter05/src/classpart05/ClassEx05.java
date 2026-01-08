package classpart05;

import java.util.Random;

public class ClassEx05 {
	int[] answer = { 1, 3, 4, 2, 5 }; // 모범답안
	int[] hgd = new int[5];
	int score = 0;
	
	//디폴트 생성자
	public ClassEx05() {};

	// 래덤하게 내답안을 출력하는 함수
	public void makeRandom() { 
		Random ran = new Random();
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
		}
	}

	// 모범답안, 랜덤한 내답안, 정오표, 점수를 출력하는 함수
	public void printResult() {
		System.out.print("정답 : ");
		// 확장 for문이라 한다.
		// 확장 for문 사용 방법
		// for(자료형 변수 : 배열){ 실행문; }
		// 확장 for문의 장점
		// 1. index를 사용하지 않는다.
		// 2. 코드가 짧다
		// 3. 요소를 하나씩 처리 한다.
		
		// int[] answer = { 1, 3, 4, 2, 5 }
		// answer 배열에서 값을 하나 꺼내서 n에 담고 출력
		// 배열이 끝날때까지 계속 순회한다.
		// 단, index를 가져올 수 없기때문에 배열방의 값을
		// 비교할 때는 사용 불가한다.
		for (int n : answer) 
			System.out.print(n + " ");

		System.out.print("\n응답 : ");
		for (int n : hgd)
			System.out.print(n + " ");

		System.out.print("\n정오표 : ");
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == hgd[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("\n성적 : " + score);
	}
}
