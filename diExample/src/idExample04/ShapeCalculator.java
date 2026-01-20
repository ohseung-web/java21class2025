package idExample04;

public class ShapeCalculator {
	public void calculate(IShape shape) { // DI => @AutoWride
		//double area = shape.calculateArea();
		System.out.println(shape.getShapeName() + "의 면적: " + shape.calculateArea());
	}
}
