package idExample04;

public class Circle implements IShape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14* radius * radius;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return"원";
	}

}
