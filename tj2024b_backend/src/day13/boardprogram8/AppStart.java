package day13.boardprogram8;

import day13.boardprogram8.view.BoardView;

public class AppStart {
	public static void main(String[] args) {
		// + 싱글톤에 메소드 호출
		BoardView.getInstance().index();		
	}
}
