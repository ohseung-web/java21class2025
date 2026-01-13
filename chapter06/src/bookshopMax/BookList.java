package bookshopMax;

import java.util.ArrayList;

public class BookList {
	
    // 멤버변수
	// 참조변수 이름 : booklist
	// booklist.get(0).getPrice() => 0번째 인덱스의 가격을 출력
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
   
   //최대값 확장 for문
   public void maxForInfo() {
	   int max=0;
	   String mName=null;
	   for(BookDTO bdt : booklist) {
		   // 현재 bdt에 저장된 값 =>booklist.get(0) bookTitle, price
		   if(max < bdt.getPrice() ) {
			   max = bdt.getPrice();
			   mName = bdt.getBooktitle();
		   }
	   }
	// 최대값 출력
	   System.out.printf("제목 : %s, 가격: %d",max,mName);
   }
   
   // 최대값 구하는 메소드
   public void maxInfo() {
	   int max = 0;
	   int mIndex = 0;
	   for(int i=0; i<booklist.size(); i++) {
		   if(max < booklist.get(i).getPrice()) {
			   max = booklist.get(i).getPrice();
			   mIndex = i;
		   }
	   }
	   // 최대값 출력
	   System.out.printf("제목 : %s, 가격: %d",
			   booklist.get(mIndex).getBooktitle(),
			   booklist.get(mIndex).getPrice()
			   );
   }
   
   
   // 출력 메소드  => main()메소드 작성해도 무방함
   public void bookInfo() {
	   System.out.println("===================================");
	   System.out.println("도서명\t저자\t\t가격");
	   System.out.println("==================================="); 
	   for(BookDTO b : booklist) {
		   b.showBook();
	   }
	   System.out.println("==================================="); 
   }
   
}
