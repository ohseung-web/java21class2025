package bookshopMax;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
  // DB의 데이터를 임시로 저장하는 공간으로 만들어놓은 클래스
  // 멤버변수 필수
  private String Booktitle;
  private String Author;
  private int price;

  
  //디폴트 생성자 
  public BookDTO() {};
  //매개변수 생성자
  // private 접근 제어자는 자기자신 클래스에서는 접근 할 수있다.
  public BookDTO(String Booktitle, String Author,int price) {  
	  //this란 => BookDTO 클래스를 의미
	  this.Booktitle = Booktitle;
	  this.Author = Author;
	  this.price = price;
	 
  }
  
  // 출력하는 메소드 생성
  public void showBook() {
	  //DecimalForamt을 사용해서 숫자의 형식을 변경하여 
	  DecimalFormat de = new DecimalFormat("#,##0원");
	  System.out.printf("%s\t%s\t\t%s%n",Booktitle,Author,de.format(price));
	  
  }
  //===    getter, setter
  
  public String getBooktitle() {
	return Booktitle;
  }
  public void setBooktitle(String booktitle) {
	Booktitle = booktitle;
  }
  public String getAuthor() {
	return Author;
  }
  public void setAuthor(String author) {
	Author = author;
  }
  public int getPrice() {
	return price;
  }
  public void setPrice(int price) {
	this.price = price;
  }
  
  
  
}
