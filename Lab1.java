import java.math.*;
public class Lab1{
	public static void main(String[] args){
		System.out.println("Welcome to the Lab 1 Java File");
		double logZero = Math.log(0.0);
		System.out.println(logZero);
		int varOne = 2000000000;
		int varTwo = 2000000000;
		int varThree = varOne + varTwo;
		System.out.println(varThree);
		BigInteger x = BigInteger.valueOf(2000000000);
		BigInteger y = BigInteger.valueOf(2000000000);
		System.out.println(x.add(y));
		
	}
}