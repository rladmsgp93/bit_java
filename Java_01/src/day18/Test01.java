package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] names1 = { "이순신", "김순신", "박순신", "김순신" };
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
		;
		System.out.println("=================================================");
		List<String> list = new ArrayList<String>();
		list.add("김길동");
		list.add("고길동");
		list.add("홍길동");
		list.add("최길동");
		list.add("이길동");
		list.add("고길동");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		List<String> list2 = new ArrayList<String>(list.subList(1, 4));
		System.out.println(list2);
		Object[] obj = list.toArray();
		System.out.println(Arrays.toString(obj));
		String[] obj2 = new String[list.size()];
		list.toArray(obj2);
		System.out.println("obj2 =>" + Arrays.toString(obj2));
		String[] sss = { "111", "222", "333", "444" };
		List<String> ssslist = new ArrayList<String>(Arrays.asList(sss));
		System.out.println(ssslist);
		System.out.println("list 다루기");
		System.out.println(list);
		System.out.println(list.contains("이길동"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).charAt(0) + "**");
		}

		for (String data : list) {
			System.out.print(data + " ");
		}
		System.out.println();
		Iterator<String> it = list.iterator();// 콜렉션을 순회하기 위한 표준화된 방법
		while (it.hasNext()) {
			String data = it.next();
			if(data.equals("홍길동")) {
				System.out.println("홍길동 삭제되었습니다.");
				it.remove();}
		}
		System.out.println(list);
	}
}
