package classpart10;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 객체화(=인스턴스화)
		// 참조변수 : scan
		Scanner scan = new Scanner(System.in);
		ClassEx10 e10 = new ClassEx10();
		e10.name ="메가IT 고등학교";
		boolean run = true;
		while(run) {
			System.out.println("======="+e10.name+"========");
			System.out.printf("1.전교생 성적확인%n2.1등학생 성적%n3.꼴등학생 성적%n4.학번 입력%n5.종료%n");
			System.out.print("메뉴 선택 :");
			int sel = scan.nextInt();
			if(sel==1) {
				e10.choice1();
			}else if(sel==2) {
				e10.choice2();
			}else if(sel==3) {
			   e10.choice3();
			}else if(sel==4) {
				System.out.println("학번 입력");
				int hakbun = scan.nextInt();
				e10.choice4(hakbun);
			}else {
				run = false;
				System.out.println("시스템 종료");
			}
		}
		
	}

}
