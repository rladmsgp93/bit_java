package day13;

abstract class Shape {
	abstract double area();
}

public class Circle extends Shape {
	Point p;
	int r;

	//@Override
	double area() {

		return r * r * Math.PI;
	}

}
