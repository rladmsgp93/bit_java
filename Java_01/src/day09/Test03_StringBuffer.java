package day09;

import java.util.Date;

public class Test03_StringBuffer {

	public static void main(String[] args) {
		String msg = "";

		msg = msg + "hello " + new java.util.Date() + " java" + " test";// x
		System.out.println(msg);

		String msg2 = "";

		// StringBuffer sb = new StringBuffer();//o
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");// 객체를 계속 다시 생성하는 게 아니라 그냥 버퍼에 축적
		sb.append(new Date());
		sb.append("java");
		sb.append(" test");
		sb.append('A');
		sb.append(89);

		// msg2=sb.toString();//sb에 있는 내용이 모두 convert되서 string으로 바뀐당
		msg2 = new String(sb);
		System.out.println(msg2);

	}

}
