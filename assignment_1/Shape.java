package assignment_1;

import java.util.ArrayList;
import java.util.List;

public interface Shape {

	public double calculateArea();
	public default void printShapeDetails()
	{
		System.out.println(calculateArea());		
	}
	
	static void printShapeCount(List<Shape> shapes)
	{
		shapes = new ArrayList<>(List.of(new Circle(),new Triangle(),new Rectangle()));
		System.out.println("Total number of shapes: "+shapes.size());
	}
}
