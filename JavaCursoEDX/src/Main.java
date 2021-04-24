/**
 * Main class of the Java program.
 */
public class Main 
{
	static double[] divisions(int number, int[] array) {
		int n = number;
		double [] arrayResults = new double[array.length];
		for (int k = 0; k < array.length; k++) 
		{
			//Print de prueba
			System.out.print((array[k]==0) + " in loop: " + n + " | ");
			if(array[k]==0){
				System.out.println("No se divide entre 0\n"); 
				arrayResults[k]=0;
			}
			else
				arrayResults[k] = number/array[k];
			System.out.println("val K= " + k + " val Arr: " + array[k]);
		}
		return arrayResults;	
	}

	public static void main(String[] args) 
	{
		System.out.println(" ");
		int [] arr = {5, 12, 0 , 1};
		//Test values: 154, 10, 15, 6
		double[] arrResult= divisions(154, arr);
		for (int i=0; i< arrResult.length;i++){
			System.out.println("Array[" + i +"] = "+ arrResult[i]);
		}
		System.out.print("\n");
	}	
}
