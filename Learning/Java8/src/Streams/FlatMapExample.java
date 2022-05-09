package Streams;

import java.util.List;
import java.util.stream.Collectors;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class FlatMapExample {

	public static List<String> allActivities(){
		return StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static long countActivities(){
		return StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
	}
	
	public static void main(String[] args) {
		System.out.println(allActivities());
		System.out.println(countActivities());

	}

}
