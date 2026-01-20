package idExample04;

public class MainClass {

	public static void main(String[] args) {
		
		ShapeCalculator calculator =new ShapeCalculator();
        calculator.calculate(new Circle(5));
        calculator.calculate(new Rectangle(10,20));
        calculator.calculate(new Triangle(10,15));

	}

}
