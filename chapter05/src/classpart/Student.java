package classpart;

// Student라는 이름을 가진 클래스를 생성했다.
public class Student {
	//property 또는 필드명 또는 멤버변수를 작성
	//단, 데이터 타입은 자료의 형태를 보고 결정
	int studentId; //학번
	String studentName; //학생이름
	String address; //학생 주소
	int grade; //학생 학년
	
	//method 또는 함수 생성
	// 접근제어자 반환의 유무(void, 데이터타입) 함수이름(){}
	// 단, 반환할 값이 필요한 경우 반드시 return 반환할 값 필요
	public void showStudentInfo() {
		System.out.printf("%s학생의 주소는 %s이다.",studentName,address);
		System.out.println();
	}

	// main()메소드를 생성한다.
	public static void main(String[] args) {
		// 홍길동, 개나리, 진달래 학생의 정보를 출력
		// 반드시 먼저 진행해야 하는 작업
		// 인스턴스화(=객체화)를 진행한다.
		
		Student st01 = new Student();//인스턴스화
		
		st01.studentName ="홍길동";
	    st01.address="서울";
	    st01.showStudentInfo();
	    
	    Student st02 = new Student();//인스턴스화
	    st02.studentName ="개나리";
	    st02.address="경기도";
	    st02.showStudentInfo();
	    
	    // st01,st02, st03은 객체이다.
	    Student st03 = new Student();//인스턴스화
	    st03.studentName ="진달래";
	    st03.address="인천";
	    st03.showStudentInfo();
	    System.out.println(st01);
	    System.out.println(st02);
	    System.out.println(st03);
	    
	    
		
	}
}
