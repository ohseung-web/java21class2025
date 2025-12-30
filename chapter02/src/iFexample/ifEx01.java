package iFexample;

import java.util.Scanner;

public class ifEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// String은 객체 데이터 타입으로 dbid="1234" 값이 저장된 힙메모리의 주소가 
		// dbid에 존재하기때문에 값을 직접 비교할 수 없다.
		// 이런경우 문자를 비교할때는 반드시 
		// equals()메서드를 이용해서 힙메모리의 값을 직접 비교해야 한다.
		// int 기본 데이터 타입은 변수에 값이 저장되어있므로 ==(같다)만가지고도 값을 비교할수있다.
        String dbid ="1234";
        String dbpw = "1111";
        System.out.print("ID입력 :");
        String id = scan.next();
        System.out.print("PW입력 :");
        String pw = scan.next();
        System.out.println();
        if(!dbid.equals(id) && !dbpw.equals(pw)) {
        	   System.out.println("로그인 성공");
        }else {
        	   System.out.println("로그인 실패");
        }
	}

}
