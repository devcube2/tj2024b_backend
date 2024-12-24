package day12;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberService memberService = new MemberService(); // 멤버 관리 클래스
		BookService bookService = new BookService(); // 도서 관리 클래스
		Member logInMember = null; // 현재 로그인 한 멤버

		while (true) {
			if (logInMember == null) { // 로그인 되어 있지 않으면 // if start
				System.out.print("1.회원가입 2.로그인");
				int choose = scan.nextInt();
				if (choose == 1) {
					if (memberService.signUp(scan)) { // 회원가입 메소드 호출
						System.out.println("가입성공");
					}
				} else if (choose == 2) {
					logInMember = memberService.signIn(scan); // 로그인 메소드 호출, 성공시 해당하는 멤버객체 리턴됨
					if (logInMember != null) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패");
					}
				}
			} // if end
			else { // else start // 로그인된 멤버 존재하면 여기 분기로 탄다.
				if (logInMember.isManager()) { // 관리자 모드
					while (true) {
						System.out.println("1.도서등록 2.도서목록 3.로그아웃");
						int choose = scan.nextInt();
						if (choose == 1) {
							bookService.addBook(scan);
						} else if (choose == 2) {
							bookService.printBookList(); // 도서목록 출력
						} else if (choose == 3) {
							// 로그인 된 멤버를 null 초기화하고 break 를 통해 현재 무한루프를 빠져나간다.
							logInMember = null;
							break;
						}
					}
				} else { // 일반인 모드
					while (true) {
						System.out.println("1.도서대여 2.도서반납 3.대여현황 4.로그아웃");
						int choose = scan.nextInt();
						if (choose == 1) {
							bookService.popBook(scan, logInMember);
						} else if (choose == 2) {
							bookService.returnBook(scan, logInMember);
						} else if (choose == 3) {
							bookService.printBookList(logInMember); // 도서목록 출력
						} else if (choose == 4) {
							// 로그인 된 멤버를 null 초기화하고 break 를 통해 현재 무한루프를 빠져나간다.
							logInMember = null;
							break;
						}
					}
				}
			} // else end

		}
	}
}
