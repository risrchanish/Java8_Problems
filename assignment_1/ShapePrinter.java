package assignment_1;

import java.util.ArrayList;
import java.util.List;

public class ShapePrinter {

	public static void main(String[] args) {
		
		Shape c = new Circle(2);
		Shape r = new Rectangle(2,3);
		Shape t = new Triangle(3,4);
		
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(c);
		shapeList.add(r);
		shapeList.add(t);
		
		
		shapeList.forEach(shapes -> shapes.calculateArea());
		
		shapeList.forEach(shapes -> shapes.printShapeDetails());
		
		Shape.printShapeCount(shapeList);

	}

}
