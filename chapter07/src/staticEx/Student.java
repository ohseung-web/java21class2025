package staticEx;

public class Student {
   //static는 데이터 메모리 영역에 존재하며
   // 서로 다른 인스턴스에 같은 값을 공유한다.
   // static 데이터 타입 변수이름 => 클래스변수라 칭한다.
   // static는 정적이라는 의미를 가진다.	
	static int serialNum=1000;
	
	int studentId;
	String studnetName;
	
	//디폴트 생성자
	public Student() {
		serialNum ++;
		studentId = serialNum;
	}
}
