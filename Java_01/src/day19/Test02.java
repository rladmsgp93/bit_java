package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();// key값을 찾아내는 속도가 엄청 빠름 바인딩 된 값을 빠르게 찾아준당
		map.put("java01", "1234");
		map.put("admin", "1234");
		map.put("java02", "1234");
		map.put("test01", "test");
		for (int i = 0; i < 30; i++) {
			map.put("test" + i, (int) (Math.random() * 10) + "80");
		}
//System.out.println(map);
		System.out.println(map.get("admin"));
		System.out.println(map.get("java01"));
		System.out.println("===================================================");
		Set<String> keynames = map.keySet();
		Iterator<String> it = keynames.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("ID" + key + ",PW" + map.get(key));
		}
	}

}
