package assignment_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonWords {

	public static void main(String[] args) {
		
		String str1 = "This is 1st sentence of comparing";
		String str2 = "This is 2nd sentence of comparing with above";
		
		// Creating a stream by splitting the sentence on space and collecting into a List of strings.
		List<String> wordsInFirst = Arrays.stream(str1.split(" ")).collect(Collectors.toList());
		
		List<String> wordsInSecond = Arrays.stream(str2.split(" ")).collect(Collectors.toList());
		
		
		// Iterated through the words in first and checked the availability in second.
		
		List<String> commonWords = wordsInFirst.stream().filter(str -> wordsInSecond.contains(str))
												.collect(Collectors.toList());

		System.out.println(commonWords);
	}

}
