package studentservice.view;

import java.util.ArrayList;
import java.util.Scanner;

import studentservice.controller.StudentController;
import studentservice.model.dao.StudentDao;
import studentservice.model.dto.StudentDto;

public class StudentView {
	// 싱글턴
	private static StudentView instance = new StudentView();
	public static StudentView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);	
	
	public void run() {
		StudentDao.getInstance();
		while (true) {
			System.out.print("1.점수등록 2.전체점수조회 3.점수삭제 4.점수수정 : ");
			int choose = scan.nextInt();

			if (choose == 1) {
				점수등록();
			} else if (choose == 2) {
				전체점수조회();
			} else if (choose == 3) {
				점수삭제();
			} else if (choose == 4) {
				점수수정();
			}
		}
	}

	private void 점수등록() {
		System.out.print("학생명: "); String 학생명 = scan.next();
		System.out.print("국어점수: "); int 국어점수 = scan.nextInt();
		System.out.print("영어점수: "); int 영어점수 = scan.nextInt();
		System.out.print("수학점수: "); int 수학점수 = scan.nextInt();
		
		StudentDto dto = new StudentDto(학생명, 국어점수, 영어점수, 수학점수);
		
		boolean result = StudentController.getInstance().점수등록(dto);
		if (result) {
			System.out.println("점수등록 성공");
		} else {
			System.out.println("** 점수등록 실패 **");
		}		
	}

	private void 전체점수조회() {
		System.out.println("학생번호    학생명    국어점수    영어점수    수학점수");
		ArrayList<StudentDto> studentList = StudentDao.getInstance().전체점수조회();
		for (StudentDto dto : studentList) {
		System.out.printf ("%d           %s     %d          %d          %d\n"
					, dto.get학생번호(), dto.get학생명() , dto.get국어점수(), dto.get영어점수(), dto.get수학점수()
			);
		}
	}

	private void 점수삭제() {
		System.out.print("학생명: "); String 학생명 = scan.next();
		System.out.println("삭제할 과목을 선택해주세요.");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");		
		int choose = scan.nextInt();		
		boolean result = StudentController.getInstance().점수삭제(학생명, choose);
		if (result) {
			System.out.println("점수삭제 성공");
		} else {
			System.out.println("** 점수삭제 실패 **");
		}
	}

	private void 점수수정() {
		System.out.print("학생명: "); String 학생명 = scan.next();
		System.out.println("수정할 과목을 선택해주세요.");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");		
		int choose = scan.nextInt();
		System.out.println("수정점수: "); int 수정점수 = scan.nextInt();
		boolean result = StudentController.getInstance().점수수정(학생명, choose, 수정점수);
		if (result) {
			System.out.println("점수수정 성공");
		} else {
			System.out.println("** 점수수정 실패 **");
		}
	}
}
