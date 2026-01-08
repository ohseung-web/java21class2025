package classpart08;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ClassEx08 e08 = new ClassEx08();
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("값을 두개 입력:");
	   int x = scan.nextInt();
	   int y = scan.nextInt();
	   
	   System.out.println(e08.add(x, y));
	   System.out.println(e08.minus(x, y));
	   
		
	}

}
