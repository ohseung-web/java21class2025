package classpart10;

public class ClassEx10 {
   //멤버 변수
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	int maxindex; 
	int minindex;
	//생성자
	public ClassEx10() {};
	
	//전교생 출력
	public void choice1() {
		for(int i=0; i<arHakbun.length; i++) {
			System.out.println((i+1)+": "+arHakbun[i]+"("+arScore[i]+")");
		}
		System.out.println();
	}
	
	//전교1등 출력함수
	public void choice2() {
		int maxScore=0; //최대값
		for(int i=0; i<arHakbun.length; i++) {
			if(maxScore < arScore[i]) {
				maxScore = arScore[i];
				maxindex = i;
			}
		}
		System.out.println("1등 학생 :"+arHakbun[maxindex]+"학번"+"("+arScore[maxindex]+"점)");
	}

	//전교 꼴등 함수 
	public void choice3() {
		int minScore = arScore[0]; //최소값
		for(int i=0; i<arScore.length; i++) {
			if(minScore > arScore[i]) {
				minScore = arScore[i];
				minindex = i;
			}
		}
		System.out.println("꼴등 학생 :"+arHakbun[minindex]+"학번"+"("+arScore[minindex]+"점)");
	}
	
	//학번 입력받아 => 점수
	//존재하지 않는 학번의 예외처리 함
	public void choice4(int hakbun) {
		int chk = -1;
		for(int i=0; i<arScore.length; i++) {
			if(arHakbun[i] == hakbun ) {
				chk = i;
				break;
			}
		}
		
		// chk 값은 for문 밖에서 if로 비교한다.
		if(chk == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.println(arHakbun[chk]+"학번 성적 :"+arScore[chk]+"점");
		}
	}
	
	
	
	
	
}
