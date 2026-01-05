package multiexample;

public class Compare_example {

	public static void main(String[] args) {
		// CompareTo()메서드는 String pool과 전혀
		// 상관 없이 문자열의 내용만을 비교한다.
		// A.compareTo(B) => 결과는 0, 음수, 양수로 출력
		// A와 B가 같으면 0이 출력된다.
		// A가 B보다 사전적으로 순서가 앞이면 음수 출력
		// A가 B보다 사전적으로 순서가 뒤이면 양수 출력
		
		 String str1="가";
		 String str2="나";
		 String str3="가";
		 
		 //유니코드로 가=44032, 나=45208
		 int result1 = str1.compareTo(str2);
		 System.out.println(result1); // -1176
		 
		 int result2 = str2.compareTo(str1);
		 System.out.println(result2);//1176
		 
		 int result3 = str1.compareTo(str3);
		 System.out.println(result3);//0
		 
		 if(result3 != 0) {
			 System.out.println("같은 문자가 존재하지 않습니다.");
		 }else {
			 System.out.println("같은 문자");
		 }

	}

}
