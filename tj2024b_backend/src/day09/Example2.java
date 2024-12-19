package day09;

import java.util.Scanner;

/* 
자바 과제9 : 회원 서비스 구현하기

- 회원은 최대 100명 까지
- 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
- 회원클래스를 정의하고 회원객체를 활용하여 구현한다.
- 회원가입함수 와 로그인 함수를 구현하시오.
- 프로그램 초기 메뉴 : 1.회원가입 2.로그인 :
	1 선택시 : 아이디, 비밀번호, 닉네임 3개의 각 정보를 입력받아 저장하기
	2 선택시 : 아이디 , 비밀번호를 입력받아 기존의 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실퍂' 출력한다.		
*/

public class Example2 {
	public static void main(String[] args) {
		Members members = new Members(2); // 최대 100명의 회원관리

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 회원가입 2. 로그인");
			int choose = scan.nextInt();
			if (choose == 1) {
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("Password : ");
				String password = scan.next();
				System.out.print("Nick : ");
				String nick = scan.next();
				System.out.println(members.회원가입(id, password, nick));
			} else if (choose == 2) {
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("Password : ");
				String password = scan.next();
				System.out.println(members.로그인(id, password));
			}
		}
	}
}
