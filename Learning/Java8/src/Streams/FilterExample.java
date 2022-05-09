package Streams;

import java.util.List;
import java.util.stream.Collectors;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class FilterExample {

	public static List<Student> filterStudents(){
		return StudentDatabase.getAllStudents().stream()
				.filter(s -> s.getGender().equalsIgnoreCase("female"))
				.filter(s -> s.getGpa() > 4)
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(filterStudents());
	}

}
