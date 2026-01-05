package example;

import java.util.Scanner;

public class Movietest {

	public static void main(String[] args) {

		// 사용자 입력을 받기 위한 Scanner 객체
		Scanner scan = new Scanner(System.in);

		/*
		[메가박스 영화 예매 프로그램 규칙 정리]

		좌석 상태 값 정의
		0 : 비어있는 좌석 [ ]
		1 : 현재 선택 중인 좌석 [O]
		2 : 예매 완료된 좌석 [X]
		3 : 예매 불가 좌석 [!]
		*/

		// 좌석 10개를 관리하는 배열
		// int 배열의 기본값은 0 → 처음엔 모두 비어있는 좌석
		int[] seat = new int[10];

		// 전체 예매 인원 수 (총 매출 계산용)
		int cnt = 0;

		// 프로그램 실행 여부를 제어하는 변수
		boolean run = true;

		// 메인 메뉴 반복
		while (run) {

			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.println("3.취소");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			// ===================== 1. 좌석 예매 =====================
			if (sel == 1) {

				System.out.print("예매 인원을 입력하세요[1~8] : ");
				int inwon = scan.nextInt();

				// 예매 인원 유효성 검사
				if (inwon >= 1 && inwon <= 8) {

					// -------------------- [1명 예매일 경우] --------------------
					if (inwon == 1) {

						/*
						1명 예매 규칙
						- 짝수 좌석은 예매 불가 [!]
						- 홀수 좌석만 예매 가능
						*/

						// 짝수 인덱스(실제 좌석 번호로는 짝수 좌석)를 예매불가 처리
						for (int i = 0; i < 10; i++) {
							if (i % 2 != 0) {
								seat[i] = 3;
							}
						}

						// 현재 좌석 상태 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0) System.out.print("[ ]");
							else if (seat[i] == 2) System.out.print("[X]");
							else if (seat[i] == 3) System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();

						// 좌석 선택
						System.out.print("좌석번호 선택[1~10] : ");
						int idx = scan.nextInt() - 1; // 배열 index 보정

						// 이미 예매된 좌석
						if (seat[idx] == 2) {
							System.out.println("이미 예매된 좌석입니다.");

						// 짝수 좌석 선택 시
						} else if (idx % 2 != 0) {
							System.out.println("예매불가능");

						// 정상 예매
						} else {
							seat[idx] = 1; // 선택 상태
							System.out.println("예매완료");
							cnt++;
						}

						// 선택 후 좌석 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0) System.out.print("[ ]");
							else if (seat[i] == 2) System.out.print("[X]");
							else if (seat[i] == 3) System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();
					}

					// -------------------- [2명 이상 예매일 경우] --------------------
					if (inwon >= 2 && inwon <= 8) {

						// 현재 좌석 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0) System.out.print("[ ]");
							else if (seat[i] == 2) System.out.print("[X]");
							else if (seat[i] == 3) System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();

						int selectCnt = 0; // 현재 선택한 인원 수

						// 인원 수만큼 좌석 선택 반복
						while (selectCnt < inwon) {

							System.out.print("좌석번호 선택[1~10] : ");
							int idx1 = scan.nextInt() - 1;

							// 좌석 번호 범위 체크
							if (idx1 < 0 || idx1 >= 10) {
								System.out.println("좌석 번호 오류");
								continue;
							}

							// 마지막 1명 남았을 경우
							// ---------------- 마지막 1명이 남았을 경우 ----------------
							// 전체 예매 인원 중 아직 선택하지 못한 사람이 1명일 때 실행
							if (inwon - selectCnt == 1) {

							    // 이미 선택되었거나 예매 완료된 좌석이면 선택 불가
							    if (seat[idx1] == 1 || seat[idx1] == 2) {
							        System.out.println("이미 선택되었거나 예매된 좌석입니다.");
							        continue;
							    }

							    // 해당 좌석을 '선택 중(O)' 상태로 변경
							    seat[idx1] = 1;

							    // 전체 예매 인원 수 1명 증가
							    cnt++;

							    // 현재 선택 완료한 인원 수 1명 증가
							    selectCnt++;
							}

							else {
							    // ---------------- 2명 이상 남았을 경우 ----------------
							    // 연속된 두 좌석을 함께 선택해야 함

							    // 배열 범위를 벗어나거나
							    // 이미 선택되었거나 예매된 좌석이 포함되어 있으면 선택 불가
							    if (idx1 >= 9 ||
							        seat[idx1] == 1 || seat[idx1 + 1] == 1 ||
							        seat[idx1] == 2 || seat[idx1 + 1] == 2) {

							        System.out.println("이미 선택되었거나 예매된 좌석이 포함되어 있습니다.");
							        continue;
							    }

							    // 현재 선택한 좌석과 바로 옆 좌석을 '선택 중(O)' 상태로 변경
							    seat[idx1] = 1;
							    seat[idx1 + 1] = 1;

							    // 두 명이 동시에 예매되므로 전체 예매 인원 2명 증가
							    cnt += 2;

							    // 이번에 2명을 선택했으므로 선택 완료 인원도 2명 증가
							    selectCnt += 2;
							}
						}

						// 좌석 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0) System.out.print("[ ]");
							else if (seat[i] == 1) System.out.print("[O]");
							else if (seat[i] == 2) System.out.print("[X]");
							else System.out.print("[!]");
						}
						System.out.println();
					}

					// -------------------- 예매 확정 처리 --------------------
					// [!] → 다시 [ ]
					// [O] → [X]
					for (int i = 0; i < seat.length; i++) {
						if (seat[i] == 3) seat[i] = 0;
						else if (seat[i] == 1) seat[i] = 2;
					}

				} else {
					System.out.println("예매인원을 확인하세요~");
				}
			}

			// ===================== 2. 종료 =====================
			else if (sel == 2) {
				int total = cnt * 12000;
				System.out.println("매출액 : " + total + "원");
				System.out.println("인원수 : " + cnt);
				run = false;
			}

			// ===================== 3. 취소 =====================
			else if (sel == 3) {

				System.out.print("취소할 좌석선택 : ");
				int index1 = scan.nextInt() - 1;

				if (index1 < 0 || index1 >= 10) {
					System.out.println("좌석 번호 오류");
					continue;
				}

				// 예매된 좌석만 취소 가능
				if (seat[index1] != 2) {
					System.out.println("예매된 좌석만 취소 가능합니다.");
					continue;
				}

				seat[index1] = 0;
				seat[index1 + 1] = 0;
				cnt -= 2;

				for (int i = 0; i < 10; i++) {
					if (seat[i] == 0) System.out.print("[ ]");
					else if (seat[i] == 2) System.out.print("[X]");
					else if (seat[i] == 3) System.out.print("[!]");
					else System.out.print("[O]");
				}
				System.out.println();
				System.out.println("예매취소완료");
			}
		}

		scan.close();
	}
}
