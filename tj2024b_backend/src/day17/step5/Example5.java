package day17.step5;

import java.util.Arrays;
import java.util.stream.IntStream;

interface InterFaceTest2 {
	// 인터페이스의 구성멤버
	// 1. 상수 : 수정이 불가능한 변수.
	public static final int value = 10;

	// 2. 추상메소드 : 선언부(접근제한자 반환타입 메소드명 매개변수) 작성, 구현부 {}
	public abstract void method(); // {} 중괄호가 없다.
	// + 추가된 메소드
	// 3. 디폴트 메소드

	public default void method2() {
	} // 인터페이스에 구현한 메소드를 만들수 있다.
	// 4. 정적 메소드

	public static void method3() {
	} // 인터페이스에 정적 구현 메소드를 만들수 있다.
	// 5. private 메소드

	private void method4() {
	} // 현재 인터페이스에서 사용 가능한 구현 메소드 만들수 있다.
	// 6. private 정적 메소드

	private static void method5() {
	} // 현재 인터페이스에서 사용 가능한 정적 구현 메소드 만들수 있다.

	// + : 인터페이스는 클래스와 다르게 생성자가 없다. 즉] 인터페이스는 new 인터페이스명(); , 인터페이스는 인스턴스를 만들 수 없다.
	// - 생성자란? 클래스의 구성 멤버이자. 클래스로 인스턴스를 만들때 인스턴스의 초기화 하는 메소드/역활
	// + : static 이란? 프로그램 시작될때 메모리 할당 되고 프로그램이 끝날때 메모리 초기화. [ 상수 / 전역(공유) ]
	// - static 있는 변수 또는 메소드는 인스턴스가 없어도 사용이 가능하다.
}

public class Example5 {
	public static void main(String[] args) {
		// [1] 인터페이스 상수 호출
//		System.out.println(InterFaceTest2.value);
		
		// [2] 인터페이스의 추상메소드 호출 , X
		//InterFaceTest2.method();
		
		// [3] 인터페이스의 디폴트메소드 호출 , X
		//InterFaceTest2.method2();
		
		// [4] 인터페이스의 정적메소드 호출 , O
//		InterFaceTest2.method3();
		
		// [*] 인터페이스 타입은 new 할수없다. 즉] 인스턴스 생성 불가능.
		// InterFaceTest2 inter = new InterFaceTest2(;)
		
//		IntStream
//		int[] arr = {1,2,3};
//		System.out.println(Arrays.stream(arr).average().getAsDouble());
//		String a = "abc";
//		System.out.println(a.repeat(3));
//		int a = 3;
//		int b = 4;
//		System.out.println(Integer.toString(a) + Integer.toString(b));
//		String ab = Integer.toString(a) + Integer.toString(b);
//        String ba = Integer.toString(b) + Integer.toString(a);
//        System.out.println( Math.max( Integer.parseInt(ab) , Integer.parseInt(ba) ) );
		
//		System.out.println(IntStream.rangeClosed(1, 5).filter(i -> i % 2 == 0).sum());
//		System.out.println(IntStream.rangeClosed(1, 5).filter(i -> i % 2 == 0).map(i -> i * i).sum());
//		String a = "";
//		a.equals("")
	}
}