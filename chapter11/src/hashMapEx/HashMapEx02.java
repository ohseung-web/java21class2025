package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Location> hashLocation = new HashMap<>();
		int cnt = 4; // 나라 입력받는 개수
		
		// 정보를 Location객체에 저장한다.
		System.out.println("도시,경도,위도를 입력하시오.");
		for(int i=0; i<cnt; i++) {
			System.out.print(">>");
			String loca = scan.nextLine();
			StringTokenizer st = new StringTokenizer(loca,",");
			//나라이름 => 문자
			String cityName = st.nextToken().trim();
			// 경도는 숫자이기때문에 파싱한다.
			// 파싱은 래퍼클래스  Integer을 사용한다.
			Integer latitude = Integer.parseInt(st.nextToken().trim());
			// 위도 파싱한다.
			Integer longitude = Integer.parseInt(st.nextToken().trim());
			
			// 객체화 = 인스턴스
			Location lo = new Location(cityName,latitude,longitude);
			// hashLocation => 삽입해야 함
			hashLocation.put(cityName, lo);
			// hashLocation.put(lo.getCityName(), lo);
		}
		
		// hashLocation 참조변수의 모든 정보 출력
		System.out.println("------------------");
		for(String keyCity:hashLocation.keySet()) {
			//  hashLocation.keySet() = {한국, 중국, 미국, 일본}
			//  cityName; //나라이름
			// latitude; //위도
			//  longitude; //경도
			// Location객체를 데이터 타입으로 hashLocation참조변수의
			// 나라별 나라이름, 위도, 경도 값을 loca 참조변수에 저장한다.
			Location loca = hashLocation.get(keyCity);
			// 객체 데이터 타입을 지정한 경우 출력할 때 내부적으로 자동 toString()메소드를 호출한다.
			System.out.println(loca.toString());
			// System.out.println(loca);
		}
		// 정보검색 
		while(true) {
			System.out.print("도시 이름 >>");
			String city = scan.next();
			if(city.equals("그만")) {
				System.out.println("정보 검색 완료");
				break;
			}else if(hashLocation.containsKey(city)) {
				System.out.println(hashLocation.get(city));
			}else {
				System.out.println(city+"가 없습니다.");
			}
		}
		
		scan.close();
		//-----------
		
	}

}
