package studentservice.controller;

import java.util.ArrayList;

import studentservice.model.dto.StudentDto;
import studentservice.model.dao.StudentDao;

public class StudentController {
	private StudentController() {}
	private static StudentController instance = new StudentController();
	public static StudentController getInstance() {
		return instance;
	}
	
	public boolean 점수등록(StudentDto dto) {
		return StudentDao.getInstance().점수등록(dto);
	}

	public ArrayList<StudentDto> 전체점수조회() {
		return StudentDao.getInstance().전체점수조회();
	}

	public boolean 점수삭제(String 학생명, int 삭제과목) {
		return StudentDao.getInstance().점수삭제(학생명, 삭제과목); 
	}

	public boolean 점수수정(String 학생명, int 수정과목, int 수정점수) {
		return StudentDao.getInstance().점수수정(학생명, 수정과목, 수정점수);
	}
}