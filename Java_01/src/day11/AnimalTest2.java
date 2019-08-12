package day11;

import day10.Animal;
import day10.Dog;
import day11.Fish;

public class AnimalTest2 {

	public static void main(String[] args) {

		Animal[] a1 = { new Dog("진돗개", "쫑이"), new Fish("오로라"), new Dog("푸들", "몽자") };

//		for (Animal data : a1) {
//			data.breath();
//			data.print();
//		}
		
		Dog d1 = new Dog("진돗개", "쫑이");
		callD(d1);
		Fish f1 = new Fish("니모");
		callD(a1[1]);
		
	}

//	public static void callD(Dog d){
//		d.breath();
//	
//	}

	public static void callD(Animal d) {
		d.breath();
	}
}
