package assignment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class NumberTester {

	public static void main(String[] args) {
		
		/*
		 * 1. Write a program that defines a list of integers.
		   2. Use lambda expressions to perform the following operations on the list:

		 		* Print all the elements in the list.
		 		* Print only the even elements in the list.
		 		* Print the sum of all the elements in the list.

		 */

		List<Integer> intList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		
		intList.stream().forEach(integer -> System.out.print(integer+" "));
		
		List<Integer> evenList = intList.stream().filter(integer -> integer%2 == 0).collect(Collectors.toList());
		System.out.println("\nEven Numbers List: "+evenList);
		
		BinaryOperator<Integer> sum = (int1,int2) -> int1+int2;
		int totalSum = intList.stream().reduce(0, sum);
		System.out.println("Total Sum: "+totalSum);
	}

}
