package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {
	public static void main(String[] args) throws Exception {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("2019년" + Calendar.DAY_OF_YEAR + "일째");
		String date = String.format("현재 시간은 %tk  시 : %tM 분 : %tS초 %n", c, c, c);
		System.out.println(date);
		System.out.printf("%f", Math.PI);
		String f = String.format("%f", Math.PI);
		System.out.println();
		System.out.println("---------------------------------");
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter("sss.txt");
		// Formatter fm = new Formatter(sb);

		fm.format("현재 시간은 %tk 시: %tM 분 : %tS 초", c, c, c);
		System.out.println(sb);
		fm.flush();
		System.out.println("main end");
	}
}
