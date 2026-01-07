package methodClass;

import java.util.Scanner;

public class Return03 {
  //멤버 변수
  int num1 = 10;
  int num2 = 20;
  
  public void test02() {
	  if(num1 >= num2) {
		  System.out.println("크다");
	  }
	  // 반환하지 않는 함수에 return사용하면 즉시 메소드 종료
	  return;
  }
  
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  //객체화 한다.
	  Return03 r3 = new Return03();
	  
	  //while()문을 이용하여 출력한다.
	  while(true) {
		  System.out.println("메뉴 출력");
		  int sel = scan.nextInt();
		  if(sel ==1) {
			  // 반환하지 않고 즉시 함수 종료한다.
			  r3.test02();
		  }else {
			  System.out.println("종료");
			  return; // while()문을 즉시 종료
		  }
		  
		  
	  }
  }
  
  
  
  
}
