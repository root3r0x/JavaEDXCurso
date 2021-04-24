import java.util.*;

class arrays 
{
	static int[] divisions(int number, int[] array)
	{
		int[] arrayResults = new int[array.length];
		//bucle for
		for(int k=0;k< array.length; k++)
		{
			arrayResults[k] = number/array[k]; //Division
			
			System.out.println("\n arrayResults:" + 
					" " + arrayResults[k]);
		}
		return arrayResults;
	}
	public static void main(String[] args)
	{
		int[] arr = {5,12,0,1};
		System.out.println("\nValores del array ");
		try  {
			int[] Array = divisions(154,arr);

			for(int x=0; x<Array.length; x++){
				System.out.println(" \n Valor " + x + ": " + Array[x]);
			}
		}catch(Exception ex) {
			System.out.print("\n #--> " + ex.toString() + " \n ");
		}
	}
}
