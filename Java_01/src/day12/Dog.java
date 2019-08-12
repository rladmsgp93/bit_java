package day12;

public class Dog extends Animal {
String kind;
String name;


	public Dog() {
	super("강아지");
}
	public Dog(String kind,String name) {
	super("강아지");
	this.kind=kind;
	this.name = name;
}
	@Override
	public void breath() {
	System.out.println(super.kind+"=>폐로 숨쉬기 ");
	}
	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}

}
