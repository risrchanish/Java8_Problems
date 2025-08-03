package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringManipulatorTester {
	
	

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>(Arrays.asList("Maradona","Ronaldo","banana","apple","pineapple"));
		
		// Printing using StringManipulator class using lambda
		
		stringList.stream().forEach(str -> StringManipulator.print(str));
		
		
		System.out.println("=============================");
		// Printing using StringManipulator class using method reference
		
		stringList.stream().forEach(StringManipulator::print);
		
		
		System.out.println("======Sorting the strings based on their lengths directly using Integer.compare()===========");
		
		List<String> sortedList = stringList.stream().sorted((str1,str2) -> Integer.compare(str1.length(), str2.length()))
													.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
		System.out.println("======Sorting the strings based on their lengths using the methods defined using lambda===========");
		
		List<String> sortedUsingMethod = stringList.stream().sorted((str1,str2) -> StringManipulator.compareLength(str1, str2))
																	.collect(Collectors.toList());
		
		System.out.println(sortedUsingMethod);
		
		
		System.out.println("======Sorting the strings based on their lengths using method reference===========");
		
		List<String> sortedMethodReference = stringList.stream().sorted(StringManipulator::compareLength)
							.collect(Collectors.toList());
		
		System.out.println(sortedMethodReference);


	}

}
