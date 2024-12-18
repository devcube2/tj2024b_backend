package day07;

/* 
 임의의 점수 5개를 배열에 저장하고 총점과 평균을 구하는 코드 작성 
 */

public class Example5 {

	public static void main(String[] args) {
		int[] score = { 80, 90, 85, 37, 100 };
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		System.out.printf("총점: %d\n", sum);
		double avg = sum / score.length;
		System.out.printf("평균: %f\n", avg);
	}
}