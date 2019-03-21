package day2.shape;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {
	private double radious;

	public Circle(double radious) {
		this.radious = radious;
	}
	
	@Override
	public double calculateArea() {
		double area = PI * pow(radious, 2);
		return area;
	}
	
	@Override
	public void display() {
		System.out.println("radious is " + radious);
		System.out.println("area is " + calculateArea());
	}
}
