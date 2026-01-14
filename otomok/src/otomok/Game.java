package otomok;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	// GameElements 객체화한다.
	GameElements ge = new GameElements();
	// while문 run = true;
	boolean run = true;
	int menu = -1;

	// 메뉴 메소드
	public void menu() {
		while (run) {
			System.out.println("[오목]");
			System.out.println("[1]게임 시작");
			System.out.println("[2]전적 확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				// 실행할 함수 미작성
				playgame();
				run = true;
				break;
			case 2:
				// 전적 함수 호출
				showGameRecord();
				break;
			case 0:
				run = false;
				System.out.println("게임 종료");
				break;
			}
		}
	}

	// 게임 시작 메소드
	public void playgame() {
		System.out.println("오목 게임 시작 (플레이어1 : 흑돌, 플레이어2 : 백돌)");
		ge.setCheckboard();
		;
		ge.printCheckerboard();

		while (run) {
			// ----------------------------------------------
			System.out.println("플레이어1 차례 - 놓을 위치를 선택");
			while (true) {
				System.out.print("세로(1~13) : ");
				int row = scan.nextInt();
				System.out.print("가로(1~13) : ");
				int column = scan.nextInt();

				if (!ge.isCheckPostion(row, column)) {
					System.out.println("오목판을 벗어났습니다. 다시 입력하세요");
					continue;
				}

				if (ge.checkerboard[column - 1][row - 1].equals("●")
						|| ge.checkerboard[column - 1][row - 1].equals("○")) {
					System.out.println("이미 돌이 놓여진 자리입니다.");
				} else {
					ge.placeStone1(row, column);
					ge.printCheckerboard();
					if (ge.fiveRowCheck()) {
						System.out.println("게임 끝 : 플레이어 1 승리");
						ge.player1Win++;
						ge.player2Lose++;
						run = false;
					}
					break;
				}
			}
			// -------------------------------------------
			if (ge.fiveRowCheck() == false) {
				System.out.println("플레이어2 차례 - 놓을 위치를 선택");
				while (true) {
					System.out.println("세로(1~13) :");
					int row = scan.nextInt();
					System.out.println("가로(1-13) :");
					int column = scan.nextInt();

					// 오목판 크기예외
					if (!ge.isCheckPostion(row, column)) {
						System.out.println("오목판을 벗어났습니다. 다시 입력하세요");
						continue;
					}
					// 중복돌 체크
					if (ge.checkerboard[column - 1][row - 1].equals("●")
							|| ge.checkerboard[column - 1][row - 1].equals("○")) {
						System.out.println("이미 돌이 놓여진 자리입니다.");
					} else {
						ge.placeStone2(row, column);
						ge.printCheckerboard();
						if (ge.fiveRowCheck()) {
							System.out.println("게임 끝 : 플레이어2 승리");
							ge.player2Win++;
							ge.player1Lose++;
							run = false;
						}
						break;
					}

				}
			}

			// --------------------------------------------
		}
	}

	// 전적 출력 함수
	public void showGameRecord() {
		System.out.println("플레이어1:" + ge.player1Win + "승" + ge.player1Lose + "패");
		System.out.println("플레이어2:" + ge.player2Win + "승" + ge.player2Lose + "패");
	}

}
