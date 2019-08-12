package day05;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] scores = { 77, 99, 100, 85, 91 };
		int[] sc = new int[2 * (scores.length)];
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		System.arraycopy(scores, 0, sc, 1, scores.length);
		System.out.println(Arrays.toString(sc));
		String[] name = {"박민희","김은혜","조신비","이여울"};
		System.out.println(Arrays.toString(name));
		String[] nc = new String[name.length*2];
		System.arraycopy(name, 0, nc, 0, name.length);
		System.out.println(Arrays.toString(nc));

	}

}
