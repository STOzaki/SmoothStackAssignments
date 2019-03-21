package day2.shape;

import java.util.Random;
public class Triangle implements Shape {
	public Triangle() {
		System.out.println("Triangles are complicated.");
	}
	
	@Override
	public double calculateArea() {
		Random guess = new Random();
		System.out.println("You know that you need to the height and base to calculate the area, right?");
		System.out.print("Well, I found out that finding the height of a triangle is difficult");
		System.out.println(" unless you know the angles and even then it depends. So I am just going to give you a number from 0 to 100.");
		return (double) guess.nextInt(101);
	}
	
	@Override
	public void display() {
		Random another_guess = new Random();
		System.out.print("Hello! So since I don't actually know the real area, I will just");
		System.out.print(" guess a different number than the one I would give your from");
		System.out.println(" 'calculating' the area.");
		System.out.println(another_guess.nextDouble());
	}
}
