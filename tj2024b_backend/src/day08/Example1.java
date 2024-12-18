package day08;

import java.util.Scanner;

import day08.Order;

public class Example1 {

	/*
	 * 자바 과제7 : (식당) 대기번호 발행 프로그램 - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) ,
	 * 클래스(멤버변수)/객체 , 배열 - 전화번호 , 인원수 를 입력받아서 저장·출력 구현 - 명단 클래스 설계한다. - 총 대기명단은 100개
	 * 까지 가능하다. 제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출
	 */

	public static void main(String[] args) { // main
		Order[] 예약목록 = new Order[100];

		while (true) {
			System.out.println("1. 등록 2. 출력 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if (choose == 1) {
				System.out.println(">> 등록 선택했습니다.");
				System.out.print("> 전화번호 : ");
				String 전화번호 = scan.next();
				System.out.print("> 인원수 : ");
				int 인원수 = scan.nextInt();

				boolean 예약여부 = false;
				for (int i = 0; i < 예약목록.length; i++) {
					if (예약목록[i] == null) {
						Order 예약 = new Order();
						예약.전화번호 = 전화번호;
						예약.인원수 = 인원수;
						예약여부 = true;
						예약목록[i] = 예약;
						break;
					}
				}
				if (예약여부) {
					System.out.println("예약되었습니다.");
				} else {
					System.out.println("** 예약 마감되었습니다. **");
				}
			} else if (choose == 2) {
				System.out.println(">> 출력 선택했습니다.");
				for (int i = 0; i < 예약목록.length; i++) {
					if (예약목록[i] != null) {
						System.out.printf("전화번호: %s , 인원수: %d\n", 예약목록[i].전화번호, 예약목록[i].인원수);
					}
				}
			}
		}
	} // main end

}
