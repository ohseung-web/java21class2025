package classpart09;

import java.util.Random;

public class ClassEx09 {
   
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[");
		for(int i=0; i<x.length; i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.println(x[i]+" ");
		}System.out.print("]");
	}
	
	//합계
	public int total(int[] x) {
		int sum = 0;
		// int => 정수이다. 소수점 출력이 안됨
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	
	//평균
	public double avgInfo(int[] x) {
		// 위의 total(x) 호출
		int sum = total(x);
		// 명시적 형변환 함
		return (double)sum /x.length;
	}
	
	//최대값
	public int firstplace(int[] x) {
		int max = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	//최소값
	public int lastplace(int[] x) {
		// 최소값은 초기값을 0으로 지정하면 무조건 0나옴
		int min = x[0];
		for(int i=0; i<x.length; i++) {
			if(min > x[i]) {
				min = x[i];
			}
		}
		return min;
	}
	

}
