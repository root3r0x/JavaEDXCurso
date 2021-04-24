/**
 * Programa asersiones.java
 * */
import java.util.*;

public class Asersiones  {
	
	public static int factorial(int number)  {
		assert number!=0;
		if(number==1)
			return 1;
		else
			System.out.println((number!=0) + " N: " + number);
			return number * factorial(number -1);
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in); //Input data user
		System.out.print(" Ingrese el numero: ");
		int fac = factorial(inp.nextInt());
		System.out.println("\n factorial: " + fac);	
	}
}
