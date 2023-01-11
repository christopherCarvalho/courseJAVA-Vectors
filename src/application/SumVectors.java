package application;

import java.util.Locale;
import java.util.Scanner;

public class SumVectors {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many entries will there be?");
		int n =sc.nextInt();
		double[] vect = new double[n];
		
		System.out.println();
		for(int i=0; i<vect.length; i++)
		{
			System.out.print("Enter a decimal number: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int j=0; j<vect.length; j++)
		{
			sum += vect[j];
		}
		
		System.out.print("\nVALUES: ");
		for(int k=0; k<vect.length; k++)
		{
			System.out.printf("%.2f  ",vect[k]);
		}
		
		double average = sum/n;
		System.out.println();
		System.out.printf("SUM: %.2f%n",sum);
		System.out.printf("AVERAGE: %.2f%n",average);
		
		sc.close();
	}

}
