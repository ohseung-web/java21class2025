package interfaceExample02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MapTest {

	public static void main(String[] args) {
		
		// ===============================
		// 1. 입력 도구 생성
		// ===============================

		// 키보드로부터 문자열을 입력받기 위한 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);

		// 나라 이름(String)을 key,
		// 인구 수(Integer)를 value로 저장하는 HashMap 생성
		// → 나라 이름으로 인구를 빠르게 검색하기 위한 구조
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		// 사용자에게 입력 형식 안내
		System.out.println("나라 이름과 인구를 입력하세요.(예: korea 5000)");

		// ===============================
		// 2. 나라 정보 입력 (저장)
		// ===============================
		while (true) {

			// 입력 안내 메시지
			System.out.print("나라 이름, 인구 >> ");

			// 한 줄 전체를 문자열로 입력받음
			// 예: "korea 5000"
			String keyValue = scan.nextLine();

			// 입력받은 문자열을 공백 기준으로 분리하기 위해 StringTokenizer 사용
			StringTokenizer st = new StringTokenizer(keyValue);

			// 첫 번째 토큰 → 나라 이름 (key)
			String nation = st.nextToken().trim();

			// 만약 나라 이름으로 "그만"이 입력되면
			// → 나라 정보 입력 종료
			if (nation.equals("그만")) {
				break;
			}

			// 두 번째 토큰 → 인구 수 (value)
			// 문자열을 정수(Integer)로 변환
			Integer people = Integer.parseInt(st.nextToken().trim());

			// HashMap에 데이터 저장
			// key : 나라 이름
			// value : 인구 수
			// 내부적으로는 key의 hashCode를 이용해 저장 위치를 결정
			nations.put(nation, people);
		}

		// ===============================
		// 3. 나라 인구 검색
		// ===============================
		while (true) {

			// 검색할 나라 이름 입력 요청
			System.out.print("인구 검색 >> ");
			// 나라 이름 하나만 입력받음
			String nation2 = scan.next();

			// "그만" 입력 시 검색 종료
			if (nation2.equals("그만")) {
				System.out.println("인구 검색 종료");
				break;
			// HashMap에 해당 key(나라 이름)가 존재하는지 확인
			} else if (nations.containsKey(nation2)) {
				// 존재한다면 key를 이용해 value(인구 수) 조회
				// get(key)는 key가 존재할 경우 해당 value를 반환
				System.out.println(nation2 + "의 인구는 " + nations.get(nation2));
				// 다음 검색으로 이동
				continue;

			// HashMap에 나라 정보가 없는 경우
			} else {
				// 해당 나라가 등록되지 않았음을 출력
				System.out.println(nation2 + " 나라는 없습니다.");

				// 다음 검색으로 이동
				continue;
			}
		}

		// Scanner 자원 정리 (권장)
		scan.close();

	//--------------------------------------------------	
	}

}
