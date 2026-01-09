package arrayListEx03;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Player클래스 ArrayList<> 제너릭의 데이터 타입으로 정의 한다.
		ArrayList<Player> players = new ArrayList<Player>();
		// players[0] = "홍길동"
		// players[1] = "개나리"
		// players[2] = "진달래"
		
		System.out.print("참가수를 입력하세요:");
		int cnt = scan.nextInt(); //참가수
		
		//참가자 생성
		for(int i=0; i<cnt; i++) {
			//[1]홍길동
			System.out.print((i+1)+"번 참가자 이름 :");
			String name = scan.next(); // 개나리
			//ArrayList<>에 추가하는 함수 add()
			// players[0] = "홍길동"
			players.add(new Player(name));
		}
		System.out.println();
		System.out.println("게임 시작");
		String startWord = "아버지";
		System.out.println("현재 단어:"+startWord);
		
		// [1]홍길동 >> -> [2]개나리 ->[3]진달래
		int turn = 0; // 현재 차례순서를 의미한다.
		
		while(true) {
			// Player클래스 데이터 타입
			// ArrayList<>에서 원하는 인덱스 값 출력하는 메소드  get(index)
			Player currentPlayer = players.get(turn);
			String nextWord = currentPlayer.sayWord(scan);
			
			// 끝말잇기 체크 
			// 데이터 타입 => 한음절 만 char
			char lastChar = startWord.charAt(startWord.length()-1);
			char firstChar = nextWord.charAt(0);
			
			if(lastChar != firstChar) {
				System.out.println("게임 종료");
				System.out.println("진 참가자:"+currentPlayer.name);
				break;
			}
			
			//단어 교체
			startWord = nextWord;
			turn++;
			
			// 순서가 끝나면 다시 처음으로 돌아가기
			if(turn == players.size()) {
				turn =0;
			}
		}
	}

	
	
	
}
