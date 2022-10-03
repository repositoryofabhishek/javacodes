package gfgoopconcepts;

public class AbstractClassConcept {
	public static void main(String[] args) {
		Circle c=new Circle("Black", 5);
		System.out.println(c.toString());
		Rectangle r=new Rectangle("White", 12,12);
		System.out.println(r.toString());
	}

}

abstract class Shape {
	String color;

	public abstract double area();

	public String getColor() {
		return color;
	}

	public Shape(String color) {
		this.color = color;
	}

	public abstract String toString();
}

class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The color of the shape is " + getColor() + " and area is " + area();
	}

}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The color of the shape is" + getColor() + " and the area of the rectangle is " + area();
	}

}