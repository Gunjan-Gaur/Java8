package Java_8_Practice;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	//Used when input nad output are of the same type
	static UnaryOperator<String> un = unary -> unary.concat(" Gaur");
	public static void main(String[] args) {
		System.out.println(un.apply("Gunjan"));
	}

}
