package assignment_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTester {

	public static void main(String[] args) {	
		
		List<Long> johnNumbers = Arrays.asList(8989898989L);
		List<Long> johnyNumbers = Arrays.asList(9898989898L);
		List<Long> janardhanNumbers = Arrays.asList(9898987778L);
		
		List<Employee> empList = new ArrayList<>(List.of(new Employee(1,"John","CS",900.0,johnNumbers), 
											new Employee(2,"Johny","CSA",6000.0,johnyNumbers),
											new Employee(3,"Janardhan","PSI",500.0,janardhanNumbers)));
		
		// Collect all employee’s names in one list, who have salary > 5000
		
		System.out.println("Salary greate than 5000: ");
		
		List<Employee> empGreaterFive =  empList.stream().filter(emp -> emp.getSalary() > 5000.0).collect(Collectors.toList());

		System.out.println(empGreaterFive);
		
		
		// Sort the list based on salary in desc order.
		
		System.out.println("\nSorting in desending on salary: ");
		
		List<Employee> desSalary = empList.stream().sorted((emp1,emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()))
														.collect(Collectors.toList());
		
		
		System.out.println(desSalary);
		
		// Find employee’s name who has min salary.
		System.out.println("\nMin salary employee: ");
		
		System.out.println("Min Salary: "+ desSalary.get(desSalary.size()-1));
		
		
		// Find employee's mobile number in a single list
		
		System.out.println("All mobiles in a single list: ");
		
		List<List<Long>> mobileNumbers = empList.stream().map(emp -> emp.getMobileNumber()).collect(Collectors.toList());
		
		System.out.println(mobileNumbers);
		
	}

}
