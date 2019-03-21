package day2.shape;

public class Rectangle implements Shape {
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		double area = height * width;
		return area;
	}
	
	@Override
	public void display() {
		System.out.println("This rectangle is " + height + " by " + width + ".");
		System.out.println("And the area is " + calculateArea());
	}
}
