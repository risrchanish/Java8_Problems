package assignment_6;


import java.util.List;
import java.util.Optional;

public class PersonTester {
	
	// Find and print the details of the person with the specified ID (if present).
	
	public static Optional<Person> findById(int id, List<Person> personList)
	{
		return personList.stream().filter(person -> person.getId() == id).findFirst();
	}
	
	
	// Find and print the details of the person with the specified Name (if present).
	
	public static Optional<Person> findByName(String name, List<Person> personList)
	{
		return personList.stream().filter(person -> person.getName() == name).findFirst();
	}
	
	
	// Find and print the details of the oldest person in the list.
	
	public static Optional<Person> oldestPerson(List<Person> personList)
	{
		return personList.stream().sorted((person1,person2) -> Integer.compare(person2.getAge(), person1.getAge()))
								.findFirst();
	}
	
	
	//Find and print the details of the youngest person in the list.
	
	public static Optional<Person> findYoungestPerson(List<Person> personList)
	{
		return personList.stream().sorted((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge()))
									.findFirst();
	}

	public static void main(String[] args) {
		
		List<Person> personList = List.of(new Person(30,1,"john"), new Person(25,2,"alice"), 
										new Person(35,3,"bob"), new Person(22,4,"emily"));
		
		// Find and print the details of the person with the specified ID (if present).
		int id = 5;
		
		Optional<Person> result = findById(id, personList);
		
		System.out.println("========Using Java 9 method=======");
		
		result.ifPresentOrElse(person -> System.out.println(person.getName() + " "+person.getAge()), 
				                       () -> System.out.println("Given Id: "+id+" not found"));
		
		System.out.println("\n===Using Java 8=========");
		
		
		if(result.isPresent())
		{	
			Person matchFound = result.get();
			System.out.println("Age: "+matchFound.getAge() +" Name: "+matchFound.getName());
		}
		
		else
		{
			System.out.println("Match Not Found");
		}
		
		System.out.println("\n======================");
		
		// Find and print the details of the person with the specified Name (if present).
		
		String name = "johny";
		Optional<Person> nameResult = findByName(name,personList);
		
		if(nameResult.isPresent())
		{
			Person nameMatch = nameResult.get();
			System.out.println("Id: "+nameMatch.getId() + " Age: "+nameMatch.getAge());
		}
		else
		{
			System.out.println(name+" not found");
		}
		
		
		System.out.println("\n====Using java 9 and Lambda=====");
		
		nameResult.ifPresentOrElse(person -> System.out.println("Id: "+person.getId()+" Age: "+person.getAge()), 
									() -> System.out.println("Not found"));
		
		
		
		// Find and print the details of the oldest person in the list.
		System.out.println("\n====Oldest Person====");
		
		Optional<Person> oldestPerson = oldestPerson(personList);
		oldestPerson.ifPresentOrElse(person -> System.out.println("name: "+person.getName()+
																  " age: "+person.getAge()+
																  " Id: "+person.getId()), 
									() -> System.out.println("Age is null"));
		
		
		
		//Find and print the details of the youngest person in the list.
		System.out.println("\n=======Youngest Person=========");
		
		Optional<Person> youngestPerson = findYoungestPerson(personList);
		
		youngestPerson.ifPresentOrElse(person -> System.out.println("name: "+person.getName()+
																    " age: "+person.getAge()+
																    " Id: "+person.getId()), 
									   () -> System.out.println("Age is null"));
		
		
	}

}
