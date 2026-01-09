package arrayListTest;

import java.util.ArrayList;

public class ArrList01 {

	public static void main(String[] args) {
		// ArrayList<E> 참조변수 = new ArrayList<>();
		// <E>부분을 제네릭(Generic)라 부르며
		// <E>부분엔 반드시 데이터 타입이 클래스로 작성되어야 한다.
		// ArrayList<>는 가변길이 클래스 배열이다.
		// 데이터가 삭제되거나, 추가되면 자동으로 크기(배열의 길이) 작아지거나 커진다.
		// ArrayList<>에서 데이터 추가 메서드는 add(인덱스번호, 값), add(값)
		// 단, add(값)은 항상 맨 마지막 위치에 추가된다.
		// 단, add(인덱스번호, 값)은 인덱스번호 위치에 값이 추가되는데 이경우 뒤의 모드데이터는 뒤로 이동한다.
		// ArrayList<>에서 데이터 삭제 메서드는 remove(인덱스번호)
		// 단, 삭제 시 뒤의 데이터들은 앞으로 이동한다.
		// ArrayList<>에서 데이터를 추출하는 메서드는 get(인덱스번호)
		// ArrayList<>에서 배열의 길이를 추출하는 메서드는 size()이다.
		// ArrayList<>에서 요소가 비어있는지 확인하는 메서드는 isEmpty()이다.
		// isEmpty()는 비어있으면 true, 아니면 false를 반환한다.
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		// ArrayList<E>의 <E>부분에 데이터 타입이 클래스 이어야하므로
		// 기본데이터 타입인 int를 사용할 수 없다.
		// 그러므로 정수형 클래스 데이터 타입인 Integer 래퍼클래스를 입력한다.
		ArrayList<Integer> num = new ArrayList<>(); 
		num.add(20);
		num.add(30);
		
		//데이터 추가하기
		list.add("사과");
		list.add("바나나");
		list.add(1,"딸기");
		list.add(1,"포도");
		// list2의 요소를 list로 통째로 추가하고 싶을때 
		// addAll()메소드 이용한다.
		list2.add("시금치");
		list2.add("콩나물");
		
		list.addAll(list2);
		
		//데이터 삭제
		list.remove(1);
		//System.out.println(list.isEmpty());
		
		
		//전체 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 확장 for문 이용해서 출력
		// for(자료형 변수이름 작명 : 참조변수)
		for(String li : list)System.out.println(li);
		for(Integer Number : num)System.out.println(Number);
		
		//-----------------------------------------
		//내가 만든 클래스를 ArrayList<>의 데이터 타입으로 사용
		ArrayList<Member> meninfo = new ArrayList<Member>();
		//meninfo.add("홍길동","서울",20);
		
//		public Member(String name, String address, int age) {
//			// this는 Member 클래스를 지칭 한다.
//			this.name = name;
//			this.address = address;
//			this.age = age;
//		}
		// main()메서드에서 생성할때 입력한 매개변수의 값이
		// this.name = "홍길동"
		// this.address ="서울"
		// this.age = 20;
		
		meninfo.add(new Member("홍길동","서울",20));
		meninfo.add(new Member("개나리","인천",15));
		for(Member m : meninfo) {
		     m.printMember();
		}
		

	}

}
