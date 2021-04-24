public class FactorialDos{
	
	  public static int factorial (int number) throws Exception {
		int factorial = 1;
		while(number>0){
			factorial=factorial*number;
			number--;
		}
		return factorial;
	}

	public static void main(String[] args){

		try{
				
				int valor = factorial(5);
				
				System.out.println("---------------------------");
				System.out.println("\n Factorial: " + valor + "\n");
				System.out.println("---------------------------");
		}catch(Exception ex){
			System.out.println("\n " + ex.toString());
		}
	}
}
