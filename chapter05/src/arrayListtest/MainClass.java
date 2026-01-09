package arrayListtest;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
//		ArrayList<Member> minfo = new ArrayList<>();
//		minfo.add(new Member("홍길동","서울",20));
//		minfo.add(new Member("개나라","인천",30));
//		minfo.add(new Member("진달래","경기",25));
//		minfo.add(new Member("김백합","충남",19));
//		
//		for(Member info : minfo) {
//			info.printMember();
//		}
		
		Scanner scan = new Scanner(System.in);
        double number ;
        
        NumberFormat num1 = NumberFormat.getInstance();
        NumberFormat num2 = NumberFormat.getNumberInstance();
        NumberFormat num3 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat num4 = NumberFormat.getPercentInstance();
        NumberFormat num5 = NumberFormat.getIntegerInstance();
        
        System.out.println("값을 입력하시오");
        number = scan.nextDouble();
        //천단위마다 구분기호 ,(콤마)를 출력
        System.out.println(num1.format(number));
        //천단위마다 구분기호 ,(콤마)를 출력
        System.out.println(num2.format(number));
        //통화기호 ￦와 .(콤마)를 출력
        System.out.println(num3.format(number));
        //백분율로 출력 단 1200이면 => 120,000%
        System.out.println(num4.format(number));
        //실수를 반올림하여 정수로 출력 
        System.out.println(num5.format(number));
        
        
        //----------------------------------------------------
        int number02 ;
        
        DecimalFormat num11 = new DecimalFormat("0,000");
        DecimalFormat num12 = new DecimalFormat("#,###");
        DecimalFormat num13 = new DecimalFormat("#,###%");
        DecimalFormat num14 = new DecimalFormat("#,##0.#");
        DecimalFormat num15 = new DecimalFormat("0,000.00");
        DecimalFormat num16 = new DecimalFormat("\u00A4#,###");
        DecimalFormat num17 = new DecimalFormat("￦#,###");
               
        System.out.println("값을 입력하시오");
        number02 = scan.nextInt();
        
        //천단위마다 구분기호 ,(콤마)를 출력 단, 0은 0으로 출력
        System.out.println(num1.format(number));
        //천단위마다 구분기호 ,(콤마)를 출력 단, #은 공백으로 출력
        System.out.println(num2.format(number));
        //백분율로 출력 단 1200이면 => 120,000%
        System.out.println(num3.format(number));
        //소수 둘째자리에서 반올림하여 첫째자리까치 출력 단, #은 공백으로 출력
        System.out.println(num4.format(number));
        //소수 세째자리에서 반올림하여 둘째자리까치 출력 단, 0은 0으로 출력
        System.out.println(num5.format(number));
        //통화기호 \ 출력
//        System.out.println(num6.format(number));
//        System.out.println(num7.format(number));
        
     scan.close();   
		
		
		
	}

}
