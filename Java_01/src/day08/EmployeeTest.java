package day08;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee emp1= new Employee("이여울","영업부",20,false);
		emp1.print();
		Employee emp2= new Employee("김은혜","인사부");
		emp2.print();
		Employee emp3= new Employee("홍다","인사부",21,false);
		emp3.print();
		Employee emp4= new Employee("이소","영업부",22,true);
		

	}

}
