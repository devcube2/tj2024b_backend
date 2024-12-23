package day11;

import java.util.Scanner;

public class BoardProgram6 { // class start
	public static void main(String[] args) { // main start
		BoardDto[] boards = new BoardDto[100];
		BoardService bs = new BoardService();
		
		while (true) { // while start	
			System.out.print("1.등록 2.출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if (choose == 1) {
				// 등록함수 호출
				bs.boardAdd(scan, boards);				
			} else if (choose == 2) {
				// 출력함수 호출
				bs.boardPrint(boards);
			} // if end
		} // while end
	} // main end
} // class end