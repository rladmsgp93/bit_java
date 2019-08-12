package day05;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		String msg = "hi hello java";
		char[] c = new char[msg.length()];
		
		for(int i=0;i<msg.length();i++) {
			c[i]= msg.charAt(i);
		}
		
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		
		char[] cc = msg.toCharArray();
		cc[0] ='q';
		String ne = new String(cc);
		System.out.println(Arrays.toString(cc));
		System.out.println(ne);
		
	}

	

}
