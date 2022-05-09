package Java_8_Practice;

import java.util.function.Predicate;

public class PredicateExample1 {

	static Predicate<Integer> p = num -> num % 2 == 0;
	static Predicate<Integer> p2 = num -> num % 5 == 0;
	
	public static void demoOfAnd(){
		System.out.println(p.and(p2).test(10));
		System.out.println(p.and(p2).test(8));
	}
	
	public static void demoOfOr(){
		System.out.println(p.or(p2).test(10));
		System.out.println(p.or(p2).test(8));
	}
	
	public static void demoOfNegate(){
		System.out.println(p.or(p2).negate().test(8));
	}
	
	public static void main(String[] args) {
		System.out.println(p.test(4));
		demoOfAnd();
		demoOfOr();
		demoOfNegate();
	}

}
