package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {

		Student[] s = { new Student("홍순이", 90, 80), new Student("지순이", 100, 100), new Student("고순이", 90, 60),
				new Student("박순이", 90, 80) };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 90, 100));
		list.add(new Student("김길동", 80, 40));
		list.add(new Student("고길동", 70, 50));
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

class Student extends Object implements Comparable<Student> {
	String name;
	int ko;
	int math;
	double avg;

	public String getName() {
		return name;
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
		setAvg();
	}

//좀 시큼한 냄새 아나
	public Student() {
		super();
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (ko + math) / 2.;
	}

	@Override
	public int compareTo(Student o) {

		// return ko - o.ko;
		return (int) (o.avg - avg);// 리턴 값이 양수면 오름차순
		// return name.compareTo(o.name)
		// String은 compareTo
	}
}
