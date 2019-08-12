package day04;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		for (int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			if (c == 'x' || c == 'y' || c == 'z') {
				encodedString += (char) (c - 23);
			} else if (c == ' ') {
				encodedString += c;
			} else {
				encodedString += (char) (c + 3);
			}
		}
		System.out.println(sourceString);
		System.out.println(encodedString);
	}

}
