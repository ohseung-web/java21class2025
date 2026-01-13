package inheritance02;

// 자식 클래스 TV를 상속 받는다.
public class ColorTV extends TV {
	//해상도 멤버 변수 필요
	// size 멤버는 부모가 가지고 있음
    protected int res;
    
    public ColorTV() {};
    public ColorTV(int res, int size) {
    	  this.res = res;
    	  //super.size = size;
    	  super.setSize(size);
    }
    
    public void printP() {
    	// size는 부모클래스인 TV에 멤버변수로 상속받아 접근 가능
    	 System.out.println(size+"인치"+res+"컬러");
    }
}
