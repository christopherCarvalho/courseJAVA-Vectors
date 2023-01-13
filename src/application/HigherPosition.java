package application;
import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many entries will there be?");
		int n =sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++)
		{
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		double num = 0;
		int position = 0;
		
		for(int i=0; i<vect.length; i++)
		{			
			if(num < vect[i])
			{
				num = vect[i];
				position += 1;
			}
		}
		
		System.out.println("\nHIGHER NUMBER: "+num);
		System.out.println("POSITION OF LARGEST NUMBER: "+position);
		
		sc.close();
	}

}
