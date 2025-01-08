package practice.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class LoginView extends DSTask {	
	public LoginView(Socket clientSocket, BufferedReader reader, PrintWriter writer) {
		this.clientSocket = clientSocket;
		this.reader = reader;
		this.writer = writer;
	}
	
	public void index() throws IOException {
		println("----- 배달관리 시스템에 오신걸 환영합니다. -----");
		println("1. 회원가입 2. 로그인");
		int choose = nextInt(1, 2);
		
		println(String.format("선택번호는 %d 입니다. - 보내고 싶은 메시지를 입력해보세요.", choose));
		
		String str = next();
		println("입력받은 메시지는 '" + str + "' 입니다.");
		
		next(); // 테스트로 잠시 멈춤 용도..
	}
}
