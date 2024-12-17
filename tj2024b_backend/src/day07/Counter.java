package day07;

import java.util.Scanner;

/*
자바 과제5 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 3개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

public class Counter {
	public static void main(String[] args) { // main
		// [5] 클래스 만들기 , 객체 생성
		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();

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
				System.out.print("> 전화번호 : ");
				String 전화번호 = scan.next();
				System.out.print("> 인원수 : ");
				int 인원수 = scan.nextInt();

				// [6] 만약에 비어 있는 객체가 있으면
				if (order1.전화번호 == null) {
					order1.전화번호 = 전화번호;
					order1.인원수 = 인원수;
				} else if (order2.전화번호 == null) {
					order2.전화번호 = 전화번호;
					order2.인원수 = 인원수;
				} else if (order3.전화번호 == null) {
					order3.전화번호 = 전화번호;
					order3.인원수 = 인원수;
				} else {
					System.out.println("예약인원 초과");
				}
			} else if (choose == 2) {
				System.out.println(">> 출력 선택했습니다.");
				if (order1.전화번호 != null) {
					System.out.printf("전화번호 : %s - 인원수 : %d\n", order1.전화번호, order1.인원수);
				}
				if (order2.전화번호 != null) {
					System.out.printf("전화번호 : %s - 인원수 : %d\n", order2.전화번호, order2.인원수);
				}
				if (order3.전화번호 != null) {
					System.out.printf("전화번호 : %s - 인원수 : %d\n", order3.전화번호, order3.인원수);
				}
			}
		}
	} // main end
}
