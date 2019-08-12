package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비 되었습니다.");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			System.out.println("client 요청을 기다립니다.");
			Socket socket = serverSocket.accept();// 기다리고 있는 구문
			// System.out.println(socket.getInetAddress() + "와 연결중입니다.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String name = br.readLine();
//			System.out.println("hello~~~" + name + "\n");
			bw.write("hello~~~" + name + "\n");
			bw.flush();
			// String data = sc.nextLine();
			// (data = br.readLine()) != null
			while (true) {
				String msg = br.readLine();
				
				System.out.println(name + ":" + msg + "\n");
				 bw.write(name + ":" + msg + "\n");
				bw.flush();

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

		}

	}

}
