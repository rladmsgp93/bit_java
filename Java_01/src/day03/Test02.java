package day03;

public class Test02 {

	public static void main(String[] args) {

		int num = 99;
		String result = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
		/*
		 * if(num>0) { System.out.println("양수"); } else if(num==0) {
		 * System.out.println("0"); } else { System.out.println("음수"); }
		 */
		System.out.println(result);

	}

}
