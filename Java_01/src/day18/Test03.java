package day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;//vector는 동기화처리가 되어있다 싱크로나이즈드 블럭

public class Test03 {
	public static void main(String[] args) {

		Student[] s = { new Student("홍순이", 90, 80), new Student("지순이", 100, 100), new Student("고순이", 90, 60),
				new Student("박순이", 90, 80) };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		Vector<Student> list = new Vector<Student>(5,10);
		System.out.println("capacity:" + list.capacity());
		System.out.println("size:"+list.size());
		list.add(new Student("홍길동", 90, 100));
		list.add(new Student("김길동", 80, 40));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		list.add(new Student("고길동", 70, 50));
		System.out.println("capacity:" + list.capacity());
		System.out.println("size:"+list.size());
		System.out.println(list);
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.getAvg() >= 90)
				System.out.println(data);
		}
		// System.out.println(list.contains(new Student("고순이", 80, 40)));
		// 등록
//		Student s1 = new Student("홍길동", 90, 90);
//		boolean flag = list.add(s1);
//		if (flag)
//			System.out.println(s1 + " 등록되었습니다.");
//		else
//			System.out.println("등록되지 않았습니다.");
//		// 수정 100 100
//		it = list.iterator();
//		while (it.hasNext()) {
//			Student data = it.next();
//			if (data.getName().equals("홍길동")) {
//				data.setKo(100);
//				data.setMath(100);
//				data.setAvg();
//				System.out.println(data.toString());
//				break;
//			}
//		}
		System.out.println("=========학생 list 출력======");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}
		it = list.iterator();
//		while (it.hasNext()) {
//			Student data = it.next();
//			if (data.equals(s1)) {
//				it.remove();
//				System.out.println(s1 + "삭제되었습니다.");
//				break;
//			}
//		}
		Collections.sort(list);
		System.out.println("=========학생 list 출력======");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}

	}
}
