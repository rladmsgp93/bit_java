package day05;

import java.util.Arrays;

public class Test04 {
	// String[] args= {"5"};
	public static void main(String[] args) {
		/*
		 * //System.out.println((int)(10*Math.random())); int[] nums = new int[5];
		 * 
		 * if(args.length==0) { System.out.println("배열의 사이즈 정보를 매개변수로 넘겨주세요..");
		 * System.out.println("실행에 java day05.test04 5"); return ; } int[] nums1 = new
		 * int[Integer.parseInt(args[0])];
		 * 
		 * for(int i=0;i<nums.length;i++) { nums1[i] = (int)(45*Math.random())+1;
		 * 
		 * 
		 * } System.out.println(Arrays.toString(nums1));
		 */
		System.out.println("------------정렬-------------");

		int[] n = new int[Integer.parseInt(args[0])];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (45 * Math.random()) + 1;
		}
		System.out.println(Arrays.toString(n));
		/*
		 * for (int j = 0; j < n.length; j++) { for (int i = j + 1; i < n.length; i++) {
		 * if (n[j] > n[i]) { int temp = n[j]; n[j] = n[i]; n[i] = temp; }
		 * System.out.println(Arrays.toString(n)); }
		 * 
		 * }
		 */

		int cnt = 0;
		// 과제 스와핑 작업을 최소한 수행하게 코드 수정
		for (int k = 0; k < n.length - 1; k++) {
			int min = n[k];
			int index = k;
			for (int j = k + 1; j < n.length; j++) {
				if (n[j] < min) {
					min = n[j];
					index = j;
				}
			}
			int temp = n[k];
			n[k] = n[index];
			n[index] = temp;
			cnt++;

		}
		System.out.println(Arrays.toString(n));
		System.out.println(cnt);

		// 내림차순 <

		// System.out.println(Arrays.toString(n));
		/*
		 * Arrays.sort(n); System.out.println(Arrays.toString(n));
		 */

	}
}
