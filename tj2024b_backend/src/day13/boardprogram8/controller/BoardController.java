package day13.boardprogram8.controller;

import day13.boardprogram8.model.dao.BoardDao;
import day13.boardprogram8.model.dto.BoardDto;

public class BoardController {
	// - 싱글톤
	private BoardController() {}
	private static BoardController boardController = new BoardController();
	public static BoardController getInstance() {
		return boardController;
	}
	// 1. 글쓰기 제어 메소드
	public boolean write(BoardDto boardDto) {
		// [1] dao 에게 저장할 객체를 전달하고 응답받기
		return BoardDao.getInstance().write(boardDto);
	}
	// 2. 모든글출력 제어 메소드
	public BoardDto[] findAll() {
		return BoardDao.getInstance().findAll();
	}
}
