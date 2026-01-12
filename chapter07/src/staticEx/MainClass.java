package staticEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx01 park = new StaticEx01("박찬호");
		park.sMoney(100);
		park.getBankInfo();
		System.out.println(park.atm);
		System.out.println("--------------");
		
		StaticEx01 lee = new StaticEx01("이승엽");
		lee.sMoney(200);
		lee.getBankInfo();
		lee.spendMoney(100);
		System.out.println(lee.atm);
	}

}
