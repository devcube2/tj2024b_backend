package practice.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class DSTask implements Runnable {
	public Socket clientSocket;
	public BufferedReader reader;
	public PrintWriter writer;

	public DSTask() { // 상속용으로 작성되었음. 없으면 컴파일 오류 발생..
	}

	public DSTask(Socket clientSocket) throws IOException {
		this.clientSocket = clientSocket;
		reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		writer = new PrintWriter(clientSocket.getOutputStream(), true);
	}

	private final void close() throws IOException {
		reader.close();
		writer.close();
		clientSocket.close();
	}

	public final void logout() throws IOException {
		close();
	}

	public final int nextIntInter() throws IOException {
		int choose = -1;

		try {
			choose = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			println("올바른 값을 다시 입력해주세요.");			
		}
		
		return choose;
	}
	
	public final int nextIntInter(int min, int max) throws IOException {
		int choose = -1;

		try {
			choose = Integer.parseInt(reader.readLine());
			if (choose < min || choose > max) {
				choose = -1;
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			println("올바른 값을 다시 입력해주세요.");			
		}
		
		return choose;
	}
	
	public final int nextInt() throws IOException {
		int choose;
		
		while ((choose = nextIntInter()) == -1) {}
		
		return choose;
	}	
	
	public final int nextInt(int min, int max) throws IOException {
		int choose;
		
		while ((choose = nextIntInter(min, max)) == -1) {}
		
		return choose;
	}
	
	public final String next() throws IOException {
		return reader.readLine();
	}

	public final void println(String content) throws IOException {
		writer.println(content);
	}

	@Override // 이 메소드는 상속받은 클래스가 사용하면 안된다. 특정 메소드만 상속 자체를 막을수는 없어서 그냥 두었다.
	public final void run() {
		try {
			LoginView loginView = new LoginView(clientSocket, reader, writer);
			loginView.index();
		} catch (IOException e) {
			System.err.println("Error handling client: " + e.getMessage());
		} catch (Exception e) { // 실수로 잡지 못한 예외는 이곳에서 최종 처리
			System.err.println("unexpected exception: " + e.getMessage());
		} finally {
			try {
				close();
			} catch (IOException e) {
				System.err.println("Error closing client socket: " + e.getMessage());
			}
			System.out.println("Client disconnected: " + clientSocket.getRemoteSocketAddress());
		}
	}
}
