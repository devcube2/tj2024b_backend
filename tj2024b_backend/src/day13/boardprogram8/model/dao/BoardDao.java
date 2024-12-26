package day13.boardprogram8.model.dao;

import day13.boardprogram8.model.dto.BoardDto;

public class BoardDao {
	// 싱글톤
	private BoardDao() {}
	private static BoardDao boardDao = new BoardDao();
	public static BoardDao getInstance() {
		return boardDao;
	}
	
	// +멤버변수( 모든 게시물정보를 갖는 배열 , 데이터베이스 역활)
	private BoardDto[] boardDB = new BoardDto[100];
	
	// 1. 글쓰기 처리 메소드
	public boolean write(BoardDto boardDto) {
		// [1] 매개변수로 받은 저장할 BoardDto 를 배열에 저장한다.
		for (int index = 0; index < boardDB.length; index++) {
			if( boardDB[index] == null) {
				boardDB[index] = boardDto;
				return true;
			}
		}
		return false; // [2] 결과를 controller 에게 응답한다.
	}
	
	// 2. 모든글출력 처리 메소드
	public BoardDto[] findAll() {
		// [1] 배열내 모든 객체를 controller 에게 응답한다.
		return boardDB;
	}
}
