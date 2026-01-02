package example;

public class Testfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int dan=2; dan<=9; dan++) {
//			 for(int times=1; times<=9; times++) {
//				 System.out.printf("%d X %d = %d%n",dan,times,(dan*times));
//			 }
//			 System.out.println();
//		}
		
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(j==2) {
//					break;
					continue;
				}
				System.out.println("안의 분기문"+j);
			}
			System.out.println("밖의 분기문"+i);
			break;
		}
		System.out.println("루프 밖");
		
		// 각 배열에 초기값을 지정하지 않았을때의 기본 값 출력
		String[] str = new String[3]; //객체배열
		for(int i=0; i<str.length; i++) {
			// str[i]에 아무 값도 없는데,
			// 그 상태에서 equals()라는 기능을 사용하려고 해서 오류가 발생
			// null은 객체가 아니므로 메서드를 사용할 수 없다
			 if(str[i] == null) {
				 System.out.println("안녕");
			 }else {
				 System.out.println(str[i]);
			 }
		}
		
		int[] arr=new int[3]; //정수 배열
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		double[] dou=new double[3]; // 실수 배열
		for(int k=0; k<dou.length;k++) {
			System.out.println(dou[k]);
		}
		
		
	}

}
