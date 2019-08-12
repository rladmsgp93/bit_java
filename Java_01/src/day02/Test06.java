package day02;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * int score = 99; boolean result = 0 <= score && score <= 100;
		 * System.out.println("score 유효성 검사 결과 : " + result);
		 */
		int a,b; 
		a=b=10;
		
		boolean c = ++a>b++;
		boolean d = a++>=++b;
		System.out.println(c);
		System.out.println(d);
		
		boolean f = a>b-1&a>b;
		boolean  e = a>b-1&&a>b;
		System.out.println(e);
		System.out.println(f);
//boolean c =++a>b++||a++>=++b;
//		System.out.println(c);
	}
}
