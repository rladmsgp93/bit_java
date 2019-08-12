package day06;

import day07.Employee;

public class Test03 {

	public static void main(String[] args) {
		//int num;
		//String name;
		//new Employee().name ="가나다";// 주소를 할당 안했을 때 생기는 객체=>temporary 객체 걍 쓰다가 버리는 것
		
		Employee emp1 = new Employee();
		//System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		Employee emp2 = new Employee();
		System.out.println(emp2);
		Employee emp3 = new Employee();
		System.out.println(emp3);
		//emp2.age = 201901;
		//emp2.name = "홍길동";
		//emp2.dept = "인사부";
		//System.out.println(emp2.age+":"+emp2.name+":"+emp2.dept);
		//emp3.age = 201902;
		//emp3.name = "고길동";
		//emp3.dept = "영업부";
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);
		//Employee emp4 = new Employee("다라마","영업부",1234,true);
		//System.out.println(emp4.name);
		//emp4.display();
		System.out.println("hello".charAt(0));
	}

}
