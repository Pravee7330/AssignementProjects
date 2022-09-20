package sample;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
	
		
		try (Scanner scn = new Scanner(System.in)) {
			int num=0;
			System.out.println(" Enter a Number ::  ");
			
			num=scn.nextInt();
			int i, count=0 ;
			
			System.out.print(" ( "+num+" ) -> [ ");
			
			for( i=1;i<=num ;i++ ) {
			          	if(num % i == 0){
				            count = count + 1;
				      
				 			
				             System.out.print( i+",");
				      }
				}
				System.out.println(" ]");
		}

		}//method

	}//class


