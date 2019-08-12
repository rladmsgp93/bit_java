package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {

	public static void main(String[] args) {
	Animal d = new Dog("진돗개","새봄");
	if(d instanceof Dog)((Dog)d).DogPrint();
	d.breath();//폐로 숨쉬기 출력 오버라이딩이 안되서
	Fish f =new Fish("니모");
	f.FishPrint();
	f.breath();//오버라이딩 됬기 때문에 아가미로 숨쉬기가 출력

	}

}
