package day06;

import java.util.Scanner;

/*
 * 자바 과제3 : (식당) 대기번호 발행 프로그램
 	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문)
 	- 전화번호 , 인원수 를 입력받아서 저장/출력 구현
 	- 총 대기명단은 3개 까지 가능하다. 대기명단 1개당 전화번호/인원수 저장소(변수) 2개 필요 ,
 	 	대기명단 --> 변수 6개 필요
 */

public class Example1 {

	public static void main(String[] args) {
		String 전화번호1 = null;
		int 인원수1 = 0;
		String 전화번호2 = null;
		int 인원수2 = 0;
		String 전화번호3 = null;
		int 인원수3 = 0;

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("===== 대기번호 발행 프로그램 =====");
			System.out.println("1. 저장");
			System.out.println("2. 출력");

			int 선택메뉴 = scan.nextInt();
			switch (선택메뉴) {
			case 1:
				System.out.print("전화번호: ");
				String 전화번호 = scan.next();
				System.out.print("인원수: ");
				int 인원수 = scan.nextInt();

				if (전화번호1 == null) {
					전화번호1 = 전화번호;
					인원수1 = 인원수;
				} else if (전화번호2 == null) {
					전화번호2 = 전화번호;
					인원수2 = 인원수;
				} else if (전화번호3 == null) {
					전화번호3 = 전화번호;
					인원수3 = 인원수;
				} else {
					System.out.println("** 등록 실패 : 저장공간부족 **");
				}
				break;
			case 2:
				if (전화번호1 != null) {
					System.out.println("전화번호1: " + 전화번호1);
					System.out.println("인원수1: " + 인원수1);
				}
				if (전화번호2 != null) {
					System.out.println("전화번호2: " + 전화번호2);
					System.out.println("인원수2: " + 인원수2);
				}
				if (전화번호3 != null) {
					System.out.println("전화번호1: " + 전화번호3);
					System.out.println("인원수1: " + 인원수3);
				}
			}
		}
	}
}
