package schedluer;

import java.util.Scanner;

public class SchedluerTest {
	 public static void main(String[] args) {
		 // Scanner 입력 L, P, R
		 Scanner scan = new Scanner(System.in);
		 System.out.println("전화 상담 배분 방식을 선택하세요 : R, L, P");
		 // R 또는 r, P 또는 p, L 또는 ㅣ
		 String ch = scan.next();
		 Schedluer sch = null; // 업캐스팅
		 
		 if("R".equals(ch) || "r".equals(ch) ) {
			 // RoundRobin을 인스턴스 한다.
			 sch = new RoundRobin();
		 }else if("P".equals(ch) || "p".equals(ch) ) {
			 // PriorityAllocation을 인스턴스 한다.
			 sch = new PriorityAllocation();
		 }else if("L".equals(ch) || "l".equals(ch) ) {
			 // LeastJob을 인스턴스 한다.
			 sch = new LeastJob();
		 }else {
			 System.out.println("지원하지 않는 기능");
			 return;
		 }
		 
		 //메소드 출력
		 
		 sch.getNextCall();
		 sch.sendCallToAgent();
		 sch.getLunch();
		 
		 
	 }
}
