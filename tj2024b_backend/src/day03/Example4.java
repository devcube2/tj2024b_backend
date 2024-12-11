package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * // [ 구현 문제 , FOR문 없이 풀이 ] 문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력
		 * 하시오.
		 * 
		 * 문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외
		 * '재시험' 으로 출력 하시오.
		 * 
		 * 문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		 * 
		 * 문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		 * 
		 * 문제5 : 가위바위보 게임 구현하기. - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다. -
		 * 승리자 판단과 무승부 경우의수를 출력하시오. [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다. [출력 조건] 플레이어1
		 * 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
		 * 
		 * 문제6 : 윤년/평년 판단하기 [ 입력조건 ] 하나의 연도를 입력 받습니다. [ 윤년/평년 조건 ] -연수가 4로 나누어 떨어지는 해는
		 * 윤년으로 한다. -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. -연수가 4, 100, 400으로 나누어 떨어지는 해는
		 * 윤년으로 둔다. [ 출력조건] '입력한OOOO년 은' 윤년 입니다. 혹은 평년 입니다 로 출력하시오.
		 * 
		 * 문제7 : 주차 사용요금 계산하기 [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. - int 시 = 9; int 분 = 30; 이와
		 * 같이 변수를 먼저 선언해주세요. [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. [ 처리출력 조건 ]
		 * 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오, - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류'
		 * 출력하시오.
		 * 
		 * 문제8 : 로그인 처리 [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기 [처리출력 조건] 1. 아이디가 'admin' 이고
		 * 비밀번호가 '1234' 모두 동일하면 '로그인성공' 2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.' 3. 아이디는 일치하고
		 * 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다' [ 참고 ] 1. 문자열 비교시에는 == 같다 연산자 대신에 .equals()
		 * 함수를 이용해주세요. 예] String name = scan.next(); name =="admin" 대신에 name.equals(
		 * "admin" ) 사용.
		 * 
		 * 문제9 : 당첨번호 개수 찾기 [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이
		 * 변수를 먼저 선언해주세요. [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오. [ 출력 조건 ] 입력받은 세 정수 중에서
		 * 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
		 */

		// 문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int value1 = scan.nextInt();
		if (value1 >= 90) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외
		// '재시험' 으로 출력 하시오.
		System.out.print("정수 입력 : ");
		int value2 = scan.nextInt();
		if (value2 >= 90) {
			System.out.println("A등급");
		} else if (value2 >= 80) {
			System.out.println("B등급");
		} else if (value2 >= 70) {
			System.out.println("C등급");
		} else {
			System.out.println("재시험");
		}

		// 문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.print("정수1 입력 : ");
		int value3 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int value4 = scan.nextInt();
		System.out.print("정수3 입력 : ");
		int value5 = scan.nextInt();
		System.out.printf("가장 큰 수: %d\n", Math.max(value3, Math.max(value4, value5)));

		// 문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.print("정수1 입력 : ");
		int value6 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int value7 = scan.nextInt();
		System.out.print("정수3 입력 : ");
		int value8 = scan.nextInt();
		int[] values = { value6, value7, value8 };
		Arrays.sort(values);
		System.out.printf("%d %d %d\n", values[0], values[1], values[2]);

//		문제5: 가위바위보 게임 구현하기. - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다. -
//		승리자 판단과 무승부 경우의수를 출력하시오. [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다. [출력 조건] 플레이어1
//		이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
		System.out.print("플레이어1 입력 : ");
		int value9 = scan.nextInt();
		System.out.print("플레이어2 입력 : ");
		int value10 = scan.nextInt();
		if (value9 == 0 && value10 == 1) {
			System.out.println("플레이어2 승리");
		} else if (value9 == 0 && value10 == 2) {
			System.out.println("플레이어1 승리");
		} else if (value9 == 0 && value10 == 2) {
			System.out.println("플레이어1 승리");
		} else if (value9 == 1 && value10 == 0) {
			System.out.println("플레이어1 승리");
		} else if (value9 == 1 && value10 == 2) {
			System.out.println("플레이어2 승리");
		} else if (value9 == 2 && value10 == 0) {
			System.out.println("플레이어2 승리");
		} else if (value9 == 2 && value10 == 1) {
			System.out.println("플레이어1 승리");
		} else if (value9 == value10) {
			System.out.println("무승부");
		}

//		문제6 : 윤년/평년 판단하기 [ 입력조건 ] 하나의 연도를 입력 받습니다. [ 윤년/평년 조건 ] -연수가 4로 나누어 떨어지는 해는
//		윤년으로 한다. -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. -연수가 4, 100, 400으로 나누어 떨어지는 해는
//		윤년으로 둔다. [ 출력조건] '입력한OOOO년 은' 윤년 입니다. 혹은 평년 입니다 로 출력하시오.
		System.out.print("연도 입력 : ");
		int value = scan.nextInt();
		if (value % 4 == 0 && value % 100 == 0 && value % 400 == 0) {
			System.out.println("윤년입니다.");
		} else if (value % 4 == 0 && value % 100 == 0) {
			System.out.println("평년입니다.");
		} else if (value % 4 == 0) {
			System.out.println("윤년입니다.");
		}

//		문제7 : 주차 사용요금 계산하기 [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. - int 시 = 9; int 분 = 30; 이와
//		같이 변수를 먼저 선언해주세요. [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. [ 처리출력 조건 ]
//		1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오, - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류'
//		출력하시오.
		int inCarHour = 9;
		int inCarMinute = 30;
		System.out.print("출차시간의 시를 입력해주세요 : ");
		int outCarHour = scan.nextInt();
		System.out.print("출차시간의 분을 입력해주세요 : ");
		int outCarMinute = scan.nextInt();
		if (outCarHour < 0 || outCarHour > 12 || outCarMinute < 0 || outCarMinute > 60) {
			System.out.println("출차시간 오류");
		} else if (inCarHour > outCarHour) {
			System.out.println("출차시간 오류");
		} else if (inCarHour == outCarHour && inCarMinute > outCarMinute) {
			System.out.println("출차시간 오류");
		} else {
			int totalMinute = (outCarHour * 60 + outCarMinute) - (inCarHour * 60 + inCarMinute);
			System.out.printf("사용요금 : %d\n", totalMinute * 1000);
		}

//		문제8 : 로그인 처리 [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기 [처리출력 조건] 1. 아이디가 'admin' 이고
//		비밀번호가 '1234' 모두 동일하면 '로그인성공' 2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.' 3. 아이디는 일치하고
//		비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다' [ 참고 ] 1. 문자열 비교시에는 == 같다 연산자 대신에 .equals()
//		함수를 이용해주세요. 예] String name = scan.next(); name =="admin" 대신에 name.equals(
//		"admin" ) 사용.
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String password = scan.next();
		if (id.equals("admin")) {
			if (password.equals("1234")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 정보가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디 정보가 일치하지 않습니다.");
		}

//		문제9 : 당첨번호 개수 찾기 [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이
//		변수를 먼저 선언해주세요. [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오. [ 출력 조건 ] 입력받은 세 정수 중에서
//		공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
		int 공1 = 14;
		int 공2 = 21;
		int 공3 = 9;
		System.out.print("정수1 : ");
		int value11 = scan.nextInt();
		System.out.print("정수2 : ");
		int value12 = scan.nextInt();
		System.out.print("정수3 : ");
		int value13 = scan.nextInt();
		int count = 0;
		if (value11 == 공1 || value11 == 공2 || value11 == 공3) {
			count++;
		}
		if (value12 == 공1 || value12 == 공2 || value12 == 공3) {
			count++;
		}
		if (value13 == 공1 || value13 == 공2 || value13 == 공3) {
			count++;
		}
		System.out.printf("동일한 번호는 %d 개 입니다.", count);

		scan.close();
	}

}
