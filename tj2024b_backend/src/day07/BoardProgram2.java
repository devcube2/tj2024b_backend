package day07;

import java.util.Scanner;

/*
 * 실습2 : 게시판 프로그램
 * 		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/개ㅔㄱ체
 * 		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 구현
 * 		- 게시물 3개 저장 하기 , 게시물1개당 제목/내용/작성자 저장소3개 필요 , 게시물3 --> 9개 필요. 
 */

public class BoardProgram2 {
	public static void main(String[] args) { // main
		// [5] 클래스 만들기 , 객체 생성
		Article article1 = new Article();
		Article article2 = new Article();
		Article article3 = new Article();

		// [1] 반복문 , while , while(true) { } 무한루프
		while (true) {
			// [2] 출력함수 , println
			System.out.println("1. 등록 2. 출력 : ");
			// [3] 입력함수 , Scanner ,
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			// [4] 조건문 , if , 코드의 흐름제어
			if (choose == 1) {
				System.out.println(">> 등록 선택했습니다.");
				System.out.print("> 제목 : ");
				String title = scan.next();
				System.out.print("> 내용 : ");
				String content = scan.next();
				System.out.print("> 작성자 : ");
				String writer = scan.next();

				// [6] 만약에 비어 있는 객체가 있으면
				if (article1.제목 == null) {
					article1.제목 = title;
					article1.내용 = content;
					article1.글쓴이 = writer;
				} else if (article2.제목 == null) {
					article2.제목 = title;
					article2.내용 = content;
					article2.글쓴이 = writer;
				} else if (article3.제목 == null) {
					article3.제목 = title;
					article3.내용 = content;
					article3.글쓴이 = writer;
				}
			} else if (choose == 2) {
				System.out.println(">> 출력 선택했습니다.");
				if (article1.제목 != null) {
					System.out.printf("제목 : %s - 내용 : %s - 글쓴이 : %s\n", article1.제목, article1.내용, article1.글쓴이);
				}
			}
		}
	} // main end
}
