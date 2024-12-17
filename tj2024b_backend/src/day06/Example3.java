package day06;

public class Example3 {

	public static void main(String[] args) {
		// [1] 클래스 정의하기 , 자동차
		// [2] 객체 생성하기 , 클래스 기반
		BookStore store1 = new BookStore();
		// [3] 객체의 멤버변수 접근하기
		store1.거래처 = "강남서점";
		store1.주인이름 = "현정우";
		store1.주소 = "인천";
		store1.보유책목록 = "자바클래스,자바코딩테스트";
	}

}
