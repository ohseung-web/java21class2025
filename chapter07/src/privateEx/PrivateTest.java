package privateEx;

public class PrivateTest {
   //public 접근제어자를 이용하여 멤버 변수를 정의 한다.
   // private 접근제어자는 같은 클래스에서만 접근을 허용한다.	
   private int day;
   private int month;
   private int year;
   
   //private 접근제어자는 getter, setter통하여 접근 가능하다.
   public int getDay() {
	return day;
   }
   public void setDay(int day) {
	   if(month == 2) {
		   if(day<1 || day>28) {
			  System.out.println("날짜오류");
		   }
	   }else {
		   this.day = day;
	   }
   }
   
   public int getMonth() {
	return month;
   }
   public void setMonth(int month) {
	this.month = month;
   }
   public int getYear() {
	return year;
   }
   public void setYear(int year) {
	this.year = year;
   }
   
}
