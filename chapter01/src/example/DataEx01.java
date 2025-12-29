package example;

public class DataEx01 {

	public static void main(String[] args) {
		// char 데이터 타입 => 한 음절 표현, 반드시 'a' 작은따옴표 사용한다
		char ch = 'A'; // 변수란 값(value)을 대입하는 번지 주소를 이름으로 표현
		char ch2 ='a';
		System.out.println(ch);
		// (int)ch => 명시적 형 변환
		// char인 데이터 타입의 형을 명시해서 int로 변형하는 것
		System.out.println((int)ch);
		System.out.println((int)ch2);
		
		int ch3 = 67;
		System.out.println((char)ch3);
		
		// String => 객체 타입, 반드시 첫 글자는 대문자
		// Integer => Integer 객체 데이터 타입
		// 객체 타입의 변수에 저장되는 값은 실제값이 존재하는
		// 메모리의 번지 주소이다.
		
		//  현재 str 변수에 저장된 데이터는 "Abort"가 아니라
		// "Abort"가 존재하는 메모리 어드레스 주소인 2ff4acd0 이다.
		String str="Abort";
		System.out.println(System.identityHashCode(str)); //10진수 출력됨
		int id = System.identityHashCode(str);//804564176
		System.out.println(Integer.toHexString(id));//2ff4acd0
		
		String str2="홍길동";
		System.out.println(str);
		System.out.println(str2);
		
		// 이스케이프 형식을 이용해서 문자안의 각종 특정 문자를 포함 시킬수 있다.
//		   이스케이프 형식 => \(역슬래시)" => \뒤의 문자 출력된다.
		String str3 ="나는 \"자바\"를 좋아 합니다.";
		System.out.println(str3);
		System.out.println("번호\t이름\t직업");
		System.out.print("행단위 출력");
		System.out.print("다음 줄 개행 \n");
		System.out.println("우리는 \"개발자\"이다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//byte 데이터 타입 => 1byte=8bit
		// byte 표현 범위 : -128 ~ 127
		//자바 기본으로 연산의 메모리 용량이 32bit이기때문에
		// 기본으로 정수는 int 데이터 타입을 사용한다.
		
		byte by1 = 127;
		//byte by2 = 128;
		
		//long 데이터 타입 => 정수(int) 타입의 허용범위를 초과한 경우 
		// 반드시 L또는 l 접미사를 붙인다.
		//long lo1 = 1000000000000;
		long lo2 = 1000000000000L;
		long lo3 = 70;
		
		// 실수형 자료 => Double(8byte), Float(4byte)
		// Float는 반드시 접미사 F또는 f를 붙인다.
		double dou = 3.14;
		//float flo = 3.14; //접미사 f가 없어서 오류 출력
		float flo = 3.14f;
		
		// 논리 타입 boolean은 true(참)/false(거짓) 두가지 값만 가진다.
		
		boolean bool = true;
		boolean boo2 = false;
		
		// 묵시적 형 변환 : 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10;
		int in = by;
		System.out.println("in ="+ in);
		
		// 명시적 형 변환 : 큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int ivar = 100;
		byte by2= (byte)ivar;
		System.out.println("by2 = "+by2);
		
		ivar = 123456; //10진수
		by2 = (byte)ivar;
		// int가 4byte 32bit이고, byte는 8bit이기때문에
		// 오버플로우가 되는 부분은 8bit만 남기고 모두 버림
		// 00000000 00000001 11100010 01000000
		// 00000000 00000001 11100010 => 싹다 버림
		// 0     1   0   0  0  0  0  0
		// 128  64  32  16  8  4  2  1  
		System.out.println("by2 ="+ by2);
		
		boolean a = true;
		boolean b = false;

		System.out.println(a && !b);
		
	}

}
