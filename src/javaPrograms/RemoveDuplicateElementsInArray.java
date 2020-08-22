package javaPrograms;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElementsInArray {

public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        
        
        
		/*
		 * for (int k = 0; k<n;k++) { System.out.println(arr[k]);
		 * 
		 * }
		 */
      //  System.out.println("\n");
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50, 10, 80, 50, 30}; 
       
       Arrays.sort(arr);
       
        int length = arr.length;  
        length = removeDuplicateElements(arr, length); 
       
		/*
		 * for (int m=0; m<arr.length; m++) System.out.print(arr[m]+" ");
		 * System.out.println("\n");
		 * 
		 */
		/*
		 * for (int j=0; j<arr.length; j++) System.out.print(arr[j]+" ");
		 * System.out.println("\n");
		 */  //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
} 

