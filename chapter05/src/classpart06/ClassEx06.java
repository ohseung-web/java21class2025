package classpart06;

public class ClassEx06 {
   //멤버 변수
	
    String name = "";
    String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
    String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
    int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
	
     int count = 5; //비어있는 인덱스를 누적하는 변수
	
     // 3333 로그인 중
     int loginCheck = -1;
     
     //디폴트 생성자
     public ClassEx06() {};
     
     //상태 출력 함수
     public void printStatus() {
    	     if(loginCheck == -1) {
    	    	   System.out.println("상태 : 로그아웃");
    	     }else {
    	    	   System.out.println("상태 :"+arAcc[loginCheck]+"로그인 중...");
    	     }
     }
     
     //회원가입 함수
     // acc : 계좌번호(=아이디 역활), pw(비밀번호), money(=입금금액)
     // 회원가입하면 1000원 무조건 지불 함
     public boolean join(String acc, String pw, int money) {
    	    //아이디 중복 체크
    	    for(int i=0; i<arAcc.length; i++) {
    	    	    if(arAcc[i].equals(acc)) return false; //아이디 중복
    	    }
    	    // 가입
    	    arAcc[count] = acc;
    	    arPw[count] = pw;
    	    arMoney[count]=money+1000;
    	    count ++;
    	    return true; // 중복이 안된 경우
     }
     
     // 로그인 함수
     public boolean login(String acc, String pw) {
    	 	 // 현재 로그인 상태인지 확인하는 예외처리
    	     if(loginCheck != -1) return false;// 현재 로그인상태
    	     // id와 비밀번호가 같은지 확인
    	     for(int i=0; i<arAcc.length; i++) {
    	    	    if(arAcc[i].equals(acc) && arPw[i].equals(pw)) {
    	    	    	   loginCheck = i;
    	    	    	   return true; //아이디, 비밀번호 일치
    	    	    }
    	     }
    	     return false; //아이디, 비밀번호 불일치
     }
     
     // 로그아웃 함수
     public void logout() {
    	  loginCheck = -1;
     }
     
     // 입금하는 함수
     public void deposit(int money) {
    	 arMoney[loginCheck] += money;
     }
     
     // 이체하는 함수
     public boolean transfer(String acc, int money) {
    	    int target = -1; //이체 하고싶은 계좌번호 존재유무 체크
    	    
    	    for(int i=0; i<arAcc.length; i++) {
    	    	    if(arAcc[i].equals(acc)) {
    	    	    	    target = i; // 현재 계좌번호 존재함
    	    	    	    break;
    	    	    }
    	    }
    	    // 대상이 되는 계좌 번호가 없거나, 이체 금액이 부족한 경우 예외처리
    	    if(target == -1 || arMoney[loginCheck] <money) return false;
    	    
    	    // 이체는 내 통장은 빼기
    	    // 대상은 더하기
    	    arMoney[loginCheck] -= money;
    	    arMoney[target] += money;
    	    return true;
     }
     
     // 잔액조회 함수
     public int getBalance() {
    	    return arMoney[loginCheck];
     }
     
     // 로그인 상태 체크함수
     public boolean isLogin() {
    	    return loginCheck == -1;//로그아웃 상태일 때 true;
     }
     
     
     
     
     
     
}
