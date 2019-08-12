package day07;

import util.MyMath;

public class MyMathTest {

	public static void main(String[] args) {
	System.out.println(MyMath.add(33, 99));
	System.out.println(MyMath.add(33.3, 99.3));
	System.out.println(MyMath.add(33.3, 99.3,90));
	System.out.println(MyMath.add(1,2,3,4,5,6,7,8,9,10));
	System.out.println(MyMath.add(new double[] {1,2,3,4,5,6,7,8,9,10}));
	System.out.println(MyMath.max(4,9,7,8));
	}

}
