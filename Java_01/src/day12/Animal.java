package day12;

public abstract class Animal {
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

	public abstract void breath();

	public void print() {
		System.out.printf("Animal Kind:%s ", kind);
	}

}
