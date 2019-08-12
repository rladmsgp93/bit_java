package util;

import java.util.Arrays;

public class MyMath {
	
	public static void main(String[] args) {
		int[] n = {4,8,1,5};

		System.out.println(Arrays.toString(sort(n)));
	}

	public static long add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}// 함수명은 같은데 매개변수 리턴 타입이 다르면 오버로딩

	public static double add(double a, double b, double c) {
		return a + b + c;
	}

	public static double add(double... nums) {// [] 처리
		double sum = 0;
		for (double data : nums) {
			sum += data;
		}
		return sum;
	}

	public static String leftPad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;
		}
		int count = str.length();
		for (int i = 0; i < size - count; i++) {
			str = padChar + str;
		}
		return str;
	}

	public static String rightPad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;
		}
		int count = str.length();
		for (int i = 0; i < size - count; i++) {
			str = str + padChar;
		}

		return str;
	}

	public static int[] sort(int[] nums) {
		int[] copy = new int[nums.length];
		System.arraycopy(nums, 0, copy, 0, nums.length);
		int[] num = copy;
		for (int i = 0; i < copy.length - 1; i++) {
			//int min = i;
			for (int j = i + 1; j < copy.length; j++) {
				if (copy[i] > copy[j]) {
					int temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	
	public static int max(int...nums) {
		int max_=Integer.MIN_VALUE;
		for(int data:nums) {
			if(data>max_) {
				max_=data;
			}
		}
		return max_;
		
	}
	
	//과제
	public static int min(int...nums) {
		int min_=Integer.MAX_VALUE;
		for(int data:nums) {
			if(data>min_) {
				min_=data;
			}
		}
		return min_;
		
	}

}
