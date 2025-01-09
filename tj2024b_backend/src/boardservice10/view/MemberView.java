package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberView {
	
//	+ 싱글톤
	private MemberView() {}
	private static MemberView instance = new MemberView();
	public static MemberView getInstance() { return instance; }
	
	private Scanner scan = new Scanner(System.in);
	
//	0. (로그인 하기전) 메뉴 메뉴 메소드
	public void run() {
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기  : ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { signUp(); }
			else if( choose == 2 ) { logIn(); }
			else if( choose == 3 ) { findID(); }
			else if( choose == 4 ) { findPWD(); }
			
		} // w end
		
	} // f end
	
//	0. 메인메뉴
	public void menu() {
		
		while(true) {
			System.out.println("1.내정보조회 2.탈퇴 3.로그아웃");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { myInfo(); }
			else if( choose == 2 ) { delete(); }
			else if( choose == 3 ) { logOut(); }
		} // w end
		
	} // f end
	
//	1. 회원가입
	public void signUp() {
		System.out.println("===== 회원가입 =====");
		System.out.print("아이디 : ");		String mid = scan.next();
		System.out.print("비밀번호 : ");		String mpwd = scan.next();
		System.out.print("이름 : ");			String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
		MemberDto memberDto = new MemberDto( mid , mpwd , mname , mphone );
		
		boolean result = MemberController.getInstance().signUp( memberDto );
		
		if( result ) { System.out.println("회원가입 성공"); }
		else { System.out.println("회원가입 실패"); }
		
	} // f end
	
//	2. 로그인
	public void logIn() {
//		순서 : 1.입력 -> 2.객체화 -> 3.컨트롤러에게 전달하고 응답 결과 받기 -> 4.컨트롤러의 결과에 따른 처리
		System.out.println("===== 로그인 =====");
		System.out.print("아이디 : ");		String mid = scan.next();
		System.out.print("비밀번호 : ");		String mpwd = scan.next(); // document.queryselector
		MemberDto memberDto = new MemberDto();
			memberDto.setMid(mid);
			memberDto.setMpwd(mpwd);
		boolean result = MemberController.getInstance().logIn( memberDto );
		
		if( result ) { 
			System.out.println("로그인 성공");
			// BoardView 메인메뉴 메소드 호출
			BoardView.getInstance().index();
		}
		else { System.out.println("로그인 실패"); }
	} // f end
	
//	3. 아이디찾기
	public void findID() {
//		[1] 입력
		System.out.println("===== 아이디 찾기 =====");
		System.out.print("이름 : ");			String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
//		[2] 객체화 // 데이터포장( view 에서 controller 이동 )
//		MemberDto memberDto = new MemberDto( mname , mphone ); 
//			오류 : new 키워드 뒤로 생성자가 오는데 클래스에 선언된 (매개변수가 일치한)생성자만 가능
//			1. 클래스에 서 매개변수2개의 생성자를 만든다.
//			2. 디폴트 생성자로 인스턴스 생성후 setter로 값을 넣는다.
		MemberDto membetDto = new MemberDto();
		membetDto.setMname(mname);
		membetDto.setMphone(mphone);
//		[3] 컨트롤러에게 전달(request/요청/매개변수) 하고 응답(response/응답/리턴) 결과 받기
		String result = MemberController.getInstance().findID(membetDto);
//		[4] 컨트롤러의 결과에 따른 처리
		if( result != null ) { System.out.println("찾은 아이디 : " + result );}
		else { System.out.println("동일한 회원정보가 없습니다."); }
	} // f end
	
//	4. 비밀번호 찾기
	public void findPWD() {
		System.out.println("===== 비밀번호 찾기 =====");
		System.out.print("아이디 : ");		String mid = scan.next();
		System.out.print("이름 : ");			String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		
		String result = MemberController.getInstance().findPWD(memberDto);
		
		if( result != null ) {System.out.println("찾은 비밀번호 : " + result);}
		else { System.out.println("동일한 회원정보가 없습니다."); }
	} // f end
	
//	5. 로그아웃
	public void logOut() {
		MemberController.getInstance().logOut();
		System.out.println("로그아웃 되었습니다.");		
	} // f end
	
//	6. 내정보조회
	public int myInfo() {
		MemberDto result = MemberController.getInstance().myInfo( );
		
		System.out.println("===== 내정보조회 =====");
		System.out.println("아이디 : " + result.getMid());
		System.out.println("이름 : " + result.getMname());
		System.out.println("전화번호 : " + result.getMphone());
		System.out.println("가입일 : " + result.getMdate());
//		서브메뉴
		while(true) {
			System.out.print("1.회원수정 2.회원탈되 3.뒤로가기 : ");
			int choose2 = scan.nextInt();
			if( choose2 == 1 ) {  
				update();				
			}
			else if( choose2 == 2 ) { 
				int state = delete();
				if ( state == 0 ) {
					return 0;
				}
			}
			else if( choose2 == 3 ) { break; }
		}
		
		return 1;
		
	} // f end
	
//	7. 회원탈퇴 화면 메소드
	public int delete() {
		System.out.println("===== 회월탈퇴 =====");
		System.out.println("정말 회원 탈퇴를 하실건가요?");
		System.out.print("0.예 1.취소 : "); // 버튼 클릭이 없으므로 키보드 입력으로 처리해야한다.
		
		int choose2 = scan.nextInt();
		if( choose2 == 0 ) { 
			MemberController.getInstance().delete(); // 탈퇴처리 컨트롤러 요청\
			return 0; // 탈퇴 했다.
		}
		return 1;
	} // f end
	
	// 8. 회원수정 화면 메소드
	public void update() {
		// 순서 : 1. 입력 -> 2. 객체화(선택) -> 3.컨트롤러 에게 전달 하고 응답 결과 받기 -> 4. 컨트롤러 의 결과에 따른 처리
		System.out.println("새로운 비밀번호 : ");	String mpwd = scan.next();
		System.out.println("새로운 이름 : ");		String mname = scan.next();
		System.out.println("새로운 전화번호 : ");	String mphone = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMpwd(mpwd);
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		boolean result = MemberController.getInstance().update(memberDto);
		if (result) {
			System.out.println("수정 완료");
		} else {
			System.out.println("수정 실패");
		}
	}
}