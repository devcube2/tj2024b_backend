package day12;

class Person {
	// 1. 멤버변수
	String name;
	int age;
	// 2. 생성자
		// 1. 디폴트 생성자 : 매개변수가 없는 생성자
	Person () {
		this("이름없음", 1);
	}
		// 2. 사용자정의 생성자 : 개발자가 매개변수를 임의로 해서 만든 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	// 3. 메소드
}

public class Example2 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person yesName = new Person("유재석", 40);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
		
		/*
		 	클래스 : 2개 , Person , Example2
		 	객체(인스턴스) : 2개 , new Person(); , new Person()
		 	할당된 멤버변수 : 4개
		 */
	}
}