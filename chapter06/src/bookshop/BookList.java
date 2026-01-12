package bookshop;

import java.util.ArrayList;

public class BookList {
	// BookDTO를 ArrayList<> 넣어야 하는 이유 => 크기가 가변 길이이다.
	// => BookDTO[] book = new BookDTO[100];
	// ArrayList<BookDTO> booklist = new ArrayList<>();
	// => booklist[0] = {Booktitle:~,Author:~,pulisher:~,Date:~,price:~}
	// => booklist[1] = {Booktitle:~,Author:~,pulisher:~,Date:~,price:~}
	// => booklist[2] = {Booktitle:~,Author:~,pulisher:~,Date:~,price:~}
    // 멤버변수
	ArrayList<BookDTO> booklist;
    
    //디폴트 생성자
    public BookList() {
    	   booklist = new ArrayList<BookDTO>();
    }
   // 책 추가 메서드
   public void addBook(BookDTO bdto) {
	   // bdto.Booktitle로 접근할 수 있는 상태가 됨
	   booklist.add(bdto);
   }
   
   // 총계 구하는 메소드
   public int getTotal() {
	   int total = 0;
	   //확장 for문
	   for(BookDTO b:booklist) {
		   total += b.price;
	   }
	   
	   //데이터 타입이 void가 아니고 int이기때문에 반드시 return받아야 함
	   return total;   
   }
   
   // 출력 메소드  => main()메소드 작성해도 무방함
   public void bookInfo() {
	   System.out.println("===================================");
	   System.out.println("도서명\t저자\t\t출판사\t\t출판일\t가격");
	   System.out.println("==================================="); 
	   for(BookDTO b : booklist) {
		   b.showBook();
	   }
	   System.out.println("==================================="); 
   }
   
}
