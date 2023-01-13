package application;

import java.util.Locale;
import java.util.Scanner;

public class PersonalData {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("How many person will be inserted?");
		int n = sc.nextInt();
		double[] height = new double[n];
		char[] 	 gender = new char[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.printf("Height %dº person: ",i+1);
			height[i] = sc.nextDouble();
			System.out.printf("Gender %dº person: ",i+1);
			gender[i] = sc.next().charAt(0);
		}
		
		double higher = 0;
		double lower  = height[1];
		double sum = 0;
		int woman = 0;
		int man = 0;
		
		for(int i=0; i<n; i++)
		{
			if(height[i] > higher)
			{
				higher = height[i];
			}
			
			if(height[i] < lower)
			{
				lower = height[i];
			}
			
			if(gender[i] == 'F' || gender[i] == 'f')
			{
				woman += 1;
				sum += height[i];
			}
			else
			{
				man += 1;
			}
		}
		double average = sum/woman;
		
		System.out.printf("Lower: %.2f\n",lower);
		System.out.printf("Higher: %.2f\n", higher);
		System.out.printf("Average height of womans: %.2f\n",average);
		System.out.printf("Number of mans: %d\n", man);
		
		sc.close();
	}

}
