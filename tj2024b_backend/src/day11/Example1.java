package day11;

import java.util.Scanner;

import day09.Members;

/*
	자바 과제11 : 회원제 게시판
		- 초기메뉴는 로그인 과 회원가입 를 제공한다.
		- 로그인 성공하면 게시물 등록과 게시물 출력을 제공합니다.
			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
	
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출
 */

public class Example1 {
	public static void main(String[] args) { // main start
		BoardDto[] boards = new BoardDto[100];
		BoardService2 bs = new BoardService2();

		Scanner scan = new Scanner(System.in);

		while (true) { // while start
			if (!bs.login) { // 로그인 되어있지 않으면
				System.out.print("1.회원가입 2.로그인");

				int choose = scan.nextInt();
				if (choose == 1) {
					// 회원가입함수 호출
					System.out.println(bs.join(scan));
				} else if (choose == 2) {
					// 로그인함수 호출
					System.out.println(bs.login(scan));
				} // if end
			} else {
				System.out.print("1.등록 2.출력 3.로그아웃");

				int choose = scan.nextInt();
				if (choose == 1) {
					// 등록함수 호출
					bs.boardAdd(scan, boards);
				} else if (choose == 2) {
					// 출력함수 호출
					bs.boardPrint(boards);
				} else if (choose == 3) {
					bs.login = false;
				} // if end
				
			}
		} // while end
	} // main end
}
