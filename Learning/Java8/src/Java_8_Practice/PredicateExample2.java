package Java_8_Practice;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

	static List<Student> allStudents = StudentDatabase.getAllStudents();
	static Predicate<Student> p = s -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = s -> s.getGpa() > 8.2;
	
	public static void filterByGradeLevelStudent(){
		allStudents.forEach(students -> {
			if(p.test(students))
				System.out.println(students);
		});
	}
	
	public static void filterByGPA(){
		allStudents.forEach(students -> {
			if(p2.test(students))
				System.out.println(students);
		});
	}
	
	public static void filterByGPAAndGradeLevel(){
		allStudents.forEach(students -> {
			if(p2.and(p).test(students))
				System.out.println(students);
		});
	}
	
	public static void main(String[] args) {
		filterByGradeLevelStudent();
		System.out.println("--------------------------------");
		filterByGPA();
		System.out.println("--------------------------------");
		filterByGPAAndGradeLevel();
	}

}
