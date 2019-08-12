package day06;

import day07.Employee;

public class Test04 {
	public static void main(String[] args) {
		Employee[] EMP = new Employee[3];
		Employee emp2 = new Employee();
		emp2.setAge(20);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		Employee emp3 = new Employee();
		emp3.setAge(20);
		emp3.setName("고길동");
		emp3.setDept("인사부");
		EMP[0] = new Employee("김", "영업부", 20, false);
		EMP[1] = emp2;
		EMP[2] = emp3;
		// Employee[] emp = {emp2,emp3,emp4};
		// for (Employee data : EMP) {
		// System.out.println(data.getDept());
		/*
		 * if(data.getDept().equals("영업부")) data.display();
		 */
		// }

		for (Employee data : EMP) {
			if (data.getDept() != null && data.getDept().equals("영업부"))
				data.display();
		}
		for (Employee data : EMP) {
			if (!data.isSingle()) {
				data.display();
			}

			// for(int i=0;i<EMP.length;i++){
			// if(EMP[i].single){
			// Emp[i].dislplay();}}

		}
	}
}
