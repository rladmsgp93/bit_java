package day06;

public class Test01 {

	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 8 };

		int[] num2;
		num2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		String[] arr = { "hi", "java", "test" };

		for (int data : num) {
			System.out.print(data);
		}
		System.out.println();
		for (String data : arr) {
			System.out.println(data);
		}

	}

}

