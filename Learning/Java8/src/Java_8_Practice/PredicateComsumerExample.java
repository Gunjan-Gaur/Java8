package Java_8_Practice;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateComsumerExample {

	static Predicate<Student> p = s -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = s -> s.getGpa() > 8.2;
	static BiConsumer<String, List<String>> b = (name,activities) -> System.out.println(name +" "+activities);
	static BiPredicate<String,Integer> bi = (name,gradelevel) -> name != null && gradelevel > 5;
	
	static Consumer<Student> c = students -> {
		if(p.and(p2).test(students)){
			b.accept(students.getName(), students.getActivities());
		}
		
		if(bi.test(students.getName(), students.getGradeLevel())){
			System.out.println("---------------");
			System.out.println(students.getName()+ " " + students.getGradeLevel());
		}	
	};
	
	private static void printGPAAndGradelevelstudents(List<Student> allStudents) {
		allStudents.forEach(c);	
	}
	
	public static void main(String[] args){
		List<Student> allStudents = StudentDatabase.getAllStudents();
		printGPAAndGradelevelstudents(allStudents);
	}
	
}
