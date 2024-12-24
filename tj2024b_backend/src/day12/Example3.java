package day12;

class Student {
	// + 정적변수 : 프로그램 시작될때 1번 생성된다.
	public static int serialNum = 1000;
	// + 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	// + 생성자
	// + 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

class Student1 {
	// + 정적변수 : 프로그램 시작될때 1번 생성된다.
	public static int serialNum = 1000;
	// + 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	// + 생성자
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	// + 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

class Student2 {
	// static 변수에 private
	private static int serialNum = 1000;
	// + 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	// + 생성자
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {		
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	// + 메소드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

public class Example3 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		// 인스턴스 생성
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		
		System.out.println(studentLee.studentName);
		System.out.println(studentSon.studentName);
		
		// 예2]
		Student1 studentLee1 = new Student1();
		studentLee1.setStudentName("이지원");
		System.out.println(studentLee1.studentID);
		Student1 studentSon1 = new Student1();
		studentLee1.setStudentName("손수경");
		System.out.println(studentSon1.studentID);
		
		// 예4]
//		System.out.println(Student2.serialNum);
	}
}