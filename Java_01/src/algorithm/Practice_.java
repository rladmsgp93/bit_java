package algorithm;

public class Practice_ {

	public static void main(String[] args) {
		int s = 10;
		for (int i = 0; i < s / 2; i++) {
			for (int j = 0; j < s / 2 - i; j++) {
				System.out.print(" ");

			}

			for (int k = 0; k < (i + 1); k++) {
				System.out.print("*");
			}
			for (int j = 0; j < s / 2-i; j++) {
				System.out.print(" ");

			}
			System.out.println();

		}

	}

}
