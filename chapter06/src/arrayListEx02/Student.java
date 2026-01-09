package arrayListEx02;

import java.util.ArrayList;

public class Student {
   //멤버 변수
   //학생 이름
	String name;
	
	//멤버 변수 ArrayList<Subject> sublist
	//ArrayList<Subject> sublist = new ArrayList<Subject>();
	ArrayList<Subject> sublist ;
	//생성자
	public Student() {
		sublist = new ArrayList<Subject>();
	}
	
}
