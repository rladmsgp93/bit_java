package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) {
		String src = "c://lib//Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println("파일 복사 시잡합니다.");
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		System.out.println("파일 복사 시작합니다.");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copyo.mp3", false);// buffer에 바이트단위로

			bis = new BufferedInputStream(fis);// 버퍼가 꽉차면 자동으로 하드디스크가서 기록
			bos = new BufferedOutputStream(fos);

			int read = 0;
			int count = 0;
			// byte[] buffer = new byte[1024*1024];// 파일 사이즈 제한

			while ((read = bis.read()) != -1) {
				bos.write(read);

			}
			//bos.flush();

			System.out.println("I/O 횟수 : " + count);
			System.out.println("파일 복사 완료");
		}

		catch (FileNotFoundException e) {
			System.out.println(src + " 파일(복사원본) 확인해주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end");

	}

}
