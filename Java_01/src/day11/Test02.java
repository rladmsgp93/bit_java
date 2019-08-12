package day11;

public class Test02 {
	public static void main(String[] args) {
		Person[] p = { new Student("홍길동", 20, 2012001), new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과") };

		for (Person data : p) {
			data.printA();
			System.out.println();
		}
System.out.println("------------------------");
		for (Person data : p) {
			if (data instanceof Student)
				((Student) data).print();
			if (data instanceof Teacher)
				((Teacher) data).print();
			if (data instanceof Employee)
				((Employee) data).print();
		}

	}
}
