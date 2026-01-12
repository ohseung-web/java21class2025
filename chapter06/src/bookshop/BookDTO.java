package bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
  // DB의 데이터를 임시로 저장하는 공간으로 만들어놓은 클래스
  // 멤버변수 필수
  String Booktitle;
  String Author;
  String publisher;
  Date Date;
  int price;
  
  //디폴트 생성자 
  public BookDTO() {};
  //매개변수 생성자
  public BookDTO(String Booktitle, String Author,String publisher,Date Date, int price) {  
	  //this란 => BookDTO 클래스를 의미
	  this.Booktitle = Booktitle;
	  this.Author = Author;
	  this.publisher = publisher;
	  this.Date  = Date;
	  this.price = price;  
  }
  
  // 출력하는 메소드 생성
  public void showBook() {
	  //DecimalForamt을 사용해서 숫자의 형식을 변경하여 
	  //출력하면 문자가 됨을 주의하자!!
	  DecimalFormat de = new DecimalFormat("#,##0원");
	  //SimpleDateFormat을 이용하여 날짜의 형식을 변경하여 출력
	  //SimpleDateFormat을 이요해 변경한 날짜는 문자이다.
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
	  System.out.printf("%s\t%s\t\t%s\t%s\t%s%n",Booktitle,Author,publisher,sdf.format(Date),de.format(price));
	  
  }
  
}
