package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import studentservice.model.dto.StudentDto;

import java.util.ArrayList;

public class StudentDao {
	private String DBURL = "jdbc:mysql://127.0.0.1:3306/studentservice";
	private String DBID = "root";
	private String DBPWD = "1234";

	protected Connection conn = null;

	protected StudentDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBID, DBPWD);
		} catch (ClassNotFoundException e) {
			System.err.println(">> JDBC 드라이버가 없습니다. " + e);
		} catch (SQLException e) {
			System.err.println(">> DB연동 실패 " + e);
		}
	}

	private static StudentDao instance = new StudentDao();

	public static StudentDao getInstance() {
		return instance;
	}

	// insert, update, delete 쿼리 실행 메소드
	public boolean execute(String sql) {
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			int count = ps.executeUpdate();
			if (count >= 1) {
				return true;
			}
		} catch (SQLException e) {
			System.err.printf("Query Failed - %s >> %s", sql, e.getMessage());
		}

		return false;
	}

	/*
	 * 아래부터는 select 메소드 목록
	 */

	public boolean 점수등록(StudentDto dto) {
		String sql = String.format("insert into 학생테이블 (학생명, 국어점수, 영어점수, 수학점수) values ('%s', '%s', '%s', '%s')",
				dto.get학생명(), dto.get국어점수(), dto.get영어점수(), dto.get수학점수());
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			int count = ps.executeUpdate();
			if (count >= 1) {
				return true;
			}
		} catch (SQLException e) {
			System.err.printf("Query Failed - %s >> %s", sql, e.getMessage());
			return false;
		}

		return true;
	}

	public ArrayList<StudentDto> 전체점수조회() {
		ArrayList<StudentDto> studentList = new ArrayList<>();
		String sql = "select 학생번호, 학생명, 국어점수, 영어점수, 수학점수 from 학생테이블"; 
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int 학생번호 = rs.getInt("학생번호");
				String 학생명 = rs.getString("학생명");
				int 국어점수 = rs.getInt("국어점수");
				int 영어점수 = rs.getInt("영어점수");
				int 수학점수 = rs.getInt("수학점수");
				StudentDto dto = new StudentDto(학생번호, 학생명, 국어점수, 영어점수, 수학점수);
				studentList.add(dto);
			}				
		} catch (SQLException e) {
			System.err.printf("Query Failed - %s >> %s", sql, e.getMessage());
		}		
		return studentList;
	}	

	public boolean 점수삭제(String 학생명, int 삭제과목) {
		String sql = "";
		
		switch (삭제과목) {
		case 1:
			sql = String.format("update 학생테이블 set 국어점수 = -1 where 학생명 = '%s'", 학생명);
			break;
		case 2:
			sql = String.format("update 학생테이블 set 영어점수 = -1 where 학생명 = '%s'", 학생명);
			break;			
		case 3:
			sql = String.format("update 학생테이블 set 수학점수 = -1 where 학생명 = '%s'", 학생명);
			break;
		default:
			System.out.println("삭제과목을 잘못 선택하였습니다.");
			return false;
		}
		
		return execute(sql);
	}

	public boolean 점수수정(String 학생명, int 수정과목, int 수정점수) {
		String sql = "";
		
		switch (수정과목) {
		case 1:
			sql = String.format("update 학생테이블 set 국어점수 = %d", 수정점수);
			break;
		case 2:
			sql = String.format("update 학생테이블 set 영어점수 = %d", 수정점수);
			break;			
		case 3:
			sql = String.format("update 학생테이블 set 수학점수 = %d", 수정점수);
			break;
		default:
			System.out.println("수정과목을 잘못 선택하였습니다.");
			return false;
		}
		
		return execute(sql);
	}
}
