package design.patterns.SOLID.liskov;

import design.patterns.SOLID.liskov.rectangleexample.Rectangle;
import design.patterns.SOLID.liskov.rectangleexample.Square;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		useRectangle(square);
		
	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		System.out.println(rectangle.getClass());
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}

}
