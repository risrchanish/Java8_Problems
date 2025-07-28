package assignment_1;

public class Circle implements Shape{

	private int radius;
	
	public int getRadius()
	{
		return radius;
	}
	Circle()
	{
		
	}
	
	Circle(int radius)
	{
		this.radius = radius;
		System.out.println("Circle Area: "+calculateArea());
	}
	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}

}
