package diExample;

// 더하기 함수를 모듈화(=부품화)
// 부품화를 해야 되는 이유는 자바는 느슨한 결합이 기본원칙
// 느슨한 결합이어야 유지보수, 협업이 편해진다.
public class Caladd implements Ical {

	//단, 추상메소드는 반드시 재정의 해야 한다.
	@Override
	public int doOper(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
}
