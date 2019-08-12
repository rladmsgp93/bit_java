package day05;

public class Test05 {

	public static void main(String[] args) {

		int[][] t1 = new int[3][2];
		t1[0][0] = 1;
		t1[0][1] = 2;
		t1[1][0] = 3;
		t1[1][1] = 4;
		t1[2][0] = 5;
		t1[2][1] = 6;
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1[0].length; j++) {
				System.out.print(t1[i][j]);
			}
			System.out.println();
		}
		int[][] t2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

	}

}
