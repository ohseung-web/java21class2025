package arrayListEx03;

import java.util.Scanner;

public class Player {
   //멤버 변수  player하는 사람
	String name;
	
	//생성자
	public Player() {};
	
	//매개변수 생성자
	public Player(String name) {
		this.name = name;
	}
	
	// 자신의 차례의 단어 입력하는 scanner 메소드
	public String sayWord(Scanner scan) {
		System.out.print(name+" >> ");
		return scan.next();
	}
	
	
	
	
	
	
}
