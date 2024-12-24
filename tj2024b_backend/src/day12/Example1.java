package day12;

// - 하나의 .java 파일의 1개 이상의 클래스를 생성할 수 있다.

// (2) 객체(인스턴스)를 생성하기 위한 객체 설계도 클래스
class BirthDay {
	// + 클래스 멤버
	// 1. 멤버변수 // 모든 인스턴스 들이 각각 사용하는 변수 = 힙메모리
	int day;
	int month;
	int year;
	// 2. 생성자
	
	// 3. 메소드 / 멤버함수 // 모든 인스턴스 들이 공동으로 사용하는 함수
	public void setYear(int year) {
		this.year = year; // this란? 해당 메소드를 호출하는 인스턴스 가리킨다.
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

// (1) main 함수를 갖는 실행 클래스
public class Example1 {
	public static void main(String[] args) {
		// 1. 인스턴스 생성 - 객체를 구현하기 위해 설계도(클래스)를 메모리 할당 해서 실제물
		BirthDay bDay = new BirthDay();
		
		// 2. 인스턴스가 메소드를 호출		
		bDay.printThis();
		
		// 3. 인스턴스의 멤버변수 값 대입
		bDay.setYear(2000);
		
		// *
		BirthDay bDay2 = new BirthDay();
		bDay2.printThis();
		bDay2.setYear(2024);
	}
}
