package day07;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Member 회원1 = new Member();
		Member 회원2 = new Member();
		Member 회원3 = new Member();

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 회원가입 2. 로그인");
			int 선택번호 = scan.nextInt();
			switch (선택번호) {
			case 1:
				if (회원1.아이디 == null) {
					System.out.print(">> 가입 ID: ");
					회원1.아이디 = scan.next();
					System.out.print(">> 비밀번호: ");
					회원1.비밀번호 = scan.next();
					System.out.print(">> 닉네임: ");
					회원1.닉네임 = scan.next();
				} else if (회원2.아이디 == null) {
					System.out.print(">> 가입 ID: ");
					회원2.아이디 = scan.next();
					System.out.print(">> 비밀번호: ");
					회원2.비밀번호 = scan.next();
					System.out.print(">> 닉네임: ");
					회원2.닉네임 = scan.next();
				} else if (회원3.아이디 == null) {
					System.out.print(">> 가입 ID: ");
					회원3.아이디 = scan.next();
					System.out.print(">> 비밀번호: ");
					회원3.비밀번호 = scan.next();
					System.out.print(">> 닉네임: ");
					회원3.닉네임 = scan.next();
				} else {
					System.out.println("** 가입 마감 **");
				}
				break;
			case 2:
				System.out.print(">> 로그인 ID: ");
				String id = scan.next();
				System.out.print(">> 비밀번호: ");
				String password = scan.next();
				if (회원1.아이디 != null && 회원1.아이디.equals(id)) {
					if (회원1.비밀번호.equals(password)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패(비밀번호 틀림)");
					}
				} else if (회원2.아이디 != null && 회원2.아이디.equals(id)) {
					if (회원2.비밀번호.equals(password)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패(비밀번호 틀림)");
					}
				} else if (회원3.아이디 != null && 회원3.아이디.equals(id)) {
					if (회원3.비밀번호.equals(password)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패(비밀번호 틀림)");
					}
				} else {
					System.out.println("등록된 ID 가 없습니다.");
				}
			}
		}
	}
}
