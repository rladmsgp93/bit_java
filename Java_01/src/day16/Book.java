package day16;

import day17.PriceException;

public class Book {
	private String title;
	private int price;

	public Book() {
		super();
	}

	public Book(String title, int price) throws PriceException {
		super();
		this.title = title;
//		try {
//		setPrice(price); 
//	} catch (Exception e) {
//		e.printStackTrace();
//	} 
	
	setPrice(price); //RuntimeException이면 throws Exception안해도 에러안남	
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

	public void setPrice(int price) throws PriceException {
		if (price <= 0)
			throw new PriceException("음수는 안돼");//throws 함수 오버라이딩 할 때 throws 생략 가능
		this.price = price;
	}

	public String toString() {
		return "Book[title=" + title + ", price=" + price + "]";

	}
}
