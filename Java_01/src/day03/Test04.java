package day03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("숫자 1입니다.");
			break;
		case 2:
			System.out.println("숫자 2입니다.");
			break;
		case 3:
			System.out.println("숫자 3입니다.");
		default:
			System.out.println("기본값입니다.");
		}

	}

}
