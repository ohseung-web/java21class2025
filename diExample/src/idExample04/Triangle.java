package idExample04;

public class Triangle implements IShape{

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
	this.base = base;
	this.height = height;
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "삼각형";
	}

}
