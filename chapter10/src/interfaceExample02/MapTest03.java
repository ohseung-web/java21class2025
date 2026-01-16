package interfaceExample02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MapTest03 {
	public static void main(String[] args) {
		
		// ===============================
		// 1. 입력 도구 및 자료구조 생성
		// ===============================

		// 키보드 입력을 받기 위한 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);

		// key   : 학생 이름(String)
		// value : 학점(Double)
		// → 학생 이름으로 학점을 관리하는 HashMap
		HashMap<String, Double> excellentStudent = new HashMap<>();

		// 프로그램 안내 메시지
		System.out.println("미래 장학금 관리 시스템 입니다.");

		// ===============================
		// 2. 학생 정보 입력 및 저장
		// ===============================

		// 학생 정보 5명 입력
		for (int i = 0; i < 5; i++) {

			// 입력 안내
			System.out.print("이름과 학점 >> ");

			// 한 줄 전체 입력 (예: "홍길동 4.2")
			String keyvalue = scan.nextLine();

			// 입력받은 문자열을 공백 기준으로 분리
			StringTokenizer st = new StringTokenizer(keyvalue);

			// 첫 번째 토큰 → 학생 이름 (key)
			String name = st.nextToken().trim();

			// 두 번째 토큰 → 학점 (문자열 → Double 변환)
			Double grade = Double.parseDouble(st.nextToken().trim());

			// HashMap에 학생 정보 저장
			// key   : 학생 이름
			// value : 학점
			excellentStudent.put(name, grade);
		}

		// ===============================
		// 3. 장학생 선발 기준 입력
		// ===============================

		// 장학생으로 선발될 최소 학점 입력
		System.out.print("장학생 선발 학생 기준 입력 >> ");
		double standard = scan.nextDouble();

		// ===============================
		// 4. 기준 학점 이상인 학생 출력
		// ===============================

		// 출력 안내
		System.out.print("장학생 명단 : ");

		// HashMap에 저장된 모든 학생 이름(key)을 하나씩 순회
		for (String student : excellentStudent.keySet()) {

			// 해당 학생의 학점(value) 가져오기
			double sg = excellentStudent.get(student);

			// 학점이 기준 이상인 경우만 출력
			if (sg >= standard) {
				System.out.print(student + " ");
			}
		}
	}
}
