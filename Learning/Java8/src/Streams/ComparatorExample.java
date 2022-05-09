package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class ComparatorExample {

	public static List<Student> sortStudentsByName(){
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGPA(){
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGPAinDescOrder(){
		return StudentDatabase.getAllStudents().stream().
				sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(sortStudentsByName());
		System.out.println("---------------------");
		System.out.println(sortStudentsByGPA());
		System.out.println("---------------------");
		System.out.println(sortStudentsByGPAinDescOrder());
	}

}
