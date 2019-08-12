package day10;

public class Animal_Test01 {

	public static void main(String[] args) {
 
		Animal a1 = new Animal();
		a1.breath();

		Animal a2 = new Animal("Dog");
		a2.breath();

		Animal a3 = new Animal("고양이");
		a3.breath();

		Dog d1 = new Dog("시베리안 허스키", "캐리");
		d1.breath();
		d1.DogPrint();
		
		Dog d2 = new Dog("Dog","진돗개","새봄");
		d2.DogPrint();
		
		String animalKind = d2.getSuperKind();
		System.out.println(animalKind );
	}

}
