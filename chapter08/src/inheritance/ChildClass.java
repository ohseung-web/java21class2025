package inheritance;

// 부모 클래스인 ParentClass를 자식클래스인 ChildClass상속
// 상속 키워드 : extends
// 자식 클래스 이름 extends 부모 클래스 이름
public class ChildClass extends ParentClass{
	
  //자식 클래스
  int a = 5;
  int b = 6;
  
  //디폴트 생성자
  public ChildClass(int a, int b) {
	  this.a = a;
	  //super();//부모의 디폴트 생성자를 호출 (생략해도 컴파일러가 자동 추가)
	  System.out.println("childClass 생성자");
	  super.setA(b);
  }
  
  public void childfun() {
	  // this는 ChildClass 자기자신을 가리킴
	  this.a = 12;
	  // 부모의 멤버 변수 a접근하여 값을 25로 변경
	  // 부모를 가리키는 키워드는 super
	  //super.a = 25;
	  
	  System.out.println("== child start");
	  System.out.println("자식의 a:"+a+", 부모의 a"+super.a);
	  
  }
  
  
  
  
  
  
  
  
  
}
