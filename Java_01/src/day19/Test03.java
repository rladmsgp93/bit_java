package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();// key값을 찾아내는 속도가 엄청 빠름 바인딩 된 값을 빠르게 찾아준당
		map.put("java01", "1234");
		map.put("admin", "1234");
		map.put("java02", "1234");
		map.put("test01", "test");
		for (int i = 0; i < 30; i++) {
			map.put("test" + i, (int) (Math.random() * 10) + "80");
		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" 로그인처리 ");
			System.out.println("ID/PW 형식으로 임력해 주세요 ");
			String data = sc.nextLine();
			String[] idpw = data.split("/");
			String id = idpw[0];
			String pw = idpw[1];
			if (map.containsKey(id)) {

				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("pw 불일치");
					System.out.println("다시 로그인하세요");
				}
			} else {
				System.out.println("id가 존재x");
				System.out.println("회원 가입 후 이용하세요");
			}
		}
	}

}
