package day24;

class Book {
	
}

public class ObjectExample {
	public static void main(String[] args) {
		// [1] Object 클래스 이용한 객체/인스턴스
		Object obj1 = new Object();				// - Object 타입
		Object obj2 = 3;						// - int타입
		Object obj3 = 3.14;						// - double타입
		Object obj4 = "유재석";					// - String타입
		Object obj5 = new int[] { 3, 10, 20 };	// - 배열타입
		Object obj6 = new Book();				// - 내가만든타입
		// --> Object 가 모든 타입들을 참조할 수 있는 이유?
		// ----> 하위타입은 상위타입으로 타입변환이 가능하다.
		
		// [2] Object 메소드
			// (1) toString() : 인스턴스의 참조(주소) 값(16진수) 반환 함수
		System.out.println(obj6.toString());
			// (2) 값1 == 값2 , 값1.equals(값2)
		System.out.println(obj1 == obj2);	// false
		Object obj7 = obj6;
		System.out.println(obj7 == obj6);	// true
		System.out.println(obj1.equals(obj2));	// false
		System.out.println(obj7.equals(obj6));	// true
			// (3) hashCode()
		System.out.println(obj1.hashCode());
	}
}
