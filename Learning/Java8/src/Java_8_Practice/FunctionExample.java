package Java_8_Practice;

import java.util.function.Function;

public class FunctionExample {

	static Function<String,String> fun = (name) -> name.toUpperCase();
	
	static Function<String,String> fun2 = (name) ->name.concat("gaur").toLowerCase();
	
	public static void main(String[] args){
		System.out.println("Fun = "+fun.apply("gunjan"));
		
		System.out.println("Fun2 = "+fun.andThen(fun2).apply("test"));
		
		System.out.println("Fun3 = "+fun.compose(fun2).apply("test"));
	}
}
