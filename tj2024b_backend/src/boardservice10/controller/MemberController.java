package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
//	+ 싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() { return instance; }
	
//	1. 회원가입
	public boolean signUp( MemberDto memberDto ) {
		MemberDao.getInstance().signUp( memberDto );
		return true;
	} // f end
	
//	2. 로그인
	private int logInMno = 0;
	public int getLogInMno() { return logInMno; } // BoardController에서 호출할 에정(글쓰기)
	
	public boolean logIn( MemberDto memberDto ) {
		int result = MemberDao.getInstance().logIn(memberDto);
//		boolean --> int 변경한 이유 : 로그인 성공한 회원번호를 내부적으로 저장하기 위해
//		회원번호( 1번 시작하므로 )를 받아서 0이면 없는 회원번호 , 0초과이면 있는 회원번호 // 설계
		if( result > 0 ) { 
			logInMno = result; // 로그인 성공시 로그인 저장변수에 로그인 성공한 회원번호 저장
			return true; 
		} 
		else { return false; } 
	} // f end
	
//	3. 아이디찾기
	public String findID( MemberDto memberDto ) {
		String result = MemberDao.getInstance().findID(memberDto);
		return result;
	} // f end
	
//	4. 비밀번호 찾기
	public String findPWD( MemberDto memberDto ) {
		String result = MemberDao.getInstance().findPWD(memberDto);;
		return result;
	} // f end
	
//	5. 로그아웃 컨트롤러 메소드
	public void logOut() {
		logInMno = 0;
	} // f end
	
//	6. 내정보조회 컨트롤러 메소드
	public MemberDto myInfo() {
		MemberDto result = MemberDao.getInstance().myInfo(logInMno);
		return result;
	} // f end
	
//	7. 회원탈퇴 컨트롤러 메소드
	public void delete() {
		MemberDao.getInstance().delete( logInMno );
	} // f end
	
	// 8. 회원수정 컨트롤러 메소드
	public boolean update(MemberDto memberDto) {
		// + 누구를 수정 할껀지 , 현재 로그인 회원이 수정 하므로 현재 로그인된 회원번호를 dto 담아주기.
		memberDto.setMno(logInMno);
		boolean result = MemberDao.getInstance().update(memberDto);
		return result;
	}
}