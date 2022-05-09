package Java_8_Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> bf = ((students,pred)-> {
		Map<String,Double> map = new HashMap<>();
		
		students.forEach(student ->{
			if(pred.test(student)){
				map.put(student.getName(), student.getGpa());
			}
		});
		return map;
	});
	public static void main(String[] args) {
		System.out.println(bf.apply(StudentDatabase.getAllStudents(), PredicateExample2.p));

	}

}
