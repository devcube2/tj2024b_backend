package studentservice.model.dto;

// 	2. 학생명과 국어,영어,수학 점수를 입력받아 관리하는 서비스
public class StudentDto {
	private int 학생번호;
	private String 학생명;
	private int 국어점수;
	private int 영어점수;
	private int 수학점수;

	public StudentDto() {
	}
	
	public StudentDto(String 학생명, int 국어점수, int 영어점수, int 수학점수) {		
		this.학생명 = 학생명;
		this.국어점수 = 국어점수;
		this.영어점수 = 영어점수;
		this.수학점수 = 수학점수;
	}

	public StudentDto(int 학생번호, String 학생명, int 국어점수, int 영어점수, int 수학점수) {
		this.학생번호 = 학생번호;
		this.학생명 = 학생명;
		this.국어점수 = 국어점수;
		this.영어점수 = 영어점수;
		this.수학점수 = 수학점수;
	}	

	public int get학생번호() {
		return 학생번호;
	}

	public void set학생번호(int 학생번호) {
		this.학생번호 = 학생번호;
	}

	public String get학생명() {
		return 학생명;
	}

	public void set학생명(String 학생명) {
		this.학생명 = 학생명;
	}

	public int get국어점수() {
		return 국어점수;
	}

	public void set국어점수(int 국어점수) {
		this.국어점수 = 국어점수;
	}

	public int get영어점수() {
		return 영어점수;
	}

	public void set영어점수(int 영어점수) {
		this.영어점수 = 영어점수;
	}

	public int get수학점수() {
		return 수학점수;
	}

	public void set수학점수(int 수학점수) {
		this.수학점수 = 수학점수;
	}

	@Override
	public String toString() {
		return "StudentDto [학생번호=" + 학생번호 + ", 학생명=" + 학생명 + ", 국어점수=" + 국어점수 + ", 영어점수=" + 영어점수 + ", 수학점수=" + 수학점수
				+ "]";
	}		
}
