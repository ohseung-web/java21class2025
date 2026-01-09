package arrayListEx02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Student클래스를 ArrayList<>로 생성한다.
		ArrayList<Student> list = new ArrayList<Student>();
		// 학생 3명만 입력
		int cnt =0;
		
		while(cnt < 3) {
			//객체화를 진행 해야 한다.
			Student sName = new Student();
			System.out.print("학생 이름 입력:");
			// Student 클래스의 name멤버 변수에 접근하여 이름을 입력함
			sName.name = scan.next();
			
			// 과목 2개 입력
			for(int i=0; i<2; i++) {
				//Subject 클래스를 인스턴스화하여 sub에 접근하여 과목명을 입력함
				Subject subject = new Subject();
				System.out.print("과목명 입력: ");
				subject.sub = scan.next();
				
				System.out.print("점수 입력: ");
				subject.score = scan.nextInt();
				
				// Student 클래스에 과목, 점수 추가한다.
				sName.sublist.add(subject);
			}
			 // list에 학생 추가되어야 함
			list.add(sName);
			cnt++;
		}
		
		// 출력
		for(int i=0; i<list.size(); i++) {
			// String s
			// 데이터 타입이 Student
			Student s = list.get(i);
			System.out.println("학생 이름: "+s.name);
			for(int j =0; j<s.sublist.size(); j++) {
				Subject sub = s.sublist.get(j);
				System.out.println("과목명 :"+sub.sub+"점수 :"+sub.score);
			}
			System.out.println();
		}
	}

}
