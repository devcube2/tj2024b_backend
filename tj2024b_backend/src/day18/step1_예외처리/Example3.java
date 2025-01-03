package day18.step1_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3 {
	
	// [1] 메소드 내부의 예외를 호출했던곳으로 예외 떠넘기기
	public static Class loadClass(String fileName, String className)
			throws FileNotFoundException, ClassNotFoundException {
		// 예외 처리 방법 2가지 : 1. try~catch 2. throws
		FileInputStream fis = new FileInputStream(fileName); // 일반예외 발생
		Class c = Class.forName(className); // 일반예외 발생
		return c;
	}
	// [2] 메소드 내부 예외 던지기
	public static void method()  {
		String str = null;
		System.out.println(str.length()); // 예측!! : null 은 메소드를 호출할 수 없다.
		// 예측 안되면 => 코드 실행 => 예외 확인 => 예외 처리
	}

	public static void main(String[] args) {
		// 1. 메소드 호출 , 예외처리 발생 : 호출한 메소드가 throws 이용하여 메소드 내부 예외를 반환했기 때문에
		try {
			loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		// 2. 메소드 호출
		try {
			method();
		} catch ( NullPointerException e ) {
			System.out.println(e);
		}
	}
}
