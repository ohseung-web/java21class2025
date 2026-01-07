package methodClass;

public class Return02 {
	// 배열로된 데이터 타입을 매개변수로 사용하는 함수 작성
	public int test(int[] arr) {
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		// cnt는 4의 배수의 개수를 반환한다.
		return cnt;
	}
	
	public static void main(String[] args) {
		//항상 객체화 먼저 진행한다.
		Return02 r = new Return02();
		int[] arr02 = {1,4,7,10,8,40};
		//r.test(arr02);
		//r.test() 메서드는 4의 배수의 개수를 반환하는 함수
		// 고로 4의 배수에 해당하는 개수만 출력됨
		System.out.println(r.test(arr02));
	}
}
