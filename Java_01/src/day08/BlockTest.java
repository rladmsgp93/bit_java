package day08;

public class BlockTest {

	public static void main(String[] args) {
		Block b1 = new Block();
		b1.print();
		Block b2 = new Block(5);
		b2.print();
		

	}

}

class Block {
	int i;
	int j;
	static String name;
	static {
		// System.out.println("static {}");
		name = "~~~";
	}
	{
		// System.out.println("{ }");
		this.j = 99;
	}

	public Block() {
		// this.j=99;
		// System.out.println("생성자");
	}

	public Block(int i) {
		this.i = i;
	}

	public void print() {
		System.out.printf("i=%s,j=%s, name =%s %n",i,j,name);
	}
}
