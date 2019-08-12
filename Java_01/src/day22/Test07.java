package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Test07 {

	public static void main(String[] args) {
		FileReader fr = null;
		Properties prop = new Properties();
		BufferedReader br = null;
		try {
			fr = new FileReader("c://lib//dbinfo.txt");
			prop.load(fr);
			String id = prop.getProperty("user");
			String pw = prop.getProperty("pw"); 

			System.out.println("로그인 시도" + id + "/" + pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
