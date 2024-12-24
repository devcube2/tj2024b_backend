package day12;

import java.util.Scanner;

public class MemberService {
	private Member[] member;
	private int count = 0;
	private int maxCount = 0;

	public MemberService() {
		this(100); // 멤버수 지정 없을시 100명
	}

	public MemberService(int maxMember) {
		member = new Member[maxMember];
		maxCount = maxMember; // 최대 가입회원수 제어를 위한 변수에 대입
	}

	public boolean signUp(Scanner scan) {
		if (count >= maxCount) {
			System.out.println("** 가입 마감 **");
			return false; // 최대 가입회원수 초과로 가입 실패
		}		
		
		System.out.print("가입자 ID: ");
		String id = scan.next();
		for (int i = 0; i < count; i++) { // count 만큼만 돌면 객체가 다 들어있으므로, null 체크 필요없음
			if (member[i].getId().equals(id)) {
				System.out.println("** ID 중복 **");
				return false;
			}
		}
		
		System.out.print("가입자 Password: ");
		String password = scan.next();
		System.out.print("가입자 Name: ");
		String name = scan.next();
		System.out.print("관리자면 1, 아니면 2 입력: ");
		boolean isManager = ((scan.nextInt()) == 1);

		member[count++] = new Member(id, password, name, isManager);

		return true; // 회원가입 성공
	}

	public Member signIn(Scanner scan) {
		System.out.print("ID: ");
		String id = scan.next();
		System.out.print("Password: ");
		String password = scan.next();
		
		for (int i = 0; i < count; i++) { // count 만큼만 돌면 객체가 다 들어있으므로, null 체크 필요없음
			if (member[i].getId().equals(id) && member[i].getPassword().equals(password)) {
				return member[i]; // 로그인 성공이니 해당 멤버객체 리턴한다.
			}
		}
		
		return null; // 로그인 실패(id 가 없거나, password 가 틀리거나 등)
	}
}
