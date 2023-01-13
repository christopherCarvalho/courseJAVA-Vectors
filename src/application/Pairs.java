package application;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will there be?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++)
		{
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		int pairs = 0;
		System.out.println("\nPAIR NUMBERS: ");
		
		for(int i=0; i<vect.length; i++)
		{
			if(vect[i]%2 == 0)
			{
				System.out.printf("%d ",vect[i]);
				pairs += 1;
			}
		}
		
		System.out.println("\n\nNUMBER OF PAIRS: "+pairs);
		
		sc.close();
	}

}
