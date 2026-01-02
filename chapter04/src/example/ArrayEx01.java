package example;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
//		문제1) 10부터 50까지 arr 배열에 저장
//		정답1) 10 20 30 40 50
//				
//		문제2) 4의 배수만 출력
//		정답2) 20 40
//				
//		문제3) 4의 배수의 합 출력
//		정답3) 60
//				
//		문제4) 4의 배수의 개수 출력
//		정답4) 2
//				
//		문제5) 짝수의 개수 출력
//		정답5)
		
		int[] arr = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i=0; i<arr.length; i++) {
			 if(arr[i] % 4 == 0) {
				 sum += arr[i];
				 cnt ++;
				 //System.out.println(arr[i]);
			 }
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt2 ++;
				//System.out.println(arr[i]);
			}
		}
         
		System.out.println(sum);	
		System.out.println(cnt);	
		System.out.println(cnt2);	
	}

}
