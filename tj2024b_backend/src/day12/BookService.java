package day12;

import java.util.*;

public class BookService {
	private static int bookNo = 1;
	private ArrayList<Book> bookList;
	
	public BookService() {
		bookList = new ArrayList<Book>();
	}
	
	// 도서 등록
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// 도서 대여
	public Book popBook(String bookName) { // 과제라 제목 중복은 고려하지 않았음..
		for (Book book : bookList) {
			if (book.getName().equals(bookName)) {
				return book;
			}
		}
		return null;
	}
	
	// 도서 반납
	public void returnBook(Book book) {
		bookList.add(book); // 반납도 도서 등록과 처리가 같음
	}	
	
	// 도서 목록	
	public ArrayList<Book> getBookList() {
		return bookList;
	}
}
