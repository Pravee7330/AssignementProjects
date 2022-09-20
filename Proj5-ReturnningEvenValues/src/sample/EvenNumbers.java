package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenNumbers {

	public static void main(String[] args) {
	try (Scanner scn = new Scanner(System.in)) {
		System.out.println("Enter the number of Elements you want to store  " );
		int size=scn.nextInt();
		
		int arr[] = new int[size];
		int i=0;
		
		System.out.println("Enter Elements of the Array " );
		
		   for(i=0; i<size; i++) {
			   arr[i]=scn.nextInt();
			   
		   }
		   
		   System.out.println("Even numbers in Array are :: ");
		   System.out.print(Arrays.toString(arr)+" -> [ ");
		      for(i=0; i<size; i++) {
		    	    if((arr[i] % 2)==0) {
		    	    	 
		    	     
		    	        System.out.print((arr[i]) +"  ");
		    	    
		    	    }
		      }System.out.println("]");
	}
	}
	
	}


