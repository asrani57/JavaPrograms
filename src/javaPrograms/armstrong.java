package javaPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		// A positive number is called armstrong number if it is equal to 
		//the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

		//handling armstrong number based on number of digits in number
		
		//Example 153 = (1*1*1)+(5*5*5)+(3*3*3)  
		/*
		 * where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 So: 1+125+27=153
		 * 
		 */
		//example 1634 = (1*1*1*1*1) + (6*6*6*6) + (3*3*3*3) +(4*4*4*4)
		//numbers from 0 to 9 are armstrong
		//handling invalid input from user such as decimal input, double or character input
		
		
		
		Integer sum = 0, n = 0;
		Integer temp1 = 0, temp2 = 0,ctr=0;
		Scanner input = new Scanner(System.in);  
		System.out.println("Enter a number to check if it is armstrong number");  

		try
		{
			n = input.nextInt();  

			input.close();
			temp1 = n;
			temp2 = n;

			if(n>10)
			{

				while (n>0)
				{
					ctr++;
					int r = n%10;
					n = n/10;

				}
				System.out.println("number of digits in input entered is " +ctr);

				while (temp2>0)
				{

					int r = temp2%10;
					r = (int) Math.pow(r, ctr);
					//r =r*r*r; 
					//System.out.println("temp is " + temp);
					sum = sum + r;  
					//	System.out.println("sum is " +sum);
					temp2 = temp2/10;

				}

				System.out.println("sum is " +sum);
				//System.out.println(temp1);
				// String num = sum.toString();
				if (sum.equals(temp1))  
					System.out.println(temp1 +" is armstrong.");  
				else  
					System.out.println(temp1 + " is not armstrong");   
			}
			else
			{
				System.out.println("Enter integer number greater than 10");
			}

		}
		catch(InputMismatchException e)
		{
			System.out.println("Input entered is not integer, only integer data allowed ");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}



	}
}


