package assignment_1;

public class Triangle implements Shape{

	private int base;
	private int height;
	
	public int getBase()
	{
		return base;
	}
	
	public Triangle()
	{
		
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Triangle(int base,int height)
	{
		this.base = base;
		this.height = height;
		
		System.out.println("Triangle Area: "+calculateArea());
	}
	
	@Override
	public double calculateArea() {
		
		return 1.0/2.0*(base*height);
	}

}
