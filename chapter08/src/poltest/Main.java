package poltest;


// 실행용 클래스
// 테스트, 흐름 제어, 호출 담당
// Main 클래스는 static가 아니라 반드시 객체화 해야 함
// Animal        → 행위의 대상 (움직인다)
// Hauman/Tiger  → 실제 객체
// AnimalTest   → 실행, 제어, 테스트
// Animal은 다형성의 대상이고,
// AnimalTest는 그 다형성을 실행·검증하는 클래스이기 때문에
// AnimalTest 객체를 생성한 것이다.

// 실무에 다형성을 어디에 사용하나
// 서비스 로직 (Service 계층)
// 결제
// 할인 정책
// 배송 정책
// 로그인 방식

// 실무에서 다형성 한 줄 정의
// 다형성은 “현재 요구사항”이 아니라
// “미래 변경”을 막기 위해 미리 만들어두는 구조다.

// 이 단계에서 딱 이해하면 되는 수준
//지금 이해하면 완벽한 사고 흐름 👇
//“이 코드는 나중에 바뀔 가능성이 있나?”
//“그럼 if 대신 다형성으로 빼자”
//“사용하는 쪽은 인터페이스만 알게 하자”

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Main atest = new Main();
        atest.moveAnimal(new Hauman());
        atest.moveAnimal(new Tiger());
        atest.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
	     animal.move();
	     }


}
