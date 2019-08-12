package day07;

public class Calc {
	boolean flag;
	int data =0;
	//static int data = 0;
	
	public static long add(int a, int b) {
		//System.out.println(data); 메모리가 다른 영역에 있어서 접근 못함, 인스턴스 자원은 접근 못함
		return a + b;
	}//클래스 메서드
	
	//public static long add(int a, int b) {
	//	System.out.println(Calc.data); 메모리가 다른 영역에 있어서 접근 못함, 인스턴스 자원은 접근 못함
    //		return a + b;
	//}
	
	//public long add(int a, int b) {
	//	System.out.println(this.data); //인스턴스 메서드
	//	return a + b;
	//}
	
	//public long add(int a, int b) {
		//	System.out.println(Calc.data); //인스턴스 메서드
		//	return a + b;
		//}


	public static long sub(int a, int b) {
		return a - b;
	}

	public static long multi(int a, int b) {
		return a * b;
	}

	public static long divide(int a, int b) {
		if (b == 0)
			return 0;
		return a / b;
	}
}
