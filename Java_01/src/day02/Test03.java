package day02;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("byte type max value =>"+Byte.MAX_VALUE);
		System.out.println("int type max value =>"+Integer.MAX_VALUE);
		System.out.println("long type max value =>"+Long.MAX_VALUE);
		
		System.out.println(Math.PI);
		char c = 'a';
		System.out.println(c+"숫자니?"+Character.isDigit(c));
		String s="1"+"1";
		System.out.println(s);
		int s1 = Integer.parseInt("1")+Integer.parseInt("1");
		System.out.println(s1);
		double d1 =Double.parseDouble("1.6")+Double.parseDouble("1.7");
		System.out.println(d1);
	
	}

}
