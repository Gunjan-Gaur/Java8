package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class MapExample {

	public static List<String> listOfName() {
		List<Student> allStudents = StudentDatabase.getAllStudents();
		if (allStudents != null) {
			return allStudents.stream().map(Student::getName).collect(Collectors.toList());
		}
		return null;
	}

	public static Set<String> listOfSet() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		System.out.println(listOfName());
		System.out.println(listOfSet());
	}

}
