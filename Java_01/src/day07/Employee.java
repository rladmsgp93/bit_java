package day07;

public class Employee {
//데이터(변수)+기능(메서드)
	private String name;// 접근 지정자가 default same package에 있어야지만 접근 가능
	private String dept;
	private int age;// 201901, 클래스 외부에서는 접근을 못한당

	private boolean single;

	public Employee() {
	};

	public Employee(String name, String dept, int number, boolean single) {
		this.name = name;
		this.dept = dept;
		this.age = number;
		this.single = single;
	}

	public void display() {
		System.out
				.println("number:" + this.age + " name:" + this.name + " dept:" + this.dept + " 결혼 유무:" + this.single);

		return;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (!(age > 0 && age <= 100)) {
			System.out.println("나이 정보가 올바르지 않다");
			return;
		}
		this.age = age;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

}
