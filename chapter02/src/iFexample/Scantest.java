package iFexample;

import java.util.Scanner;

public class Scantest {

	public static void main(String[] args) {
		// Scanner는 자료를 키보드로 부터 입력받을 수 있는 클래스(class)이다.
		// 단, Scanner는 클래스이므로 반드시 new Scanner()형식으로 생성해야 한다.
		// 클래스를 사용하는 근본적인 목적 : 메서드의 재사용이 용이하다.
		Scanner scan = new Scanner(System.in); //인스턴스한다 
		// scan은 새로생성된 클래스 이름이다.
		
		//int age=0;
		System.out.println("나이를 입력하세요 :");
		int age = scan.nextInt(); // 정수형 데이터를 입력받는 메서드
		//System.out.printf("홍길동의 나이는 %d입니다.",age);
		
		// 이름을 입력받아 출력하세요
		System.out.println("이름을 입력하세요");
		//Scanner scan2 = new Scanner(System.in);
		String name = scan.next();// 공백전의 한단어만 입력받는 메서드
		System.out.printf("%n이름이 %s인 사람의 나이는 %d입니다.",name,age);
	}

}
