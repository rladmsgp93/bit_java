package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test02 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://www.naver.com/index.html";
		String line = null;
		BufferedReader br = null;

		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));// 바이트 단위가 char 단위로 바껴(InputStreamReader),
			// openStream은 inputstrean 네이버에 데이터 스트림 연결
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
