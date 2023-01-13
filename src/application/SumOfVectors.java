package application;

import java.util.Scanner;

public class SumOfVectors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many entries will there be each vector?");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Enter the values for the vector A:");
		for(int i=0; i<vectA.length; i++)
		{			
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Enter the values for the vector B:");
		for(int i=0; i<vectB.length; i++)
		{			
			vectB[i] = sc.nextInt();
		}
		
		int sum = 0;
		System.out.println("RESULT OF THE SUM OF VECTORS: ");
		for (int i=0; i<n; i++)
		{
			sum = vectA[i] + vectB[i];
			System.out.println(sum);
		}
		
		
		
		sc.close();
	}

}
