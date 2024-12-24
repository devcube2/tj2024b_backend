package day12;

public class Book {	
	private int no; // 책 번호	
	private String name; // 책 제목
	private String author; // 책 저자
	private int price; // 책 가격
	private boolean hasBook; // 대여중인지 여부
	
	public Book(String name, String author, int price) {
		setName(name);
		setAuthor(author);
		setPrice(price);		
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setHasBook(boolean hasBook) {
		this.hasBook = hasBook;
	}
	public boolean getHasBook() {
		return hasBook;
	}
}