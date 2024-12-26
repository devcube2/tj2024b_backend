package day13.waitprogram.view;

import java.util.Scanner;

import day13.waitprogram.controller.WaitingController;
import day13.waitprogram.model.dto.WaitingDto;

public class WaitingView {
	private WaitingView() {
	}

	private static WaitingView waitingView = new WaitingView();

	public static WaitingView getInstance() {
		return waitingView;
	}

	private Scanner scan = new Scanner(System.in);

	public void index() {
		while (true) {
			System.out.print("1.등록 2.출력 : ");
			int choose = scan.nextInt();
			if (choose == 1) {
				register();
			} else if (choose == 2) {
				print();
			}
		}
	}

	public void register() {
		System.out.print("전화번호 : ");
		String phoneNumber = scan.next();
		System.out.print("인원수 : ");
		int headCount = scan.nextInt();

		boolean result = WaitingController.getInstance().register(new WaitingDto(phoneNumber, headCount));
		if (result == true) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}

	public void print() {
		WaitingDto[] reservedList = WaitingController.getInstance().getReservedList();

		for (WaitingDto waitingDto : reservedList) {
			if (waitingDto != null) {
				System.out.printf("전화번호: %s, 인원수: %d\n", waitingDto.getPhoneNumber(), waitingDto.getHeadCount());
			}
		}
	}
}
