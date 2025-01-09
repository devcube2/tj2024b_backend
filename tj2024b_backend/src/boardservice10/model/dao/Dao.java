package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	public Connection conn; // DB와 연동 결과를 조작하느 인터페이스
	private String dburl = "jdbc:mysql://140.245.79.114:3306/boardservice10";
	private String dbuser = "root"; // 연동할 DB 서버의 계정명
	private String dbpwd = "1234"; // 연동할 DB 서버의 비밀번호

	public Dao() {
		try {
//			1. JDBC 클래스 드라이버 로드 , Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2. 설정한 경로/계정/비밀번호로 DB서버 연동 시도하고 결과를 (구현체) 반환
			conn = DriverManager.getConnection(dburl, dbuser, dbpwd);
		} catch (Exception e) {
			System.out.println("[DB 연동 실패]" + e);
		}
	}
}
