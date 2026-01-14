package poltest;

public class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
		}

}
 class  Hauman extends Animal {
	public void move() {
		System.out.println("사람은 두발로 걷습니다");
	}
	
}
 class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
}
 class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다");
	}
	
}
