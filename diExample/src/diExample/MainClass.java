package diExample;

public class MainClass {

	public static void main(String[] args) {
		// MyCal 객체화
		MyCal mycal = new MyCal();
		
		mycal.cal(20, 10, new Caladd());
		mycal.cal(20, 10, new Calsub());
		mycal.cal(20, 10, new Calmul());
		mycal.cal(20, 10, new Caldiv());
		
	}

}
