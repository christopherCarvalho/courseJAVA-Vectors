package application;

import java.util.Scanner;

public class Older {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("How many entries will there be?");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for(int i=0; i<n;i++)
		{	
			System.out.printf("%dº"+" Person data:",i+1);
			System.out.print("\nName: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
		}
		
		int older = 0;
		int count = 0;
		
		for(int i=0; i<n;i++)
		{
			if(older < age[i])
			{	
				older = age[i];
				count = i;
			}
		}
		
		System.out.printf("OLDER PERSON: %s", name[count]);
		sc.close();
	}

}
