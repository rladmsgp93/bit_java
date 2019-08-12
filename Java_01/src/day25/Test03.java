package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.URL;

public class Test03 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://www.naver.com/index.html";
		String line = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		// FileWriter fos = null;
		// ObjectOutputStream oos = null;

		try {
			// fw = new FileWriter("naver.data");
			// bw = new BufferedWriter(fw);
			bw = new BufferedWriter(new FileWriter("naver.html"));
			// fos = new FileOutputStream("naver.data");
			// oos = new ObjectOutputStream(fos);
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));// 바이트 단위가 char 단위로 바껴(InputStreamReader),
			// openStream은 inputstream 네이버에 데이터 스트림 연결
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line + "\n");
				// oos.writeObject(line);
			}
			// oos.flush();
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
