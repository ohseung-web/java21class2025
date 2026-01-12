package formatExample;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeciEx {

	public static void main(String[] args) {
		// DecimalFormat 클래스는 예약어 new로 객체를 생성하여 사용한다.
		// DecimalFormat("#,##0") => 따옴표 안에 출력할 숫자의 형식을 입력
		// => 0은 숫자 0을 0으로 출력
		// => #은 숫자 0을 공백으로 출력
		// => #의 경우 첫 숫자가 존재하면 뒤의 0은 공백으로 출력되지 않는다.
		Scanner scan = new Scanner(System.in);
		int number;
		
		DecimalFormat num1 = new DecimalFormat("0,000");
		DecimalFormat num2 = new DecimalFormat("#");
		DecimalFormat num3 = new DecimalFormat("#,##0");
		//유니코드 \u00A4 => 원화 화페출력
		 DecimalFormat num4 = new DecimalFormat("\u00A4#,###");
		
		System.out.println("값 입력");
		number = scan.nextInt();
		System.out.println(num1.format(number));
		System.out.println(num2.format(number));
		System.out.println(num3.format(number));
		System.out.println(num4.format(number));
			
	}

}
