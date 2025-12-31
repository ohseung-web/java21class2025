package example;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;// 불고기
		int price2 = 6200;// 새우
		int price3 = 1500;// 콜라

		int cnt1 = 0; // 불고기
		int cnt2 = 0; // 새우
		int cnt3 = 0; // 콜라

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우  버거 : " + price2 + "원");
		System.out.println("3.콜     라 : " + price3 + "원");

		int num = 1;
		while (num <= 5) {
			System.out.print("메뉴 선택 :");
			int select = scan.nextInt();

			if (select == 1) {
				cnt1 += 1;
			} else if (select == 2) {
				cnt2 += 1;
			} else {
				cnt3 += 1;
			}
			num++;
		}

		int total = (price1 * cnt1) + (price2 * cnt2) + (price3 * cnt3);
		System.out.println("총금액 :" + total + "원");
		System.out.println("현금 입력 :");
		int money = scan.nextInt();
		// 잔액 계산
		int charge = money - total;
		if (charge > 0) {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1.불고기 버거 : " + cnt1 + "개");
			System.out.println("2.새우  버거 : " + cnt2 + "개");
			System.out.println("3.콜     라 : " + cnt3 + "개");
			System.out.println("4.총 금 액 : " + total + "원");
			System.out.println("5.잔    액 : " + charge + "원");
		} else {
			System.out.println("현금이 부족합니다.");
		}

	}

}
