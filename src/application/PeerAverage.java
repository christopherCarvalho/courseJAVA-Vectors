package application;

import java.util.Scanner;

public class PeerAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("How many elements will there be in vector?");
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		for(int i=0; i<vect.length; i++)
		{
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		int sum  = 0;
		int pair = 0; 
		for(int i=0; i<vect.length;i++)
		{
			if(vect[i]%2==0)
			{
				sum+=vect[i];
				pair+=1;
			}			
		}
		if(sum != 0)
		{
			double average = (double)sum/pair;
			System.out.println("\nPAIR AVERAGE: "+average);
		}
		else
		{
			System.out.println("\nTHERE IS NO PAIR.");
		}
		
		
		sc.close();
	}

}
