package interfaceExample01;

public class Refrigerator implements Buyable {
	 //멤버 변수
		String name="냉장고";
		String model;
		String denggub;
		int price;
	//생성자
		public Refrigerator(String model, String denggub,int price) {
			this.model = model;
			this.denggub = denggub;
			this.price = price;
		}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getMaker() {
		// TODO Auto-generated method stub
		return denggub;
	}
}
