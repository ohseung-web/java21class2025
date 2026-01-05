package multiexample;

public class MultiArrayEx01 {

	public static void main(String[] args) {
		// 2차원배열 기본문제[1단계]
		// 10 20 30
		// 40 50 60
		// 70 80 90
        int[][] arr = new int[3][3]; // 현재 arr초기값 0이다.
        int cnt =1; //누적
        int tot =0;//총계
        for(int i=0; i<arr.length; i++) {
        		for(int j=0; j<arr[i].length; j++) {
        			arr[i][j] = cnt * 10;
        			//System.out.println("누적개수:"+cnt);
        			cnt ++;
        			System.out.print(arr[i][j]+" ");
        			tot += arr[i][j];
        			//System.out.println("총계:"+tot);
        		}
        		System.out.println();
        }
        
        // 문제2) 전체 합 출력
        //       정답) 450

        
        
        // 문제3) 4의 배수와, 개수를 출력
        	//	     정답) 20 40 60 80 

        
        // 문제4) 4의 배수의 합 출력
        //       정답 3) 200

        
	}

}
