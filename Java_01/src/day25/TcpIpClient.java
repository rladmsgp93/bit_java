package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpClient  {

	public static void main(String[] args) {
		String serverIp = "192.168.0.140";
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(serverIp + "연결 시도할께용..");
			Socket socket = new Socket(serverIp, 7777);// 서버에 연결 시도
			System.out.println("서버와 연결이 되었습니다.");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("김은혜" + "\n");
			bw.flush();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(br.readLine());
			while (true) {
				System.out.println("메시지입력하세요//종료(q):");
				String data = sc.nextLine();
				if (data.equals("q")) {

					bw.write("종료할께용\n");
					bw.flush();
					break;
				}
				bw.write(data + "\n");
				bw.flush();
				System.out.println(br.readLine() + "\n");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
