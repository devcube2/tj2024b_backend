package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dto.BoardDto;
import boardservice10.model.dao.BoardDao;

public class BoardController {
	private static BoardController instance = new BoardController();

	private BoardController() {
	}

	public static BoardController getInstance() {
		return instance;
	}

	// 1. 전체 게시물 컨트롤러 메소드
	public ArrayList<BoardDto> findAll() {
		return BoardDao.getInstance().findAll();
	}

	// 2. 개별 게시물 컨트롤러 메소드
	public BoardDto findById(int bno) {
		return BoardDao.getInstance().findById(bno);
	}
}
