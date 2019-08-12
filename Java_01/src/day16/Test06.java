package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		System.out.println("main start");
		try {
			fis = new FileInputStream("c://lib//sample.txt");
			System.out.println("파일 준비 완료~");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해 주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
					System.out.println("자원 반남 ok");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end");

	}

}
