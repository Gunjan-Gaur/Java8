package Java_8_Practice;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	public static List<Student> getAllStudents(){
		
		Student s1 = new Student("Aish", 2, 7.8, "Female",Arrays.asList("Badminton","Cricket","Hockey"),23);
		Student s2 = new Student("Dam", 2, 6.1, "Male",Arrays.asList("Swimming","Polo","Gymnastics"),12);
		
		Student s3 = new Student("Priya", 3, 9.1, "Female",Arrays.asList("Ludo","Cricket","Polo"),4);
		Student s4 = new Student("Aman", 3, 8.2, "Male",Arrays.asList("Chess","Caram","Hockey"),45);

		Student s5 = new Student("Manoj", 4, 9.4, "Male",Arrays.asList("Air Hockey","Swimming","Hockey"),21);
		Student s6 = new Student("Ram", 4, 6.5, "Male",Arrays.asList("Badminton","Tennis","Polo"),31);
		
		List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);
		return students;
	}

}
