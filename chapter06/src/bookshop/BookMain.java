package bookshop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		// 개체화 해야 되는 대상 : BookList 클래스를 객체화 한다.
		BookList list = new BookList();
		//입력용 날짜형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//합계 출력용 DecimalForamt 객체 생성한다.
		DecimalFormat de = new DecimalFormat("\u00A4#,##0원");
		// BookDTO에 데이터를 객체화하여 삽입한다.
		list.addBook(new BookDTO("Java","홍길동","코리아출판사",sdf.parse("2026-01-12"),35000));
		list.bookInfo();
		System.out.println("합계 :"+de.format(list.getTotal()));
	}

}
