package day10;

public class Example1 {
	public static void main(String[] args) {
		// [1] DTO 객체 생성하기
		BoardDTO board = new BoardDTO();
		
		board.setTitle("안녕하세요");
		System.out.println(board.getTitle());
		
		System.out.println(board);
	}
}
