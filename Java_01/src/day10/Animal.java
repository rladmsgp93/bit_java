package day10;

public class Animal {
	protected String kind = "동물의 종류";

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public Animal() {
		super();
	}

	public void breath() {
		System.out.println(kind + ": 폐로 숨쉬기~~~");
	}

	public void print() {
		System.out.printf("Animal Kind:%s ", kind);
	}

}
