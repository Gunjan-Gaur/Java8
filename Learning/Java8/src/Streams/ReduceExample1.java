package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Java_8_Practice.Student;
import Java_8_Practice.StudentDatabase;

public class ReduceExample1 {

	public static int calculate(List<Integer> list){
		return list.stream().reduce(1, (a,b) -> a*b);
	}
	
	public static Optional<Integer> calculateWithOptional(List<Integer> list){
		return list.stream().reduce((a,b) -> a*b);
		//return null;
	}
	
	public static Optional<Student> getHigestGPAStudent(){
		return StudentDatabase.getAllStudents().stream().reduce((a,b) -> (a.getGpa() > b.getGpa()) ? a : b);
	}
	
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1,3,5,7);
		System.out.println(calculate(li));
		System.out.println(calculateWithOptional(li).isPresent());
		System.out.println(calculateWithOptional(li).get());
		
		if(calculateWithOptional(li).isPresent()){
			calculateWithOptional(li).get();
		}
		
		if(getHigestGPAStudent().isPresent())
			System.out.println(getHigestGPAStudent().get());
		
	}

}
