package day03;

public class Example3 {

	public static void main(String[] args) {
		int age = 10;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}

		age = 5;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}

		// 1분 복습
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}

		// [3] if ~ else if 문
		age = 75;
		int charge;
		if (age < 8) { // 만약에 age(나이)값이 8미만이면
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) { // 아니고 age(나이)값이 8이상 14미만이면
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) { // 아니고 age(나이)값이 14이상 20미만이면
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else if (age >= 60) { // 아니고 age(나이)값이 60이상이면
			charge = 0;
			System.out.println("경로우대입니다.");
		} else { // 그외 나머지 모두.
			charge = 3000;
			System.out.println("일반인입니다.");
		} // if end
		System.out.printf("입장료는 %d원 입니다.\n", charge);

		// p100 나혼자코딩
		int score = 65;
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("점수: %d 학점: %c\n", score, grade);
	}

}
