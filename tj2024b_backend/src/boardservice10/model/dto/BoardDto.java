package boardservice10.model.dto;

public class BoardDto {
	// 1. 멤버변수
	private int bno;
	private String btitle;
	private String bcontent;
	private int bview;
	private String bdate;
	private int mno; // 작성자 회원번호
	private int cno; // 카테고리 번호
	// ++
	private String mid;
	private String cname;

	// 2. 생성자
	public BoardDto() {
	}
	
	public BoardDto(int bno, String btitle, String bcontent, int bview, String bdate, int mno, int cno) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bview = bview;
		this.bdate = bdate;
		this.mno = mno;
		this.cno = cno;
	}
	
	// 3. 메소드
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}
	
	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bview=" + bview
				+ ", bdate=" + bdate + ", mno=" + mno + ", cno=" + cno + "]";
	}
}
