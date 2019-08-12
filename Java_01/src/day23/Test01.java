package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);// 바이트 단위를 char(2바이트)단위로 바꿔준다
		BufferedReader br = new BufferedReader(ir);
		String s = null;
		try {
			while ((s = br.readLine()) != null) {
				System.out.println("keyboard input data=>" + s);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					if (br != null)
						br.close();
					if (ir != null)
						ir.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}

}
