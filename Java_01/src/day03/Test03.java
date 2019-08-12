package day03;

import java.util.Scanner;

public class Test03 {

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
		
		//String score = jumsu>=90?"a":(jumsu>=80?"b":(jumsu>=70?"c":(jumsu>=60?"d":"f")));
		
		/*
		 * String grade="f"; if(jumsu>=90) { grade = "a"; } else if(jumsu>=80) { grade =
		 * "b"; } else if(jumsu>=70) { grade = "c"; } else if(jumsu>=60) { grade = "d";
		 * }
		 */
		switch (jumsu/10) {
		case 10:
			grade ="a";
		case 9:
			grade="a";
			break;
		case 8:
			grade="b";
			break;
		case 7:
			grade="c";
			break;
		case 6:
			grade="d";
			break;

		default:
			grade ="f";
			break;
		}
		System.out.println("점수&등급 :" + jumsu+"점 "+grade+"등급");
		//System.out.println("점수&등급 :" + jumsu+"점 "+score+"등급");
		
	
		

		//sc.nextLine(); // 스캐너 버퍼안에 있는 데이터 다 날려보냉

		/*
		 * String result = jumsu >= 80 ? "pass" : "no pass"; System.out.println(result);
		 */

	}
}
