package interfaceTest;

public class CompleteTest {

	public static void main(String[] args) {
		// 인터페이스는 인스턴스화 할 수 없다.
		// 단, 업캐스팅은 할 수 있다.
		int num1 = 10;
		int num2 = 0;
		Calc calc = new CompleteCalc();
//		System.out.println(calc.add(num1, num2));
//		System.out.println(calc.substract(num1, num2));
//		System.out.println(calc.times(num1, num2));
//		System.out.println(calc.divide(num1, num2));
		
		CompleteCalc comp = new CompleteCalc();
		//comp.showInfo();
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		// static는 상속이 안된다. 그러므로 하위 클래스에서 접근 불가
		int sum = Calc.total(arr);
		//Calc 인터페이스로 직접 접근만 가능한 상태
		System.out.println(sum);
		
	
		
		
	}

}
