package day03;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세용:");
		int jumsu = sc.nextInt();
		sc.nextLine();
		sc.close();
		sc = null;
		String grade="";
		if (!(jumsu >= 0 && jumsu <= 100)) {
			System.out.println("유효하지 않은 점수 입니다.");
			return;// 현재 수행중인 함수를 종료하고 호출한 처리로 돌아가는 문장
		}
		
		String score = jumsu>=90?"a":(jumsu>=80?"b":(jumsu>=70?"c":(jumsu>=60?"d":"f")));
		
		
		System.out.println("점수&등급 :" + jumsu+"점 "+score+"등급");
		
	
		


	}

}
