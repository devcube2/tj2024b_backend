package boardservice10.model.dto;

public class MemberDto { // DTO : 서로 다른 레이어(MVC패턴)들 간의 데이터를 이동하는 객체
	// * 주로 데이터베이스 테이블의 속성과 동일하다. +커스텀 가능
	// * 주로 DTO 는 멤머변수 private 접근제한자 사용한다. private 이란? 다른 클래스에서 접근 불가능.
	// - getter/setter 메소드 : private 멤버변수를 다른 클래스에서 간접접근 하기 위한 메소드
	// - toString() 메소드 : 객체 호출시 참조(주소)값 대신 멤버변수 값을 반환 하는 메소드 * 객체 내용물 확인용
	// * 주로 DTO 는 생성자를 기본적으로 2개( 디폴트 , 풀생성자 ) , 그외 커스텀 , 생성자 이란 ? new(인스턴스/객체)를 생성할때
	// 사용되는 초기화 함수

	// 1. 멤버변수/필드/속성 : 객체가 가질수 있는 고유한 값 를 저장하는 속성명
	private int no; // 회원번호
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String name; // 이름
	private String phone; // 연락처
	private String date; // 가입일

	// 2. 생성자
	public MemberDto() {
	}

	public MemberDto(int no, String id, String pwd, String name, String phone, String date) {
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.date = date;
	}

	// + 회원가입에 적합한 생성자
	public MemberDto(String id, String pwd, String name, String phone) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
	}

	// 3. 메소드 , getter / setter , toString()
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MemberDto [no=" + no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", date="
				+ date + "]";
	}
}
