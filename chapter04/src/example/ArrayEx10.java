package example;
import java.util.*;

public class ArrayEx10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] seat = new int[7];
        int cnt = 0;
        boolean run = true;

        while(run) {

            for(int i=0; i<seat.length; i++) {
                if(seat[i] == 0) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();

            System.out.println("=메가 영화관=");
            System.out.println("1.좌석예매");
            System.out.println("2.종료");
            System.out.print("메뉴 선택 : ");
            int sel = scan.nextInt();

            if(sel == 1) {
                System.out.print("예매 인원을 입력하세요[1~7] : ");
                int inwon = scan.nextInt();

                System.out.print("좌석번호 선택[1~7] : ");
                int idx = scan.nextInt() - 1;

                // ===== 1명 예매 =====
                if(inwon == 1) {
                    if(idx % 2 != 0) {
                        System.out.println("예매 불가능");
                        continue;
                    }

                    if(seat[idx] == 0) {
                        seat[idx] = 1;
                        cnt++;
                    } else {
                        System.out.println("이미 예매가 완료된 자리입니다.");
                    }
                }

                // ===== 2명 이상 예매 =====
                else {
                    // 범위 체크
                    if(idx + inwon > seat.length) {
                        System.out.println("선택한 좌석 범위를 벗어났습니다.");
                        continue;
                    }

                    boolean possible = true;
                    for(int i=0; i<inwon; i++) {
                        if(seat[idx + i] == 1) {
                            possible = false;
                            break;
                        }
                    }

                    if(possible) {
                        for(int i=0; i<inwon; i++) {
                            seat[idx + i] = 1;
                        }
                        cnt += inwon;
                    } else {
                        System.out.println("이미 예매된 좌석이 포함되어 있습니다.");
                    }
                }
            }

            else if(sel == 2) {
                int total = cnt * 12000;
                System.out.println("매출액 = " + total + "원");
                run = false;
            }
        }

        scan.close();
    }
}
