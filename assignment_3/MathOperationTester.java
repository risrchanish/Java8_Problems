package assignment_3;

import java.util.Optional;


public class MathOperationTester implements MathOperation{
	
	public static Optional<Double> performOperation(Double a, Double b, MathOperation operation)
	{
		if(b == 0)
		{
			return Optional.empty();
		}
		
		return Optional.ofNullable(operation.operate(a, b));
	}
	

	@Override
	public double operate(double a, double b) {
	
		return a+b;
	}

	public static void main(String[] args) {
		
		
		double a = 4.0;
		double b = 0.0;
		
		// Addition
		System.out.println("Addition: "+performOperation(a,b, (a1,b1) -> a1+b1));
		
		// Subtraction
		System.out.println("Subtraction: "+performOperation(b, a, (b1,a1) -> b1-a1));
		
		// multiplication
		System.out.println("Multiplication: "+performOperation(a,b,(a1,b1) -> a1* b1));
		
		// Division
		System.out.println("Division: "+performOperation(a,b,(a1,b1) -> a1/b1));
		
		// Division by zero	
		
		Optional<Double> division = performOperation(a,b,(a1,b1) -> b1/a1);
		if(division.isPresent())
		{
			System.out.println(division.get());
		}
		else
		{
			System.out.println("Empty: "+division.isEmpty());
		}
//		System.out.println(performOperation();
		
	}


}
