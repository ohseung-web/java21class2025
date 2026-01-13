package bookshopMax;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		// 개체화 해야 되는 대상 : BookList 클래스를 객체화 한다.
		BookList list = new BookList();
		
		// BookDTO에 데이터를 객체화하여 삽입한다.
		list.addBook(new BookDTO("Java","홍길동",100000));
		list.addBook(new BookDTO("이펙티브","개나리",15000));
		list.addBook(new BookDTO("클린 코드","진달래",85000));
		list.bookInfo();
		list.maxInfo();
		
	}

}
