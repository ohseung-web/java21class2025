package interfaceExample01;

public class Television implements Buyable{
    //멤버 변수
	String name="텔레비전";
	String model;
	String maker;
	int price;
	
	//생성자
	public Television(String model, String maker,int price) {
		this.model = model;
		this.maker = maker;
		this.price = price;
	}
	
	@Override
	public String getName() {
	
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
		return model;
	}

	@Override
	public String getMaker() {

		return maker;
	}

}
