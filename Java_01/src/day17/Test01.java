package day17;

public class Test01 {
	public static void main(String[] args) {
		Book1 b1 = new Book1("JAVA", 900);// 자동으로 T=>Object
		System.out.println(b1);

		Book1<Double> b2 = new Book1<Double>("SQL", 700.0);
		System.out.println(b2);

		Book1<Integer> b3 = new Book1<Integer>("JSP", 6000);
		System.out.println(b3);
	}
}
