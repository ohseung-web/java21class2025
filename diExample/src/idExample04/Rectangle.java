package idExample04;

public class Rectangle implements IShape {

	private double width;
	private double height;
	
	//생성자
	public Rectangle(double width,double height){
	this.width = width;
	this.height = height;
	}
	
	public void printINfo() {
		System.out.println(width+":"+height);
	}
	
	// 추상메소드
	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public String getShapeName() {
		return "직사각형";
	}

}
