package algorithm;

import java.util.StringTokenizer;

public class String_ {

	public static void main(String[] args) {
		String msg = "홍길동 / 이순신/김유신 /박철 ";

		String[] data = msg.split("/");
		String[] data_ = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			data_[i] = data[i].trim();
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data_[i].charAt(0));
			for (int j = 1; j < data_[i].length(); j++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		
		char[] x= {'a','b','c'};
		char[] y= {'h','e','l','l','o'};
		System.arraycopy(x, 2, y, x.length, 1);
		for(int k=0;k<y.length;k++) {
			System.out.print(y[k]);
		}
	}

}
