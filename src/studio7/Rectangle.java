package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle{

	private int length;
	private int width;
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}
	
	public int area () {
		return length * width;
		
	}
	
	public int perimeter() {
		return (2 * length) + (2 * width);
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isLarger(Rectangle r2) {
		if (this.area() > r2.area()) {
			return true;
		}
		else {
			return false;
		}
	}

public static void main(String[] args) {

Rectangle r1 = new Rectangle(8,3);
Rectangle r2 = new Rectangle(5,5);

System.out.println("Area: " + r1.area());
System.out.println("Perimeter: " + r1.perimeter());
System.out.println("Is Square? " + r1.isSquare());
System.out.println("Is larger? " + r1.isLarger(r2));
}
}