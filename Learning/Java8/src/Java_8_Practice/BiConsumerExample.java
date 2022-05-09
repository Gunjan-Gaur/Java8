package Java_8_Practice;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	public static void printNameAndActivities() {
		BiConsumer<String, List<String>> b1 = (name,activities) -> System.out.println(name + " : "+activities);
		List<Student> s1 = StudentDatabase.getAllStudents();
		s1.forEach((student -> b1.accept(student.getName(),student.getActivities())));
	}

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> b1 = (a,b) ->{
			 System.out.println("Multiply "+(a*b));
		};
		BiConsumer<Integer, Integer> b2 = (a,b) ->{
			 System.out.println("Multiply "+(a/b));
		};
		b1.andThen(b2).accept(5, 5); //NOTE - Can throw NPE if andThen is null
		printNameAndActivities();
	}

	
	
}
