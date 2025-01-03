package day18.step2_JDBC;

public class Example2 {
	public static void main(String[] args) {
		// [확인]
		Dao.getInstance();
		
		// [insert 확인]
		Dao.getInstance().insert();
		
		
		Dao dao = Dao.getInstance();
		// [update 확인] : uno=2 인 uname="강호동" 수정
		dao.execute("update user set uname='강호동' where uno=2");		
		
		// [delete 확인] : uno=1 인 레코드 삭제
		dao.execute("delete from user where uno=1");
		
		// [select 확인]
		Dao.getInstance().select();
	}
}
