package otShop;

import java.util.Scanner;

// User 클래스를 extends(상속)받아라
public class UserMenu extends User {
  // 상속받은 User클래스 멤버변수, 생성자, 메소드 
  // 인스턴스화(=객체화)를 하지 않아도 접근 가능
  Scanner scan = new Scanner(System.in);
  int cnt = id.length; // 전체유저 수(6명)
  static int logindex; // 로그인한 유저 index(다른 클래스와 공유)
  
  // 사용자 로그인 메소드
  public int userLog() {
	  // 부모 클래스의 멤버 변수 접근할 때 사용하는 키워드:super
	  int log = super.log;//부모인 User클래스의 로그인상태 사용
	  System.out.print("ID입력");
	  String myId = scan.next();
	  System.out.print("PW입력");
	  String myPw = scan.next();
	  
	  //id, pw로 로그인 성공과 실패를 작성
	  for(int i=0; i<cnt; i++) {
		  if(myId.equals(id[i]) && myPw.equals(pw[i])) {
			  log = i;// 로그인 성공 -> 해당 index 저장
		  }
	  }
	  
	  // if문으로 비교
	  if(log < 0) {
		  System.out.println("아이디와 비밀번호 확인 요망");
	  }else if(log == 0) {
		  System.out.println("당신은 관리자"); 
	  }else {
		  System.out.printf("[%s]님, 환영합니다.",id[log]);
		  logindex = log; // 다른 클래스에서 사용하기 위해 static으로 저장
	  }
	  
	  return log;
  }
  
}
