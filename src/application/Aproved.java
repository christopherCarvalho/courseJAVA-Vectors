package application;

import java.util.Locale;
import java.util.Scanner;

public class Aproved {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students's will be entered?");
		int n = sc.nextInt();
		String[] name 	= new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.printf("Enter the %dº student's name, first and second grade: ",i+1);
			sc.nextLine();
			System.out.println();
			name[i]   = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}
		
		System.out.println("Aproved students: ");
		
		double average = 0;		
		for(int i=0; i<n; i++)
		{
			average = (grade1[i] + grade2[i])/2.0;
			if(average >= 6.0)
			{
				System.out.println(name[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}

}
