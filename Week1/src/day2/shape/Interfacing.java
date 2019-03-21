package day2.shape;

public class Interfacing {
	public static void main(String[] args) {
		// trying the rectangle
		Rectangle rectangle = new Rectangle(10, 12);
		double area_rectangle = rectangle.calculateArea();
		System.out.println("area of rectangle: " + area_rectangle);
		rectangle.display();
		
		// trying the circle
		Circle circle = new Circle(10);
		double area_circle = circle.calculateArea();
		System.out.println("area of circle: " + area_circle);
		circle.display();
		
		// trying the triangle
		Triangle triangle = new Triangle();
		double area_triangle = triangle.calculateArea();
		System.out.println("guessing..." + area_triangle);
		triangle.display();
	}
}
