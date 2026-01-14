package polymorphism;

public class AnimalTest {
    
	public static void main(String[] args) {
		AnimalTest ates = new AnimalTest();
		// 현재 moveAnimal()메소드는 매개변수로 Animal을
		// 데이터 타입으로 가진다.
		// 부모를 데이터 타입으로  자식 객체 참조변수 
		ates.moveAnimal(new Hauman());
		ates.moveAnimal(new Tiger());
		ates.moveAnimal(new Eagle());
	}
	
	
	// 데이터 타입이 Animal
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
