package classpart;

public class Bicycle {
   //멤버변수
   String color;
   int price;
   
   // 기본 생성자
   public Bicycle() {
	   System.out.println("Bicycle constructor -I");
   }
   // 매개변수가 존재하는 생성자
   public Bicycle(String c, int p) {
	   System.out.println("Bicycle constructor -II");
	   color = c;
	   price = p;
   }
   
   // 기능 = 메서드
   // 출력 메서드 생성
   public void info() {
	   System.out.println("-- info --");
	   System.out.println("color :"+color);
	   System.out.println("price :"+price);
   }
   
   public static void main(String[] args) {
	   Bicycle mybi = new Bicycle();
	   mybi.info();
	   
	   Bicycle mybi2 = new Bicycle("red",100000);
	   mybi2.info();
	   
   }
   
}
