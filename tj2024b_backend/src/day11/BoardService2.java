package day11;

import java.util.Scanner;

public class BoardService2 {
	// 1. 멤버변수 // BoardService 당 회원 한명..
	String id = "";
	String password = "";
	boolean login = false;
	// 2. 생성자
	// 3. 메소드
	// 3-1. 게시물 등록
	public void boardAdd(Scanner scan, BoardDto[] boards) {
		System.out.print("제목: "); String title = scan.next();
		System.out.print("내용: "); String content = scan.next();
		String writer = id; // 로그인 아이디 대입
		
		// * 생성자를 이용한 객체 생성
		BoardDto boardDto = new BoardDto(title, content, writer);
		// * 배열에 저장
		boolean saveState = false;
		for (int index = 0; index < boards.length; index++) {
			if (boards[index] == null) {
				boards[index] = boardDto;
				saveState = true;
				break;
			}
		}
		if (saveState) {
			System.out.println("등록 성공");
		}
		else {
			System.out.println("등록 실패");
		}
	}
	
	public void boardPrint(BoardDto[] boards) {
		for (int index=0; index < boards.length; index++) {
			if (boards[index] != null) {
				System.out.printf("제목 : %s , 내용 : %s , 작성자 : %s\n", 
						boards[index].getTitle() ,
						boards[index].getContent() ,
						boards[index].getWriter()
				);
			}
		}
	}
	
	// 회원가입 함수
	public String join(Scanner scan) {
		System.out.print("ID: "); String id = scan.next();
		System.out.print("Password: "); String password = scan.next();
		this.id = id;
		this.password = password;
		return "가입되었습니다.";		
	}
	
	// 로그인 함수
	public String login(Scanner scan) {
		System.out.print("ID: "); String id = scan.next();
		System.out.print("Password: "); String password = scan.next();
		
		if (this.id.equals(id) && this.password.equals(password)) {
			this.login = true;
			return "로그인 성공";
		}
		this.login = false;
		return "로그인 실패";		
	}
}
