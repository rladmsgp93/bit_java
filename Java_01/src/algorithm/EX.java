package algorithm;

public class EX {

	public static void main(String[] args) {
		String msg = "hello java";
		System.out.println("1");
		try {
			System.out.println("2");
			if (msg == null)
				throw new Exception();
			System.out.println(3 / 0);
			System.out.println("3");

		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("4");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("5");
		} finally {
			System.out.println("6");
		}
System.out.println("7");
	}

}
