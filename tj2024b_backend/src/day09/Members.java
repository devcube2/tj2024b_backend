package day09;

public class Members {
	Member[] members;
	int maxCount;
	int count;

	Members(int 최대회원수) {
		members = new Member[최대회원수];
		maxCount = 최대회원수;
		count = 0;
	}

	String 회원가입(String id, String password, String nick) {
		if (count >= maxCount) {
			return "** 가입이 마감되었습니다. **";
		}

		members[count++] = new Member(id, password, nick);

		return "가입되었습니다.";
	}

	String 로그인(String id, String password) {
		for (int i = 0; i < count; i++) {
			if (members[i].id.equals(id)) {
				if (members[i].password.equals(password)) {
					return "로그인 성공";
				}
			}
		}
		return "로그인 실패";
	}
}
