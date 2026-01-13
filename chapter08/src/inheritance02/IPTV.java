package inheritance02;

// IPTV는 반드시 ColorTV를 상속받아야 한다.
public class IPTV extends ColorTV {
  //멤버 변수 ip
	String ip;
	public IPTV() {};
	public IPTV(String ip, int res, int size) {
		this.ip = ip;
		//ColorTV 부모의 멤버 res :컬러
		super.res = res;
		// TV 부모의 멤버  size: 크기
		super.size=size;
	}
	

	// @ 어노테이션 , Override => 재정의 하다라는 뜻
	@Override
	public void printP() {
    	// size는 부모클래스인 TV에 멤버변수로 상속받아 접근 가능
    	 System.out.print("나의 IPTV는"+ip+"주소의 ");
    	 super.printP();
    }
}
