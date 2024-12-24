package day12;

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

	public int signUp(String id, String password, String name, boolean isManager) {
		if (count >= maxCount) {
			return -1; // 최대 가입회원수 초과로 가입 실패
		}
		if (id == null || password == null || name == null) {
			return -2; // 잘못된 인자값 입력으로 인한 가입 실패
		}

		member[count++] = new Member(id, password, name, isManager);

		return 0; // 회원가입 성공
	}

	public Member signIn(String id, String password) {
		for (int i = 0; i < count; i++) {
			 // count 만큼 돌면 객체가 들어있으므로 null 체크 필요없음
			if (member[i].getId().equals(id) && member[i].getPassword().equals(password)) {
				return member[i]; // 로그인 성공
			}
		}
		return null; // 로그인 실패(id 가 없거나, password 가 틀리거나 등)
	}
}
