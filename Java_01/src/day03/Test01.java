package day03;

public class Test01 {

	public static void main(String[] args) {  
		//==: 기본형의 값이 같은 지 비교, equals(): 참조형 데이터가 같은지 비교

		int num1 = 99;
		int num2 = 99;
		String name1 = "홍길동";
		String name2 = "홍길동";
		String msg1 = new String("hello");
		String msg2 = new String("Hello");
		
		System.out.println("num1==num2 =>"+(num1==num2));
		System.out.println("name1==name=>"+(name1==name2));//에외 저러케 string 선언 됬을 떄
		System.out.println("msg1==msg2=>"+msg1.equals(msg2));
		
		msg1=msg2;
		System.out.println("msg1==msg2=>"+msg1.equals(msg2));
	}

}
