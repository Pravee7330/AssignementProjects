package sample;

import java.util.Arrays;
import java.util.Scanner;

// Java program to check if there exists a pair
//in array whose sum results in x.
public class Test{

// Function to find and print pair
      public static boolean chkPair(int A[], int size, int x) {
    	  
   for (int i = 0; i < (size - 1); i++) {
       for (int j = (i + 1); j < size; j++) {
                      if (A[i] + A[j] == x) {

        	             System.out.print("( "+Arrays.toString(A)+", "+x+" ] -> ");
                     return true;
                    }
                  }
               }
                     System.out.print("( "+Arrays.toString(A)+", "+x+" ] -> ");
           return false;
       }

      public static void main(String [] args) {
                       int Size = 0, i;
  
	              try (Scanner scn = new Scanner(System.in)) {
				System.out.println("Please Enter Number of Elements in an array :: ");
				  Size=scn.nextInt();


				  int A[] = new int[Size];
				  System.out.print("Please Enter "+Size+ " elements of an Array :: ");
				  for(i=0; i<Size; i++) {
				        
					  A[i]=scn.nextInt();
				  
				  }
				                               System.out.print("Enter a number to get sum :: ");
				                               int x = scn.nextInt();
 
				                               int size = A.length;

				                    if (chkPair(A, size, x)) {
				                               System.out.println("true");
				                    }
				                      else {
				                             System.out.println("false");
				                   }
			}
                 }
         }

