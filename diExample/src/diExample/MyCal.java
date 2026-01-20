package diExample;

public class MyCal {
	
	// 메소드 하나로 +, -,* ,/ 모두 실행되어야 함
	public void cal(int num1, int num2, Ical ical) {
		int result = ical.doOper(num1, num2);
		System.out.println("result :"+result);
	}
	
	
	
	// 1단계 : 계산기 클래스 생성
    // 2단계 : MyCal 클래스의 메소드들을 모듈(=부품)화 할 예정
	// 3단계 : 공통 인터페이스를 도입 
	// 4단계 : DI(의존성 객체)를 주입한다.
	//        => 외부로부터 객체 주입한다. 
	
	
	// 더하기, 빼기, 곱하기, 나누기 메소드 작성
	// add,   sub,  mul,  div
	// 접근 제어자 public
	// 데이터 반환 없이 void이용
	// print문으로 출력 할 것
	// 매개변수 int num1, int num2를 이용해 자성
	
	/*
	public void add(int num1, int num2, Ical ical) {
		// Ical ical => Ical이라는 타입으로 구현된 어떤
		//              객체든 이자리에 들어올 수 있다는 의미
		//Caladd caladd = new Caladd();
		// 인터페이스는 객체화는 할 수없지만, 
		// 인터페이스 자체가 데이터 타입을 상속하므로
		// 데이터 타입으로 사용할 수 있다.
		
		//Ical ical = new Caladd();
		int result = ical.doOper(num1, num2);
		//int result = num1 + num2;
		System.out.println("result :"+result);
	}
	
	public void sub(int num1, int num2,Ical ical) {
		//Calsub calsub = new Calsub();
		//Ical ical = new Calsub();
		int result = ical.doOper(num1, num2);
		System.out.println("result :"+result);
	}
	
	public void mul(int num1, int num2,Ical ical) {
		//Calmul calmul = new Calmul();
		//Ical ical = new Calmul();
		int result = ical.doOper(num1, num2);
		System.out.println("result :"+result);
	}
	
	public void div(int num1, int num2,Ical ical) {
		//Caldiv caldiv = new Caldiv();
		//Ical ical = new Caldiv();
		int result = ical.doOper(num1, num2);
		System.out.println("result :"+result);
	}
	
	*/
	
	
}
