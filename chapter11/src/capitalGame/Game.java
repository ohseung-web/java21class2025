package capitalGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	//HashMap<>은 순서가 없다, 저장도 순서가 없다.
	HashMap<String, String> hashCapital = new HashMap<>();
	
	//생성자
	// 자바는 저장하고, 컴파일하면 JVM이 제일먼저 로드하는 것은
	// 디폴트 생성자 이다.
	public Game() {addNation();}
	//나라이름, 수도 저장하는 메소드
	public void addNation() {
		hashCapital.put("한국", "서울");
		hashCapital.put("미국", "워싱턴DC");
		hashCapital.put("중국", "베이징");
		hashCapital.put("프랑스", "파리");
		hashCapital.put("일본", "도쿄");
		hashCapital.put("스페인", "마드리드");
	}
	
	// game menu  메소드 생성
	public void gamemenu() {
		boolean run = true;
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		while(run) {
			System.out.print("입력: 1, 쿠즈: 2, 종료: 3 >>");
			// 숫자만 읽고 엔터를 남긴다. \n
			int select = scan.nextInt(); 
			
			switch(select) {
			case 1:
			    //게임 나라/수도 삽입 메소드 
				insertNation();
			    break;
			case 2:
			   // 게임 Start 메소드
				gameStart();
			   break;
			case 3:
			   System.out.println("게임을 종료 합니다.");
			   run=false;
			   break;
			}
		}
	}
	//-------------------------------------------
	
	//게임 나라/수도 삽입 메소드 
	public void insertNation() {
		//int cnt = hashCapital.size();
		// 입력을 문자를 받아야 하므로 
		// scan.nextInt()의 이슈인 \n이 남는 상황을 제거해야함
		scan.nextLine(); // 이전 입력 버퍼정리 됨.
	    System.out.println("현재 "+hashCapital.size()+"개 나라의 수도가 입력되었습니다.");
	
	    while(true) { // while은 true일때 무한반복 됨
	    	  System.out.println("나라의 수도 입력"+(hashCapital.size()+1)+" >>");
	    	  //cnt++;
	    	  String nation = scan.nextLine();
	    	  // 그만이라 입력하면 삽입 종료
	    	  if(nation.equals("그만")) break;
	    	  //입력된 문자를 구분자를 기준으로 잘라서 담아주는 클래스
	    	  StringTokenizer st = new StringTokenizer(nation);
	    	  //  한국 서울 => 한국, 서울
	    	  String na = st.nextToken().trim(); //나라
	    	  String ca = st.nextToken().trim(); //수도
	    	  
	    	  //이미 저장된 나라와 수도가 존재하면 예외 처리 한다.
	    	  if(hashCapital.containsKey(na)) { // 같은 나라 존재시 true,아니면 false
	    		  System.out.println("이미 존재합니다.");
	    		  continue;
	    	  }
	    	  
	    	  // HashMap<> 저장
	    	  hashCapital.put(na, ca);
 	    }
	}
	
	//-----------------------------------------
	
	// 게임 Start 메소드
	// 삽입한 나라이름을 배열로 전환하는 이슈
	// 삽입된 나라이름이 랜덤하게 문제에 출제되어야 하는 이슈
	public void gameStart() {
		while(true) {
			//ArraList<>의 매개변수로 hashCapital.keySet()의 나라를 사용
			ArrayList<String> nations = new ArrayList<>(hashCapital.keySet());
			// [한국, 중국, 일본....]
			System.out.println(hashCapital.keySet());
			// 랜덤하게 나라이름이 출력되는 문제를 만든다.
			int index = ran.nextInt(hashCapital.size());
			// nations.get(index) => get()은 ArrayList 메소드로 추출하다
			// question => 한국
			String question = nations.get(index);
			// answer = hashCapital.get("한국") =>
			// 위의 의미는 key값이 "한국"인 value값을 출력한다.
			String answer = hashCapital.get(question);
			
			System.out.print(question + "의 수도는 >>");
			String myAnswer = scan.next();
			
			if(myAnswer.equals("그만")) {
				break;
			}else if(answer.equals(myAnswer)) {
				System.out.println("정답!");
			}else {
				System.out.println("아닙니다.!");
				continue;
			}
		}
	}
	
	
	
	
}
