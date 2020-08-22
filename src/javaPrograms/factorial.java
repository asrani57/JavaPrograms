package javaPrograms;

import java.util.Scanner;

public class factorial {
	
	//Factorial of N is "N* (N-1) * (N-2) * .... * 3*2*1"
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		int n = sc.nextInt();
		sc.close();
		int fact = 1;
		
	    for(int i = 1; i<=n; i++)
		{
			fact = fact*i; 
		}
		
	    System.out.println("Factorial of " + n + " is " + fact);
			
	}

}
