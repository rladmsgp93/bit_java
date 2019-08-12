package day16;

import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		System.out.println(" main start ");
		int jumsu = 900;
		try {
			if(!(jumsu>=0&&jumsu<=100))
			throw new IOException("점수가 유효하지 않습니다.");//에러 메세지 등록
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		//throw new RuntimeException("~~~~예외 발생~~~~~")
		//throw new IOException("~~~~~~문제 발생~~~~~"); checked exception
		System.out.println(" main end ");

	}

}
