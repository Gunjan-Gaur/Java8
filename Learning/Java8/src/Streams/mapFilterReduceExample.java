package Streams;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class mapFilterReduceExample {

	public static long getCountOfNotebooks(){
		//return StudentDatabase.getAllStudents().stream().map(s -> s.getNotebooks()).reduce(0, (a,b) -> a+b);
		return StudentDatabase.getAllStudents().stream()
				.filter(s -> s.getGender().equalsIgnoreCase("female"))
				.map(Student::getNotebooks)
				.reduce(0, Integer::sum);
	}
	public static void main(String[] args) {
		System.out.println(getCountOfNotebooks());
	}

}
