package day17;

public class Test02 {

	public static void main(String[] args) {
		Book b1 = new Book("java", 500);
		System.out.println(b1);
		if (b1.getTitle() instanceof String)
			System.out.println(((String) b1.getTitle()).charAt(0));

		Book<String, Integer> b2 = new Book<String, Integer>("sql", 400);
		System.out.println(b2);
		System.out.println(b2.getTitle().charAt(0));
		
		Book<?, Integer> b3 = new Book<String, Integer>("spring", 400);
		System.out.println(b3.getTitle());//?=?object
		
		Book<?, ? extends Number> b4 = new Book<String, Integer>("spring", 400);
		System.out.println(b4.getPrice());//Number type
		
		Book<String, ? super Number> b5 = new Book<String, Object>("spring", 400);
		System.out.println(b5.getPrice());

	}

}
