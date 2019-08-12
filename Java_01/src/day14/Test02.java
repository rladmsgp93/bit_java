package day14;

public class Test02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		int[] num = { 11, 22, 33, 44, 55 };
		int[] num2 = num.clone();
		System.out.println("----------------------------");
		Point p = new Point(5, 5);
		Point p2=p.clone();
		
		p.setX(0);
		System.out.println(p);
		System.out.println(p2);
	}

}
