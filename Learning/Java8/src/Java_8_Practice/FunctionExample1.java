package Java_8_Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample1 {

	static Function<List<Student>,Map<String,Double>> list = (students -> {
		Map<String,Double> map = new HashMap<>();
		students.forEach(student -> {
			if(PredicateExample2.p.test(student))
			map.put(student.getName(), student.getGpa());
		});
		return map;
	}); 
	
	public static void main(String[] args) {
		System.out.println(list.apply(StudentDatabase.getAllStudents()));

	}

}
