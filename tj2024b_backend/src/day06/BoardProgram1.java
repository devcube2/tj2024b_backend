package day06; // 현재 클래스가 위치한 패키지/폴더 명

import java.util.Scanner;

/*
 * 실습1 : 게시판 프로그램
 * 		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문)
 * 		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 구현
 * 		- 게시물 3개 저장 하기 , 게시물1개당 제목/내용/작성자 저장소3개 필요 , 게시물3 --> 9개 필요. 
 */

public class BoardProgram1 { // class start // 자바 모든 코드는 class 안에 존재한다.

	public static void main(String[] args) { // main start // 자바의 모든 실행 코드는 main 안에서 시작된다.
		String 제목1 = null;
		String 내용1 = null;
		String 작성자1 = null;
		String 제목2 = null;
		String 내용2 = null;
		String 작성자2 = null;
		String 제목3 = null;
		String 내용3 = null;
		String 작성자3 = null;

		while (true) { // 무한루프
			// - 출력함수
			System.out.println("===== 게시판 프로그램 =====");
			// - 입력함수
			Scanner scan = new Scanner(System.in);
			int 선택메뉴 = scan.nextInt(); // - 우리가 정의한 메뉴번호 선택받기 // - 입력받은 값저장

			if (선택메뉴 == 1) {
				System.out.println(">> 1. 등록 선택했습니다.");
				System.out.println("> 제목 : ");
				String title = scan.next();
				System.out.println("> 내용 : ");
				String content = scan.next();
				System.out.println("> 작성자 : ");
				String writer = scan.next();

				if (제목1 == null) { // 변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어 있으면
					제목1 = title;
					내용1 = content;
					작성자1 = writer;
				} else if (제목2 == null) { // 변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어 있으면
					제목2 = title;
					내용2 = content;
					작성자2 = writer;
				} else if (제목3 == null) { // 변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어 있으면
					제목3 = title;
					내용3 = content;
					작성자3 = writer;
				} else {
					System.out.println("** 등록 실패 : 게시물 작성공간이 부족합니다. **");
				}
			} else if (선택메뉴 == 2) {
				System.out.println(">> 2. 출력 선택했습니다.");
				if (제목1 != null) {
					System.out.println("> 제목 : " + 제목1 + " > 내용 : " + 내용1 + " > 작성자 : " + 작성자1);
				}
				if (제목2 != null) {
					System.out.println("> 제목 : " + 제목2 + " > 내용 : " + 내용2 + " > 작성자 : " + 작성자2);
				}
				if (제목3 != null) {
					System.out.println("> 제목 : " + 제목3 + " > 내용 : " + 내용3 + " > 작성자 : " + 작성자3);
				}
			} else if (선택메뉴 == 3) {
				System.out.println(">> 3. 수정 선택했습니다.");
			} else if (선택메뉴 == 4) {
				System.out.println(">> 4. 삭제 선택했습니다.");
			}
		}
	} // main end
} // class end
