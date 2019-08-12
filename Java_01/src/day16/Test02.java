package day16;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("main start");
		String msg = null;
		msg = "xmlhgygy";
		try {
			System.out.println(msg.charAt(3));
			int num = Integer.parseInt(msg);
		} catch (NullPointerException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {
			System.out.println("자원 반납 코드");
		}
		System.out.println("main end");

	}

}
