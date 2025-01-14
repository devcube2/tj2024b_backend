package day24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// [1] 변수 몇개? 2개 , 자료 몇개? 1개
		int a = 3;
		int b = 3;
		// 즉] 서로 다른 두 변수는 같은 자료를 참조한다.

		// [2] 변수 몇개? 2개 , 자료 몇개? 1개
		int c = 5;
		int d = c;

		// [3] 변수 몇개? 2개 , 자료 몇개? 2개(3, new Integer)
		Integer value1 = 3;
		Integer value2 = new Integer(3); // 취소선 : deprecated

		// 3. 생성자 이용한 문자열
		String str2 = "유재석";
		String str3 = new String("유재석");

//		System.out.println(str2 == str3); // false
//		System.out.println(str2.equals(str3)); // true
//		String str4 = "유재석";
//		System.out.println(str2 == str4); // true

		// [5] String 주요 메소드
		// 1.
		String str5 = "자바".concat("프로그래밍");
		System.out.println(str5); // 자바프로그래밍
		// 2.
		StringBuilder builder = new StringBuilder();
		builder.append("자바");
		builder.append("프로그래밍");
		System.out.println(builder); // 자바프로그래밍
		// 3.
		String str6 = String.format("%s %s", "자바", "프로그래밍");
		System.out.println(str6);
		// 4. += , 자바스크립트
		String str7 = "";
		str7 += "자바";
		str7 += "프로그래밍";
		System.out.println(str7);
		// 5. .chatAt()
		char gender = "012345-1230123".charAt(7);
		System.out.println(gender);
		// 활용
//		Scanner scan = new Scanner(System.in);
//		char ch = scan.next().charAt(0);
		// 6. .length()
		// [활용] 반복문
		System.out.println("012345-1230123".length());

		// 7. .replace(기존문자열, 새로운문자열)
		String str8 = "자바프로그래밍".replace("자바", "JAVA");
		System.out.println(str8);
		// [활용] html(<br/>) --> java(\n)
		String htmlData = "유재석<br/>안녕하세요.";
		System.out.println(htmlData);
		String javaData = htmlData.replace("<br/>", "\n");
		System.out.println(javaData);

		// 8. .subString(시작인덱서 , [끝인덱스] ) :
		// 첫번째 인덱스부터 6번인덱스 전까지 추출
		String str9 = "012345-1230123".substring(0, 6);
		System.out.println(str9); // 012345
		
		// 9. .split("구분문자") :
		String[] str11 = "012345-1230123".split("-");
		System.out.println(str11[0]); // 012345
		System.out.println(str11[1]); // 1230123
		// [활용] : CSV 파일 다루기
		
		// 10. .indexOf("찾을문자열")
		int findIndex = "자바 프로그래밍 언어".indexOf("자바");
		System.out.println(findIndex); // 0
		
		// 11. .contains("찾을문자열")
		boolean findBool = "자바 프로그래밍 언어".contains("자바");
		System.out.println(findBool); // true
		
		// 12. getBytes()
		byte[] str12 = "JAVA PROGRAM".getBytes();
		System.out.println( Arrays.toString(str12) );
		
		System.out.println("ab".getBytes().length); // 2
			// - 한글 : 문자1개당 2바이트(순수글자) + 1바이트(utf-8 규칙정보) => 3바이트
		System.out.println("가나".getBytes().length); // 6
			// char 2바이트 표현 
			// --> char 유니코드로 된 문자 1개 표현
			// [활용] : 인증코드 만들기
		String code = "";
		
		for (int i = 0; i<=6; i++) {
//			System.out.println(new Random());
//			System.out.println(new Random().nextInt());
//			System.out.println(new Random().nextInt(26)); // 0 ~ 25 사이
//			System.out.println(new Random().nextInt(26) + 97); // 97 ~ 123 사이
//			System.out.println( (char)(new Random().nextInt(26) + 97) ); // 97 ~ 123 사이
			code += (char)(new Random().nextInt(26) + 97);
		}
		System.out.println(code);
	}
}