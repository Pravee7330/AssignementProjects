package sample;

import java.util.Arrays;
import java.util.Scanner;

public class sumofallevennumbers {

	public static void main(String[] args) {
	 
		try (Scanner sc = new Scanner(System.in)) {
			int sum=0;
			int rows=0;
			int columns=0;

			System.out.print("Enter number of rows :: ");
			     rows=sc.nextInt();
			     
			System.out.print("Enter number of columns :: ");
			columns=sc.nextInt();

			int arr[][]= new int[rows][columns];
			
			System.out.print("Enter elements into matrix :: ");
			
			
			
			for(int i=0; i<rows; i++) {
				for(int j=0; j<columns; j++) {
					
					arr[i][j]=sc.nextInt();
					}
				}
			
			
			for(int i=0; i<rows; i++) {
				for(int j=0; j<columns; j++) {
					
					     if((arr[i][j]%2)==0) {
					    	    sum=sum+arr[i][j];
					     }
				}
			}
			
			System.out.println(Arrays.deepToString(arr)+" , ");
			
			
			System.out.println(" -> "+sum);
		}
        
        
        
	
	}

}
