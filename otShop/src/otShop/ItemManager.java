package otShop;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	
	//카테고리는 String 자료형으로 ArrayList<>생성 할 것
	ArrayList<String> category = new ArrayList<>();
	
	//전체 아이템리스트를 Item 자료형으로 ArrayList<>생성 할 것
	ArrayList<Item> itemList = new ArrayList<>();
	// [0] => {name:~, price:~, category:~}
	
	//전체 장바구니 => Cart 클래스를 자료형으로 ArrayList<>생성 한다.
	ArrayList<Cart> jangList = new ArrayList<>();
	
	// 객체화(=인스턴스화)
	UserMenu user = new UserMenu();
	
	// 디폴트 생성자
	public ItemManager() {info();};
	
	// itemList에 아이템을 추가하는 메소드 
	// => ArrayList<>에서 추가하는 메소드는 add()이다.
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name,price,category));
	}
	
	//카테고리 추가 메소드
	public void info() {
		category.add("과자");//index가 0번째
		category.add("생선");//index가 1번째
		category.add("육류");//index가 2번째
		category.add("음료수");//index가 3번째
		addItem("새우깡",1000,category.get(0)); // 0
		addItem("고등어",2000,category.get(1));  // 1
		addItem("칸쵸",3600,category.get(0));    // 2
		addItem("소고기",6500,category.get(2));   // 3
		addItem("돼지고기",5500,category.get(2));  // 4
		addItem("콜라",1000,category.get(3));   // 5
		addItem("사이다",1500,category.get(3));  // 6
		addItem("새우",1800,category.get(1));   //7
	}
	// 카테고리 출력 메소드
	public void printCategory() {
		for(int i=0;i<category.size(); i++) {
			System.out.println("["+i+"]"+category.get(i)); 
		}
	}
	
	// item  목록 출력 메소드
	public void printItemLsit() {
		for(int i=0;i<itemList.size(); i++) {
			System.out.print("["+i+"]");
			itemList.get(i).printInfo(); 
		}
	}
	
	// ------------- 장바구니 ------------
	// usid => id, caId=> 카테고리 index 번호, itemID => itdm index번호
	public void addCart(String usid, int caId, int itemId) {
		// 이미 장바구니에 아이템이 존재하는지 검사
		// 이미 존재하면 수량누적, 가격 누적 필요함
		// Cart 인스턴스화 
		int cnt = 0; //개수
		int jangcnt = 0; // 장바구니에 중복된 데이터의 존재 유무 치트키
		int log = user.logindex;// UserMenu클래스의 로그인된 log값을 static로 공유함
		// 개발에서 temp의 의미는 임시기억장소를 뜻한다.
		Cart temp = new Cart(); 
		temp.userId = usid;
		
		for(int i=0; i<itemList.size(); i++) {
			//비교해야 할 조건?
			// 이미 장바구니에 아이템이 존재하는지 검사
			// itemList.get(0).name => 새우깡
			// temList.get(2).name => 칸쵸
			if(itemList.get(itemId).name.equals(itemList.get(i).name)) {
				// 조건이 true면 누적
				jangcnt = 0;
				for(int j=0; j<jangList.size(); j++) {
					//비교 => 현재 장바구니에 담긴 아이템이름과 아이템리스트 이름이 같은지
					if(jangList.get(j).itemName.equals(itemList.get(i).name)
							&& jangList.get(j).userId.equals(user.id[log])) {
						// 가격 누적, 수량 1씩 누적
						// jangList.get(j).price  = jangList.get(j).price  + itemList.get(i).price;
						// a = 1000, a = 1000 + 1000 => a=2000 => 2000 + 1000;
						jangList.get(j).price += itemList.get(i).price;
						jangList.get(j).Quantity ++;
						jangcnt += 1;
					}
				}
				// 이미 장바구니에 상품이 존재하지 않을때
				if(jangcnt == 0) {
					temp.itemName = itemList.get(i).name;
					temp.price = itemList.get(i).price;
					cnt += 1;
					temp.Quantity = cnt;
					//장바구니 추가
					jangList.add(temp);
				}
			}
		}
	}
	
	//-----------------------------------------------------
	// 장바구니 출력 메소드
	public void printJang() {
		for(int i=0; i<jangList.size(); i++) {
			jangList.get(i).printCart();
		}
	}
	
	//------------------------------------------
	// 전체 item 추가 메소드
	public void addItem02(String addname, int addprice, int addcategory) {
		// Item클래스 추가 => add
		Item temp = new Item(addname, addprice, category.get(addcategory));
		itemList.add(temp);
	}
	
	// 전체 item 삭제 메소드
	public void delItem(int delIndex) {
		itemList.remove(delIndex);
	}
	
	// 전체 item 수정 메소드
	public void updateItem(int indexNum,String upName, int upPrice) {
		//for(int i=0; i<itemList.size(); i++) {
			itemList.get(indexNum).name = upName;
			itemList.get(indexNum).price = upPrice;
		//}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
