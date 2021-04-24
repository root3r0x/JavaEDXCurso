public class Factorial {

	public static int factorial(int number) throws Exception {
		if(number==0 || number>9)
			return 1;
		else
			return number * factorial(number-1);
	}
	public static void main(String[] args){
		System.out.println("\n ------------ ");
		try{
			int fac = factorial(5);
			System.out.print(" Factorial: " + fac + " \n");
		}
		catch(Exception ex) {
			System.out.println("\n " + ex.toString());
		}
		System.out.print(" ----------- \n");
	}
}
