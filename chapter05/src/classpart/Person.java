package classpart;

import java.util.Random;
import java.util.Scanner;

public class Person {
	// 전여 멤버변수
  String name;
  float height;
  float weight;
  
  // 생성자란 : 객체를 초기화 하여 생성해주는 역활을 한다.
  // 디폴트 생성자가 존재하지 않으면 컴파일러가 자동으로 생성해준다.
  // 단, 매개변수 생성자가 존재하고, 디폴트 생성자가 존재하지 않을때는
  //     디폴트 생성자를 컴파일러가 자동으로 생성해주지 않는다.
  //default 생성자
  // 생성자 이름은 반드시 클래스 이름과 같아야 한다.
  // 생성자는 여러개 만들 수 있다. 단, 똑같은 형식으로 작성 금지
  public Person() {} //기본 생성자
  public Person(String name) {
	  // 여기서 this가 가리키는 곳은 Person클래스의 
	  // 멤버 변수를 의미한다.
	  // 멤버 변수 name에 생성자의 매개변수 이름을 넣어주라라는 의미
	  this.name = name;
  }
  public Person(float height, float weight) {
	  this.height = height;
	  this.weight = weight;
  }
  
  public static void main(String[] args) {
	  //인스턴스
	  // 디폴트 생성자를 생성하지 않은채로 아래처럼 기본생성자를 
	  // 객체화 할 수없다.
	  // 이유는 이미 매개변수 생성자가 2개나 존재하므로 
	  // 컴파일러가 디폴트 생성자를 자동으로 생성하지 않는다.
	  // pe는 참조변수이다.
	  // 클래스는 반드시 객체화해서 사용해야 함을 주의하자!!
	  Person pe = new Person(); //객체화 = 인스턴스화
	  pe.name="개나리";
	  pe.height=180;
	  pe.weight=50;
	  
	  Random ra = new Random();
	  // Scanner 클래스는 디폴트 생성자가 존재하지 않는다
	  // 이유는 입력받는 inputstream이 키보드인지/네트워크인지
	  // 구분이 필요하기 때문이다.
	  // 고로 Scanner scan = new Scanner(System.in)
	  // 매개변수 생성자만 존재한다.
	  //Scanner scan = new Scanner();
	  
//	  Person pe02 = new Person("홍길동");
//	  Person pe03 = new Person(178, 100);
//	  System.out.println(pe02.name);
//	  System.out.println(pe03.height);
//	  System.out.println(pe03.weight);
  }
}
