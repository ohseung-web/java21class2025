package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx04 {

	public static void main(String[] args) {
		// 고객명, 포인트점수 => 추가 
		// (고객명 포인트점수)(고객명 포인트점수),같은 고객이면
		// 포인트 점수 누적 시켜라
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> pointM = new HashMap<String, Integer>();
        System.out.println("** 포인트 관리 프로그램 **");
        
        while(true) {
        	 System.out.print("이름과 포인트 입력 >>");
        	 String keyvalue = scan.nextLine();
        	 if(keyvalue.equals("그만")) break;
        	 StringTokenizer st = new StringTokenizer(keyvalue);
        	 //고객명
        	 String name = st.nextToken().trim();
        	 //포인트
        	 Integer pointNum = Integer.parseInt(st.nextToken().trim());
        	 
        	 // key값인 고객명이 존재하는지 체크
        	 if(pointM.containsKey(name)) {
        		 // 같은 고객명이 존재하면 포인트 점수를 누적한다.
        		 pointNum += pointM.get(name);
        	 }
        	 
        	 // pointM 참조변수 저장
        	 pointM.put(name, pointNum);
        	 
        	 // 출력
        	 for(String keys : pointM.keySet()) {
        		 // Integer pointScore = pointM.get(keys);
        		  System.out.println("("+keys+pointM.get(keys)+")"); 
        		//  System.out.println("("+keys+pointScore+")"); 
        	 }
        	 
        }
	}

}
