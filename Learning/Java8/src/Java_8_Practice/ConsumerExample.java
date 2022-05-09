package Java_8_Practice;

import java.util.List;
import java.util.function.Consumer;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;
public class ConsumerExample {
	static Consumer<Student> c1 = (students) -> System.out.println(students);
	static Consumer<Student> names = (students) -> System.out.println(students.getName());
	static Consumer<Student> activities = (students) -> System.out.println(students.getActivities());
	static List<Student> allStudents = StudentDatabase.getAllStudents();

	public static void printAllStudents() {
		System.out.println("printAllStudents---");
		allStudents.forEach(c1);
	}
	
	public static void getName_Activities(){
		System.out.println("getName_Activities---");
		allStudents.forEach(names.andThen(activities));
	}
	
	public static void getName_Activities_grade(){
		System.out.println("getName_Activities_grade---");
		allStudents.forEach((students) -> {
			if(students.getGradeLevel() > 3)
				names.andThen(activities).accept(students);
		});
		}
	public static void main(String[] args) {
		
		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("gunjan");
		printAllStudents();
		getName_Activities();
		getName_Activities_grade();
	}
}
