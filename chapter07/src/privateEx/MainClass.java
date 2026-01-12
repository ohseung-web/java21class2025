package privateEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pt = new PrivateTest();
		// 먼저 setter() => 값을 수정
		pt.setMonth(2);
		pt.setYear(2026);
		pt.setDay(30);
		
		// 아니면 수정은 불가능하고 출력은 가능 getter()
		System.out.println(pt.getDay());
//		System.out.println(pt.month=20);
//		System.out.println(pt.year=2005);
		
	}

}
