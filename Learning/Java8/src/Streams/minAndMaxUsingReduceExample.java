package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class minAndMaxUsingReduceExample {

	public static int getMaxValue(List<Integer> li){
		return li.stream().reduce(0, (x,y) -> x>y ? x : y);
	}
	
	public static Optional<Integer> getMaxValueWithOptional(List<Integer> li){
		return li.stream().reduce((x,y) -> x>y ? x : y);
	}
	
	public static Optional<Integer> getMinValueWithOptional(List<Integer> li){
		return li.stream().reduce((x,y) -> x<y ? x : y);
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4); //We can use reduce for finding Max also but if List is 
												   //empty then it will set give 0 default value which is not correct
		List<Integer> li2 = new ArrayList<>();
		System.out.println(getMaxValue(li));
		
		if(getMaxValueWithOptional(li2).isPresent())
			System.out.println(getMaxValueWithOptional(li2).get());
		else
			System.out.println("NO MAX VALUE");
		
		if(getMinValueWithOptional(li).isPresent())
			System.out.println("MIN - "+getMinValueWithOptional(li).get());
	}

}
