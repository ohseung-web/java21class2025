package methodClass;

public class ReturnClass {

	// 메서드 작성 연습
	// void로 메소드 작성 시 값을 반환할 수 없다.
	public void Returnint() {
		int k = 10;
	}
	
	// 데이터 타입으로 메소드 작성시 반드시 값을 반환하여야 한다.
	public String ReturnString() {
		// return이란 값을 호출한 곳으로 반환하여 준다.
		return "자바";
	}
	
	public static void main(String[] args) {
		//객체화 한다.
		ReturnClass rt = new ReturnClass();
		rt.Returnint(); // 값을 반환하지 않았기때문에 출력 못함
		String res = rt.ReturnString(); //Return으로 반환한 "자바"를 저장한다.
		System.out.println(res);
	}
	
}
