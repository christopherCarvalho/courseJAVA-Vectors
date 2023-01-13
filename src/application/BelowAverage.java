package application;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many entries will there be?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++)
		{
			System.out.print("Enter value: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i=0; i<vect.length; i++)
		{
			sum+= vect[i];			
		}
		
		double average = sum/n;
		System.out.printf("\nVECTOR AVERAGE: %.3f", average);
		
		System.out.println("\nVALUES BELOW AVERAGE: ");
		for(int i=0; i<vect.length;i++)
		{
			if(vect[i] < average)
			{	
				System.out.println(vect[i]);
			}
			
		}
		
		
		
		sc.close();
	}

}
