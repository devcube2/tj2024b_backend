package day12;

import java.util.*;

public class BookService {
	private static int bookNo = 1; // 책번호 자동관리를 위한 static 변수
	private ArrayList<Book> bookList;

	public BookService() {
		bookList = new ArrayList<Book>();
	}

	// 도서 등록
	public void addBook(Scanner scan) {
		System.out.print("책이름: ");
		String name = scan.next();
		System.out.print("저자: ");
		String author = scan.next();
		System.out.print("가격: ");
		int price = scan.nextInt();

		bookList.add(new Book(bookNo++, name, author, price)); // 입력받은 값 기반하여, 북 객체 생성하여 북 리스트에 삽입한다.
	}

	// 도서 대여
	public boolean popBook(Scanner scan, Member member) {
		if (member == null) { // 비정상값 처리
			System.out.println("** 먼저 로그인 해야합니다. **");
			return false;
		}

		System.out.print("대여번호: ");
		int no = scan.nextInt();

		for (Book book : bookList) { // 관리자가 등록한 책 목록을 순회하며 입력한 번호의 책을 찾는다.
			if (book.getNo() == no) {
				if (book.getHasBook() == false) { // 이미 대여된 책
					System.out.printf("** %s 회원님께서 이미 대여한 도서입니다. **\n", book.getHasBookMember().getId());
					return false;
				}
				book.setHasBook(false);
				book.setHasBookMember(member);
				System.out.printf("도서대여 성공(번호: %d , 제목 : %s , 저자 : %s)\n", book.getNo(), book.getName(), book.getAuthor());
				return true;
			}
		}

		System.out.println("** 해당하는 도서가 없습니다. **");
		return false; // 번호에 해당하는 책 없음
	}

	// 도서 반납
	public boolean returnBook(Scanner scan, Member member) {
		System.out.print("대여번호: ");
		int no = scan.nextInt();

		for (Book book : bookList) {
			if (book.getNo() == no && book.getHasBook() == false) { // 책이 존재하고 대여된 책인가
				if (book.getHasBookMember() != null && book.getHasBookMember().getId().equals(member.getId())) { // 대여자가 직접 반납
					book.setHasBook(true);
					book.setHasBookMember(null); // 이제 대여한 멤버가 없는것으로 null 세팅한다.
					System.out.printf("도서반납 성공(번호: %d , 제목 : %s , 저자 : %s)\n", book.getNo(), book.getName(), book.getAuthor());
					return true; // 반납 성공
				}
			}
		}
		
		System.out.println("** 대여된 책이 아니거나 or 존재하지 않는 책이거나 or 대여자가 아닙니다. **");
		return false; // 반납 실패
	}

	// 도서 목록 출력
	public void printBookList() {
		if (bookList.isEmpty()) {
			System.out.println("** 도서 목록이 없습니다. **");
			return;
		}

		for (Book book : bookList) {
			System.out.printf("번호: %d 제목 : %s , 저자 : %s , 가격 : %d\n", book.getNo(), book.getName(), book.getAuthor(),
					book.getPrice());
		}
	}

	// 멤버가 대여한 도서 목록 출력
	public void printBookList(Member member) {
		if (bookList.isEmpty()) {
			System.out.println("** 도서 목록이 없습니다. **");
			return;
		}

		boolean isEmpty = true;
		for (Book book : bookList) {
			if (book.getHasBook() == false && book.getHasBookMember() != null) {
				if (book.getHasBookMember().getId().equals(member.getId())) {
					System.out.printf("번호: %d 제목 : %s , 저자 : %s , 가격 : %d\n", book.getNo(), book.getName(),
							book.getAuthor(), book.getPrice());
					isEmpty = false;
				}
			}
		}
		
		if (isEmpty) {
			System.out.println("** 대여 현황이 없습니다. **");
		}
	}
}
