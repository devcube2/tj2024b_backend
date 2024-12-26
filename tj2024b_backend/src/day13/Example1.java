package day13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example1 {
	public static void main(String[] args) {
		// 단계4 : 싱글톤 호출
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// - 두 변수가 참조하는(갖는) 객체는 동일한 (싱글톤)객체 이다.
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		
		// 참고 : 다른 클래스에서 Company 객체를 만들 수 없다.
		// Company myCompany3 = new Company(); // 오류
		
		// 참고2 : 싱글톤을 사용하는 객체의 메소드 호출
		Company.getInstance().method();
			// - 유재석.밥먹기().공부하기();
			// 실행순서1 : 유재석.밥먹기()
			// 실행순서2 : 밥먹기결과값.공부하기()	 
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = now.format(formatter);
		System.out.println(formatedNow);
	}
}