package iFexample;

import java.io.IOException;

public class Readin {

	public static void main(String[] args) throws IOException {
		// System.in.read() => 키보드로 부터 값을 입력받을 수 있다.
		// 키코드를 하나씩 읽기 떄문에 2개이상의 키가 조합된 한글을 읽을 수 없다.
//		  숫자를 입력하던, 한 음절 문자를 입력하던 아스키코드값이 출력된다.
		int keycode;
		System.out.print("값을 입력하세요 :");
		keycode = System.in.read();
		
		System.out.println("keycode : "+keycode);
	}

}
