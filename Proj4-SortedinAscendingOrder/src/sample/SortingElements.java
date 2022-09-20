package sample;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElements {

	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number of Elements you want to give as input ::  " );
			int size=scn.nextInt();
			
			int arr[] = new int[size];
			int i=0;
			int j=0;
			int temp=0;
			System.out.println("Enter Elements of the Array ::  " );
			
			   for(i=0; i<size; i++) {
				   arr[i]=scn.nextInt();		   
			   }
			   
			   for( i=0; i<size; i++) {
				    for(j=i+1; j<size;j++) {
				    	 if(arr[i]>arr[j]) {
				    		 temp=arr[i];
				    		 arr[i]=arr[j];
				    		 arr[j]=temp;
				    	 }
				    }
			   }

			   System.out.print(Arrays.toString(arr)+" -> [ ");
			
			        for(i=0; i<size;i++) {
			        	System.out.print(arr[i]+" ");
			        }
		}
		
		System.out.println("]");

	}

}
