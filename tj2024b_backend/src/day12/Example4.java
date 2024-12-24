package day12;

public class Example4 {
	public static void main(String[] args) {
		// [1] main함수 안에서 동일한 클래스 내부 함수 호출하기
		// signup(); // main 함수가 우선 할당 되므로 signup 함수를 부른다.
		
		// [2] main 함수 안에서 동일한 클래스 내부 함수 호출하기
		login(); // 
	}
	
	void signp() {
		myInfo();
	}
	
	void myInfo() {
		
	}
	
	static void login() {
		
	}
}
