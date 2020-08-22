package javaPrograms;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
	
		
		//checks whether a number or string or combination of both is a palindrome or not
		//Example : 12321, ABCBA, 12ABBA21, ABC22CBA - are all palindrome
		//Example : 1231, ABCA, 1221ABBA, ABBA1221 - are not palindrome
		
		 String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);  
	      
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      in.close();
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	      {
	    	  reverse = reverse + original.charAt(i);  
	      }
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  
	
	}


