package interfaceExample02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MapTest02 {

	public static void main(String[] args) {
		
		        // ===============================
				// 1. 입력 도구 및 자료구조 생성
				// ===============================

				// 키보드 입력을 받기 위한 Scanner 객체 생성
				Scanner scan = new Scanner(System.in);

				// key  : 도시 이름(String)
				// value: Location 객체
				// → 도시 이름으로 Location 객체를 빠르게 검색하기 위한 HashMap
				HashMap<String, Location> hashLocation = new HashMap<>();

				// 입력받을 도시 정보 개수
				int cnt = 4;

				// ===============================
				// 2. 도시 정보 입력 및 저장
				// ===============================

				// 사용자에게 입력 형식 안내
				System.out.println("도시, 경도, 위도를 입력하시오.");
				System.out.println("예: Seoul,127,37");

				// cnt만큼 반복하여 도시 정보 입력
				for (int i = 0; i < cnt; i++) {

					// 입력 안내
					System.out.print(">> ");

					// 한 단어(공백 전까지)를 문자열로 입력받음
					// 예: "Seoul,127,37"
					String loca = scan.next();

					// 입력받은 문자열을 ',' 기준으로 분리
					StringTokenizer st = new StringTokenizer(loca, ",");

					// 첫 번째 토큰 → 도시 이름
					String cityName = st.nextToken().trim();

					// 두 번째 토큰 → 경도 (문자열 → 정수 변환)
					Integer latitude = Integer.parseInt(st.nextToken().trim());

					// 세 번째 토큰 → 위도 (문자열 → 정수 변환)
					Integer hardness = Integer.parseInt(st.nextToken().trim());

					// 입력받은 값으로 Location 객체 생성
					Location lc = new Location(cityName, latitude, hardness);

					// HashMap에 데이터 저장
					// key   : 도시 이름
					// value : Location 객체
					hashLocation.put(lc.getCityName(), lc);
				}

				// ===============================
				// 3. HashMap에 저장된 전체 정보 출력
				// ===============================

				System.out.println("-------------------------------------------");

				// keySet()을 이용해 모든 key(도시 이름)를 하나씩 가져옴
				for (String city : hashLocation.keySet()) {

					// key에 해당하는 Location 객체를 얻음
					Location location = hashLocation.get(city);

					// Location 클래스의 toString() 메서드가 호출되어 출력됨
					System.out.println(location);
				}

				/*
				// ▶ Iterator를 사용한 출력 방식 (위 for-each와 동일한 기능)
				Iterator<String> it = hashLocation.keySet().iterator();
				while(it.hasNext()) {
					String key = it.next();
					Location location = hashLocation.get(key);
					System.out.println(location);
				}
				*/

				System.out.println("------------------------------------------");

				// ===============================
				// 4. 도시 정보 검색
				// ===============================

				while (true) {

					// 검색할 도시 이름 입력
					System.out.print("도시 이름 >> ");
					String city = scan.next();

					// "그만" 입력 시 검색 종료
					if (city.equals("그만")) {
						System.out.println("정보 검색 종료");
						break;

					// HashMap에 해당 도시 이름이 key로 존재하는지 확인
					} else if (hashLocation.containsKey(city)) {

						// 존재하면 해당 도시의 Location 객체 출력
						System.out.println(hashLocation.get(city));
						continue;

					// 도시 정보가 없는 경우
					} else {
						System.out.println(city + "는 없습니다.");
						continue;
					}
					//-------------------------------------------------------------------------------------------
				}

				// Scanner 자원 반납 (권장)
				scan.close();
		
		

	}

}
