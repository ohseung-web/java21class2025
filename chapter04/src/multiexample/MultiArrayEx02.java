package multiexample;

import java.util.Scanner;

public class MultiArrayEx02 {

	public static void main(String[] args) {
		// 2차원배열 기본문제[1단계]
		// 10 20 30
		// 40 50 60
		// 70 80 90
		Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3]; // 현재 arr초기값 0이다.
        int cnt =1; //누적
        int tot =0;//총계
        for(int i=0; i<arr.length; i++) {
        		for(int j=0; j<arr[i].length; j++) {
        			arr[i][j] = cnt * 10;
        			cnt ++;
        			System.out.print(arr[i][j]+" ");
        			tot += arr[i][j];
        		}
        		System.out.println();
        }
        // 두 값을 입력 받아 그 값들의 위치를 찾아, 서료 값을 교환
        System.out.println("---------------");
        System.out.print("값1: ");
        int num1 = scan.nextInt();
        System.out.print("값2:");
        int num2 = scan.nextInt();
        // 값의 인덱스 위치를 찾을 변수 4개 선언
        int n1Idx01=0,n1Idx02=0,n2Idx01=0,n2Idx02=0;
        // 값을 교환하기위해 임시기억장소인 temp를 지정
        int temp =0; // 값을 교환할 때 빈바구니 역할함
        
        // 아래 for문은 내가 입력한 인덱스 값을 찾는 코드
        for(int i=0; i<arr.length; i++) {
        	    for(int j=0; j<arr[i].length; j++) {
        	    		if(num1 == arr[i][j]) {
        	    			n1Idx01 = i;
        	    			n1Idx02 =j;
        	    		}
        	    		if(num2 == arr[i][j]) {
        	    			n2Idx01 = i;
        	    			n2Idx02 = j;
        	    		}
        	    }
        }
        
        // 찾은 값들을 서료 교환하는 코드
        // temp =0 -> 60 => temp = 60;
        // arr[n1Idx01][n1Idx02] = arr[n2Idx01][n2Idx02]
        // arr[n2Idx01][n2Idx02] = 60
        // 자료 구조 stack를 이용한 로직 
        temp = arr[n1Idx01][n1Idx02];
        arr[n1Idx01][n1Idx02] = arr[n2Idx01][n2Idx02];
        arr[n2Idx01][n2Idx02] = temp;
        
        // 값 출력
        for(int i=0; i<arr.length; i++) {
	    	    for(int j=0; j<arr[i].length; j++) {
	    	    		System.out.print(arr[i][j]+ " ");
	    	    }
	    	    System.out.println();
        }
    
	}

}
