package day02;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름 입력");
		System.out.println("점수 입력");
		String name = sc.nextLine();
		int score = sc.nextInt();
		System.out.println("학생 이름"+name+"점수 입력"+score);
		
		sc.close();
		sc=null;
	
	}
	

}
