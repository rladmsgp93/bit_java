package day12;

public class Book {
	private String title;
	private int price;

	public Book() {

	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Book(int price, String title) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("book정보/title: ");
		sb.append(title);
		sb.append(" ,가격 :");
		sb.append(price);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj == null && !(obj instanceof Book)) {
			return false;
		}
		Book data = (Book) obj;

		if (price == data.price && title.equals(data.title)) {
			flag = true;
		}
		return flag;
		
		

//boolean c= this.getTitle().equals(((Book) obj).getTitle());
//boolean d= this.getPrice()==((Book)obj).getPrice();

	}
	
//	protected void finalize() throws Throwable {
//		//객체가 소멸되기 직전에 호출되는 메소드 이지만 자바에서는 사용안하고 별도의 자원반납 기능을 만들어 사용한다.
//		System.out.println("자원 반납 코드");
//	}
//	
public void close() {
		System.out.println("자원 반납 코드");
	}
}
