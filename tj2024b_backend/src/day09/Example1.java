package day09;

import java.util.Scanner;

import day09.Order;
import day09.Orders;

public class Example1 {
	/*
	 * 자바 과제8 : (식당) 대기번호 발행 프로그램 - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 전화번호 ,
	 * 인원수 를 입력받아서 저장함수 - 출력함수 구현하기 명단 클래스 설계한다. 총 대기명단은 100개 까지 가능하다.
	 */

	public static void main(String[] args) { // main
		Orders orders = new Orders(100); // 100명 까지 예약 가능

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("1. 등록 2. 출력");
			int choose = scan.nextInt();
			if (choose == 1) {
				System.out.print("> 전화번호 : ");
				String 전화번호 = scan.next();
				System.out.print("> 인원수 : ");
				int 인원수 = scan.nextInt();
				System.out.println(orders.addOrder(전화번호, 인원수));
			} else if (choose == 2) {
				orders.printOrder();
			}
		}
	} // main end
}
