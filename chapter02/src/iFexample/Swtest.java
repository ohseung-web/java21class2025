package iFexample;

public class Swtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='c';  // 대소문자 구분함
		switch(grade) {
		case 'A':System.out.println("VVIP 혜택");break;
		case 'B':System.out.println("VIP 혜택");break;
		case 'C':System.out.println("우수회원 혜택");break;
		case 'D':System.out.println("일반 혜택");break;
		default:System.out.println("혜택 NO!");break;
		}
		
		int value = 123;
		System.out.printf("상품의 가격은 %d\n",value);
		System.out.printf("상품의 가격은 %06d\n",value);
		System.out.printf("상품의 가격은 %6d",value);
		System.out.print("000");
		//System.out.printf("상품의 가격은 %-06d\n",value); -0사용금지 자연수는 -0이 존재하지 않는다. 
		
		String name="홍길동";
		int age=19;
		double score=92.411;
		double sum = 158/3;
		System.out.printf("%n 이름은 %s이고, 나이는 %d인 학생의 점수는 %.1f입니다.",name,age,sum);
		
	}

}
