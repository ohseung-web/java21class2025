package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.naming.ldap.StartTlsRequest;

public class HashMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 이름과 학점 입력 =>> 이름은 데이터 타입 String, 학점3.2 Double
		// Map<key, value>의 데이터 타입은 반드시 클래스 또는 래퍼클래스 이어야 함
		HashMap<String, Double> student = new HashMap<>();
		System.out.println("장학금 관리 시스템");
		//정보 저장 => 5명
		for(int i=0; i<5;) {
			System.out.print("이름과 학점 >>");
			//홍길동 4.3
			String keyvalue = scan.nextLine();
			StringTokenizer st = new StringTokenizer(keyvalue);
			String name = st.nextToken().trim();
			Double score = Double.parseDouble(st.nextToken().trim());
			
			//학점 0.0  ~ 4.5까지 만족하지 않을때 에러출력
			if(score<0 || score > 4.5) {
				System.out.println("학점 : 0.0~4.5");
				continue;
			}
			student.put(name, score);
			i++ ; //i는 조건이 만족할때만 누적시킨다.
		}
		
		System.out.println("장학생 선발 학생 기준 입력 >>");
		// 기본 데이터 타입인 double이다.
		double standard = scan.nextDouble();
		
		// 기준학점 이상만 출력
		// 확장for문이용 이유 => for(데이터 타입 작명 : 참조변수)
		// 홍길동 => student.get("홍길동") => [홍길동, 4.5] => 4.5출력
		for(String st : student.keySet()) { // 현재 ~.keySet()는 name
			double dou = student.get(st); // 학점 4.3, 4.5
			if(dou >= standard) System.out.println(st);
			//if(student.get(st) >= standard) System.out.println(st);
		}
		
	}

}
