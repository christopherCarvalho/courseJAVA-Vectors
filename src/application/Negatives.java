package application;

import java.util.Scanner;

public class Negatives {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many entries will be?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++)
		{
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NEGATIVE NUMBERS: ");
		
		for(int j=0; j<vect.length; j++)
		{
			if(vect[j]<0)
			{
				System.out.println(vect[j]);
			}
		}
		
		
		
		sc.close();
	}

}
