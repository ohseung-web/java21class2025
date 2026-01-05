package example;

import java.util.*;

public class OtArrayE10 {

	public static void main(String[] args) {
		// 영화 예매 프로그램 규칙 정리
		// 좌석 상태 값 정의
		// 0 : 비어있는 좌석 [ ]
		// 1 : 현재 선택 중인 좌석 [O]
		// 2 : 예매 완료된 좌석 [X]
		// 3: 예매 불가 좌석 [!]
		Scanner scan = new Scanner(System.in);

		// 좌석 10개로 배열 지정
		// int 배열의 깁손값은 0 -> 처음엔 모두 비어 있음
		int[] seat = new int[10];
		// 전체 예매 인원 수(총 매출 계산용)
		int cnt = 0;
		// 프로그램 실행 여부를 제어하는 변수
		boolean run = true;
		// 메인 메뉴 선택
		while (run) {
			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.println("3.취소");
			System.out.print("메뉴 선택 :");
			int sel = scan.nextInt();
			// =========== 1. 좌석 예매 ==============
			if (sel == 1) {
				System.out.print("예매 인원을 입력하세요[1~8]:");
				int inwon = scan.nextInt(); // 내가 입력한 인원수
				// 예매 인원 유효성 검사
				if (inwon >= 1 && inwon <= 8) {
					// ------- [1명 예매일 경우]--------
					if (inwon == 1) {
						// 1명 예매 규칙
						// - 짝수 좌석은 선택 불가 [!] => 3
						// - 홀수 좌석만 예매 가능
						for (int i = 0; i < 10; i++) {
							// 2, 4, 6, 8 => 배열은 index가 0부터 시작하므로
							// 사실 짝수좌석이 아니라 홀수좌석을 선택불가 해야 한다.
							// && seat[i] !=2
							if (i % 2 != 0) {
								seat[i] = 3;
							}
						}
						// 현재 좌석 상태 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0)
								System.out.print("[ ]");
							else if (seat[i] == 2)
								System.out.print("[X]");
							else if (seat[i] == 3)
								System.out.print("[!]");
							else
								System.out.print("[O]");
						}
						System.out.println();

						// 좌석 선택
						System.out.print("좌석번호 선택[1~10]");
						int idx = scan.nextInt() - 1;// -1을 하는 이유 인덱스는 0부터 시작

						// 이미 선택좌석 예외처리
						if (seat[idx] == 2) {
							System.out.println("이미 예매된 좌석 입니다.");
						}
						// 짝수 좌석 선택 시
						else if (idx % 2 != 0) {
							System.out.println("예매 불가능");
						}
						// 정상 예매
						else {
							seat[idx] = 1; // 선택 상태 [o]
							System.out.println("예매 완료");
							// 예매 완료 되면 cnt에 인원수 누적한다.
							cnt++;
						}
						// 선택 후 좌석 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0)
								System.out.print("[ ]");
							else if (seat[i] == 2)
								System.out.print("[X]");
							else if (seat[i] == 3)
								System.out.print("[!]");
							else
								System.out.print("[O]");
						}
						System.out.println();
					}

					// ---- [2명 이상 예매일 경우 ]----------
					if (inwon >= 2 && inwon <= 8) {
						// 현재 좌석 출력
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 0)
								System.out.print("[ ]");
							else if (seat[i] == 2)
								System.out.print("[X]");
							else if (seat[i] == 3)
								System.out.print("[!]");
							else
								System.out.print("[O]");
						}
						System.out.println();

						int selectCnt = 0; // 현재 선택한 인원 수를 담는 변수

						// 인원 수만큼 좌석 선택 반복
						// inwon=4, 현재 선택인원인 selectCnt=2
						// selectCnt가 최초에 선택한 inwon보다 작으면
						// 아직 좌석선택이 다 끝나지 않았음을 조건으로 표시 함
						while (selectCnt < inwon) {
							System.out.print("좌석벅호 선택[1-10]");
							int idx1 = scan.nextInt() - 1;
							// 좌석 번호 범위체크 예외처리
							if (idx1 < 0 || idx1 >= 10) {
								System.out.println("좌석번호 오류");
								continue;
							}
							// selectCnt의 인원 중 마지막 1명이 남았을 경우
							// 전체 예매 인원 중 아지 선택하지 않은 사람이 1명일 때 실행하는 코드
							if (inwon - selectCnt == 1) {
								// 이미 선택되었거나, 예매 완료된 좌석이면 선택불가 예외처리
								if (seat[idx1] == 1 || seat[idx1] == 2) {
									System.out.println("이미 선택되었거나 예매된 좌석입니다.");
									continue;
								}
								// 셋팅 부분
								// 해당 좌석을 '선택 중[O]' 상태로 변경
								seat[idx1] = 1;
								// 전체 예매인원수를 누적 상태로 변경
								cnt++;
								// 현재 선택 완료된 인원수 1명 증가
								selectCnt++;
							} else {
								// ------ [ 2명 이상 남았을 겨우] ------
								// 연속해서 두 좌석 함께 선택되어야 함

								// 배열 범위를 벗어나거나
								// 이미 선택되었거나, 예매가 완료된 좌석이 포함되어 있으면
								// 선택 불가 예외처리 함
								if (idx1 >= 9 || seat[idx1] == 1 || seat[idx1 + 1] == 1 || seat[idx1] == 2
										|| seat[idx1 + 1] == 2) {
									System.out.println("이미 선택되었거나 예매완료된 좌석입니다.");
									continue;
								}

								// 셋팅 부분
								// 현재 선택한 좌석과 바로 옆 좌석을 '선택중 [O]' 상태로 변경
								seat[idx1] = 1;
								seat[idx1 + 1] = 1;

								// 전체 예매인원수를 누적 상태로 변경
								cnt += 2;
								// 현재 선택 완료된 인원수 1명 증가
								selectCnt += 2;
							}

							// 좌석 출력
							// 현재 좌석 출력
							for (int i = 0; i < 10; i++) {
								if (seat[i] == 0)
									System.out.print("[ ]");
								else if (seat[i] == 2)
									System.out.print("[X]");
								else if (seat[i] == 3)
									System.out.print("[!]");
								else
									System.out.print("[O]");
							}
							System.out.println();
						}
						// ----- 예매 확정 처리 ---------
						// 예매 확정 [X](2)로 변경
						// 예매 불가능 [!](3) => 다시 [ ](0)
						for (int i = 0; i < 10; i++) {
							if (seat[i] == 3)
								seat[i] = 0;
							else if (seat[i] == 1)
								seat[i] = 2;
						}

					} else {
						System.out.println("예매 인원을 확인하세요");
					}
				}
			} else if (sel == 2) {
				// 총 매출액 계산할 예정
				int total = cnt * 12000;
				System.out.printf("매출액 : %d원%n", total);
				System.out.printf("인원수 : %d명%n", cnt);
				// 종료
				run = false;
				System.out.println("프로그램 종료");
			} else {

			}
		}

		// ==== 개발 종료 =====
		scan.close();
	}
}
