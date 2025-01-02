package day16.step3;

class Parent { // 상위 클래스
	String field1;
	
	public void method1() {
		System.out.println("Parent Method1");
	}
	public void method2() {
		System.out.println("Parent Method2");
	}
}

class Child extends Parent { // 하위 클래스
	String field2;
	
	public void method3() {
		System.out.println("Parent Method3");
	}
	
	// * 물려받은 메소드를 재정의/코드변경 = 오버라이딩
		// 주의할점 : 메소드의 선언부는 동일하게 작성 , { } 안에 있는 코드만 재정의
		// 멤버변수가 동일하면 this/super 로 구분 , 메소드명이 동일하면 왜? this/super 안쓰는 이유
		// ----> 멤버변수는 인스턴스 마다 할당 , 메소드는 모든 인스턴스가 공유 해서 사용하기 때문이다.
	@Override // 오버라이딩 어노테이션 // 생략 가능하다.
	public void method1() {
		System.out.println("Child Method1");
	}
	public void method2() {
		System.out.println("Child Method2");
	}
}

public class Example3 {
	public static void main(String[] args) {
		// 1. 자식 클래스의 인스턴스 생성
		Child child = new Child();
		child.method1(); // 자식 인스턴스는 부모클래스의 메소드를 사용할수있다. 단] 오버라이딩 메소드인 경우 현 인스턴스의 메소드 호출된다.
		child.method2();
		child.method3();
		
		// 2. 자식 클래스의 인스턴스가 부모 클래스로 타입 변환
		Parent parent = child;
		parent.method1(); // Child method1 , 타입이 변환된다고 해서 인스턴스가 바뀌는건 아니다.
		parent.method2();
		// parent.method3(); // 타입변환시 하위타입 멤버에 접근할 수 없다.
		
		// 3. 부모 클래스의 타입에서 자식 클래스의 타입 변환
		Child child2 = (Child)parent;
		child2.method1(); // Child method1
		child2.method2(); // Child method2
		child2.method3(); // Parent method3
		
		// 4. 부모 클래스의 인스턴스 생성
		Parent parent2 = new Parent();
		parent2.method1();
		// * 태생 검사.
		if (parent2 instanceof Child) { // parent2 변수가 가리키는 인스턴스가 Child 타입을 참조하고 있어? true 또는 false
			Child child3 = (Child)parent2; // 부모타입 --> 자식타입 Fail // 태생이 child 아니라서.			
		}
		else {
			System.out.println("타입변환 할 수 없습니다.");
		}
	}
}
