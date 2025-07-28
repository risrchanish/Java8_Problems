package assignment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberTester {
	
	/* Write Below methods:
	 * 1 `printNumbers`: Accepts a list of integers and a `NumberProcessor` 
	 * instance and processes each number in the list using the `process` method of the `NumberProcessor`.
	 * 
   * `2. filterAndPrint`: Accepts a list of integers, a `NumberProcessor` instance, and a predicate function. 
   * 	It filters the numbers in the list based on the predicate and then 
   * 		processes each filtered number using the `NumberProcessor`.
   * `3. sumNumbers`: Accepts a list of integers and returns the sum of all the numbers in the list.
	 */
	
	public static void printNumbers(List<Integer> intList, NumberProcessor nb)
	{
		intList.stream().forEach(numbers -> nb.process(numbers));
	}
	
	public static void filterAndPrint(List<Integer> intList, NumberProcessor nb, Predicate<Integer> pred)
	{
		intList.stream().filter(pred).forEach(number -> nb.process(number));
	}
	
	public static int sumNumbers(List<Integer> intList)
	{
		BinaryOperator<Integer> sum = (int1,int2) -> int1+int2;
		int totalSum = intList.stream().reduce(0, sum);
		return totalSum;
	}

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
		
		
		/*
		 * 		 Printing all the numbers in the list.
		 *		 Filtering and printing only the even numbers in the list.
		 * 		Calculating and printing the sum of all the numbers in the list.
	
		 */
		
		System.out.println("========================");
		printNumbers(intList, number -> System.out.print(number+" "));
		
		System.out.println("\n==========================");
		Predicate<Integer> filter = number -> number%2 == 0;
		filterAndPrint(intList,num -> System.out.print(num+" "), filter);
		
		System.out.println("\n===================");
		System.out.println(sumNumbers(intList));
	}

}
