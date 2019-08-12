package day06;

import day07.Employee;

public class Test02 {

	public static void main(String[] args) {
		int num;
		String name;
		//new Employee().name ="가나다";// 주소를 할당 안했을 때 생기는 객체=>temporary 객체 걍 쓰다가 버리는 것
		
		Employee emp1 = new Employee();
		//System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		Employee emp2 = new Employee();
		System.out.println(emp2);
		Employee emp3 = new Employee();
		System.out.println(emp3);
		emp2.setAge(20);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		System.out.println(emp2.getAge()+emp2.getName()+emp2.getDept());
		//emp3.setAge(201902);
		//emp3.name = "고길동";
		//emp3.dept = "영업부";
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);
		Employee emp4 = new Employee("다라마","영업부",1234, true);
		System.out.println();
		//System.out.println(emp4.name);
		emp4.display();
	}

}

