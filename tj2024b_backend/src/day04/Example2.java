package day04;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * while (조건식) { 실행문 } - 조건식이 true이면 {} 안에 있는 실행문 실행한다.
		 */
		// [1] while 문 활용하여 1부터 10까지 더하기
		int num = 1;
		int sum = 0;
		while (num <= 10) { // 만약에 num이 10 이하이면 반복처리
			sum = sum + num; // sum += num
			num++; // num = num + 1 // num 1증가
		}
		System.out.println("[while] 1부터 10까지의 합은 " + sum);

		// - for문 표현
		int sum2 = 0;
		for (int num2 = 1; num2 <= 10; num2++) {
			sum2 += num2;
		}
		System.out.println("[for] 1부터 10까지의 합은 " + sum2);

		// [2] while 문이 무한히 반복되는 경우 , 조건식에 상수 true
//		while (true) {
//			System.out.println("[while] 쇼핑몰 24시간 실행중!!!");
//		}

//		for (;;) {
//			System.out.println("[for] 쇼핑몰 24시간 실행중!!!");
//		}

		// [3] do ~ while 문 , 1~10까지 더하는 프로그램
		int num3 = 1;
		int sum3 = 0;

		do { // 먼저 실행후 , 선 처리
			sum3 += num3;
			num3++;
		} while (num3 <= 10); // 실행후 조건검사 , 후 조건 검사
		System.out.println("[do-while] 1부터 10까지의 합은 " + sum3);

		// [4] 구구단중에서 2단 만 출력하시오. while 과 do-while문으로 구현하기.
		// 1. while 문
		int i = 2, j = 1;
		System.out.println("[while 구구단]");
		while (j <= 9) {
			System.out.printf("%d * %d = %d\n", i, j, i * j++);
		}

		i = 2;
		j = 1;
		System.out.println("[do-while 구구단]");
		do {
			System.out.printf("%d * %d = %d\n", i, j, i * j++);
		} while (j <= 9);
	}
}