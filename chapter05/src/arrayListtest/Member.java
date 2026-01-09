package arrayListtest;

public class Member {
	String name;
	String address;
	int age;
	
	public Member(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void printMember() {
		System.out.printf("이름 :%s%n주소: %s%n나이: %s%n",name,address,age);
	}
}
