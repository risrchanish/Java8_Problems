package assignment_1;

public class Rectangle implements Shape{

	private int length;
	private int breadth;
	
	public int getLength()
	{
		return length;
	}
	
	public int getbreadth()
	{
		return breadth;
	}
	
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		
		System.out.println("Rectangle Area: "+calculateArea());
	}
	
	@Override
	public double calculateArea() {
		
		return length*breadth;
	}

}
