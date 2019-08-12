package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test07_foreach {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(2017002, "김씨", "마케팅부"));
		list.add(new Employee(2017002, "박씨", "기술부"));
		list.add(new Employee(2017002, "박씨", "전산실"));
		list.add(new Employee(2017002, "고씨", "기술부"));
		list.add(new Employee(2017002, "홍길동", "마케팅부"));
		list.add(new Employee(2017002, "김씨", "영업부"));
		System.out.println("******iterator 기반 목록 출력*******");
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
		}
		System.out.println();
		System.out.println("*******foreach 기반 목록 출력 **************");
		list.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {

				System.out.println(t);
			}

		});
//foreach 람다로 표현
		System.out.println("****foreach 람다로~1*******");
		list.forEach(

				(Employee t) -> {

					System.out.println(t);
				}

		);
		System.out.println();
		System.out.println("****foreach 람다로~2*******");
		list.forEach(

				t -> System.out.println(t)

		);
		System.out.println();
		System.out.println("****foreach 람다로~3*******");
		list.forEach(System.out::println);

	}

}
