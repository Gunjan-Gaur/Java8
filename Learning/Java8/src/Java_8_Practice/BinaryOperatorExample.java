package Java_8_Practice;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comp = (a,b) -> a.compareTo(b); 
	
	public static void main(String[] args) {
		BinaryOperator<Integer> bn = (a,b) -> a*b;
		System.out.println(bn.apply(3, 4));
		System.out.println("----------------------------");
		BinaryOperator<Integer> a = BinaryOperator.maxBy(comp);
		System.out.println(a.apply(4, 5));
		System.out.println("------------------------------");

		
	}

}
