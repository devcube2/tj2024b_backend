package day06;

import java.util.Scanner;

/*
	자바 과제4 : 키오스크 프로그램
	- 제품은 콜라, 사이다, 환타 인 3개가 존재합니다.
	- 각 제품의 재고는 초기에 10개씩 존재한다.
	- 각 제품의 가격은 콜라 1000원, 사이다 1500원, 환타 2000원
	- 제품을 선택시 재고 1 차감하고 장바구니에 담는다.
	- 메뉴] 1. 콜라 2. 사이다 3. 환타 4. 결제
		1 선택시 : 콜라 선택시 콜라 재고 1 차감하고 장바구니에 담는다.
		2 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
		3 선택시 : 환타 선택시 환타 재고 1 차감하고 장바구니에 담는다.
		4 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다.
			ex] 콜라1개 , 사이다2개 , 환타0개 총금액 : 4000원
		* 추가 유효성검사 : 만일 재고가 부족하면 "재고가 부족합니다" 라고 출력하시오.
	
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출
 */

public class Example2 {

	public static void main(String[] args) {
		int 콜라재고 = 10;
		int 사이다재고 = 10;
		int 환타재고 = 10;
		int 콜라가격 = 1000;
		int 사이다가격 = 1500;
		int 환타가격 = 2000;
		int 콜라구매개수 = 0;
		int 사이다구매개수 = 0;
		int 환타구매개수 = 0;

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 콜라 2. 사이다 3. 환타 4. 결제");
			int 선택번호 = scan.nextInt();
			switch (선택번호) {
			case 1:
				if (콜라재고 > 0) {
					콜라구매개수++;
					콜라재고--;
				} else {
					System.out.println("** 재고가 부족합니다. **");
					break;
				}
				System.out.println("콜라1개 담았습니다.");
				break;
			case 2:
				if (사이다재고 > 0) {
					사이다구매개수++;
					사이다재고--;
				} else {
					System.out.println("** 재고가 부족합니다. **");
					break;
				}
				System.out.println("사이다1개 담았습니다.");
				break;
			case 3:
				if (환타재고 > 0) {
					환타구매개수++;
					환타재고--;
					break;
				} else {
					System.out.println("** 재고가 부족합니다. **");
				}
				System.out.println("환타1개 담았습니다.");
				break;
			case 4:
				int 콜라값 = 콜라구매개수 * 콜라가격;
				int 사이다값 = 사이다구매개수 * 사이다가격;
				int 환타값 = 환타구매개수 * 환타가격;
				System.out.printf("콜라: %d개 사이다: %d개 환타: %d개 총금액 : %d원\n\n", 콜라구매개수, 사이다구매개수, 환타구매개수, 콜라값 + 사이다값 + 환타값);
				break;
			}
		}
	}

}
