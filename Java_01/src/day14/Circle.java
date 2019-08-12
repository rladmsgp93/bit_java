package day14;

abstract class Shape implements DrowandMore {// 추상, 인스턴스도 가능
	abstract double area();

}

interface DrowandMore extends Drawable, Moveable {
}

interface Drawable {// 모두 추상 메서드만 들어가
	public abstract void draw();
}

interface Moveable {
	void move(int m);

}

public class Circle extends Shape implements Drawable, Moveable, Cloneable {
	Point p;
	int r;

	@Override
	public void move(int m) {
		p.setX(p.getX() + m);
		p.setY(p.getY() + m);

	}

	public Circle() {
	}

	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double area() {
		return r * r * Math.PI;
	}

	@Override
	public void draw() {
		System.out.println(getClass().getName() + " 그리기");
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	}

	@Override
	protected Circle clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle c= (Circle) super.clone();
		Point p = c.p.clone();
		c.p=p;
		return c;
	}

}