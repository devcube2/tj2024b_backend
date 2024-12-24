package day12;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberService memberService = new MemberService(); // 멤버 관리 클래스
		BookService bookService = new BookService(); // 도서 관리 클래스
		Member logInMember = null; // 현재 로그인 한 멤버

		while (true) {
			if (logInMember == null) { // if start
				System.out.print("1.회원가입 2.로그인");
				int choose = scan.nextInt();
				if (choose == 1) {
					System.out.print("가입자 ID: ");
					String id = scan.next();
					System.out.print("가입자 Password: ");
					String password = scan.next();
					System.out.print("가입자 Name: ");
					String name = scan.next();
					System.out.print("관리자면 1, 아니면 2 입력: ");
					boolean isManager = ((scan.nextInt()) == 1);
					
					if (memberService.signUp(id, password, name, isManager) == 0) {
						System.out.println("가입성공");
					} else if (memberService.signUp(id, password, name, isManager) == -1) {
						System.out.println("** 가입 마감 **");
					} else if (memberService.signUp(id, password, name, isManager) == -2) {
						System.out.println("error: 입력값중 null 이 있습니다.");
					}
				} else if (choose == 2) {
					System.out.print("ID: ");
					String id = scan.next();
					System.out.print("Password: ");
					String password = scan.next();
					logInMember = memberService.signIn(id, password);
					if (logInMember != null) {
						System.out.println("로그인 성공");						
					} else {
						System.out.println("로그인 실패");
					}
				}
			} // if end
			else { // else start
				if (logInMember.isManager()) { // 관리자
					while (true) {
						System.out.println("1.도서등록 2.도서목록 3.로그아웃");
						int choose = scan.nextInt();
						if (choose == 1) {
							System.out.print("책이름: ");
							String name = scan.next();
							System.out.print("저자: ");
							String author = scan.next();
							System.out.print("가격: ");
							int price = scan.nextInt();							
							bookService.addBook(new Book(name, author, price)); // TODO: null 포인터 익셉션 나는 이유 분석해볼것...							
						}
						else if (choose == 2) {
							for (Book book : bookService.getBookList()) {
								System.out.printf("책제목 : %s , 저자 : %s , 가격 : %d\n", book.getName(), book.getAuthor(), book.getPrice());
							}
						}
						else if (choose == 3) {							
							 // 로그인 된 멤버를 null 초기화하고 break 를 통해 현재 루프를 빠져나간다.
							logInMember = null;
							break;
						}
					}
				}
				else { // 관리자 아님
					
				}
			} // else end
			
		}
	}
}
