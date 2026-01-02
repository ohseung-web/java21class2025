package example;

import java.util.Arrays;

public class Arrtest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0; //유효한 값의 개수를 세어 담을 변수
		//double[] data = new double[5];
		//data[0]=10.0;size++;
		//data[1]=20.0;size++;
		//data[2]=30.0;size++;
		double[] data = {10.0,20.0,30.0,0.0,0.0};
		System.out.println(Arrays.toString(data));
		int total = 1;
		// data.length가 5이고, 초기값은 인덱스 0,1,2만 지정
		// 나머지는 0.0 이므로 무조건 0이 출력됨
		for(int i=0; i<size; i++) {
			total *= data[i];
		}
		System.out.println(total);		
	}

}
