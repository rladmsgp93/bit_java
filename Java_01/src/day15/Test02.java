package day15;

public class Test02 {

	public static void main(String[] args) {
		// A a = new A();
		// a.p();
		A.B b = new A().new B();
		b.print();
		//A.C c =new A().new C();
		//c.print();
		A.C.print();
		
		
		

	}
}

class A {
	String name = "A";

	public A() {

	}

	public A(String name) {
		super();
		this.name = name;
	}

	void p() {
		System.out.println("A에서 호출");
		new B().print();
	}

	class B {
		String name = "B";

		void print() {
			System.out.println(A.this.name);
			System.out.println(this.name);

		}
	}
	
	static class C{ //아우터에 있는 인스턴스 자원을 못쓴당
		static void print() {
			System.out.println("~~~~~~");
		}
		
	}
	class D{
		void p() {
			class E{//함수 안에서 이너클래스 설정 가능
				
			}
		}
	}
}
