package day08;

public class Card {
	String kind="다이아";
	int number;
	final static int WIDTH = 100;
	final static int HEIGHT = 250;//상수화
	
	public static void main(String[] args) {
		
		System.out.println(WIDTH+" * "+HEIGHT);
		System.out.println(new Card().kind);
		
		
	}
}
