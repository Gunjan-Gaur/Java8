package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class limitAndSkipExample {

	public static Optional<Integer> limit(List<Integer> li){
		return li.stream().limit(3).reduce((x,y) -> x+y);
	}
	
	public static Optional<Integer> skip(List<Integer> li){ // skip first 3 elements
		return li.stream().skip(3).reduce((x,y) -> x+y);
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4);

		if(limit(li).isPresent())
			System.out.println(limit(li).get());
		
		if(skip(li).isPresent())
			System.out.println(skip(li).get());
	}

}
