package Streams;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class MatchExample {

	public static boolean allMatch(){
		return StudentDatabase.getAllStudents().stream().allMatch(s -> s.getGpa()>=11.6);
	}
	
	public static boolean anyMatch(){
		return StudentDatabase.getAllStudents().stream().anyMatch(s -> s.getGpa()>22.8);
	}

	public static boolean noneMatch(){
		return StudentDatabase.getAllStudents().stream().noneMatch(s -> s.getGpa()>22.3);
	}

	
	public static void main(String[] args) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}

}
