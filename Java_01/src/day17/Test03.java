package day17;


import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {

		// List list = new ArrayList();//collection 자체가 object 배열로 사용 =>object 는 실질적으올
		// 다운 케스팅=>위험
		List list = new Vector();
		list.add("hello");
		list.add("hello");
		list.add(200);
		list.add(new Date());
		list.add(new Book("spring", 2000));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
