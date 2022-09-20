package sample;

import java.util.Arrays;
import java.util.Scanner;

public class test {

  private static Scanner sc;
  

	public static void main(String[] args) {
	      int Size, i;
	      
	      int postiveCount=0;
	      int negativeSum=0;
	      
	      sc=new Scanner(System.in);
	      
	      System.out.println("Please Enter Number of Elements in an array :: ");
	      Size=sc.nextInt();
	      
	      int a[]= new int[Size];
	      
	      System.out.print("Please Enter "+Size+ " elements of an Array :: ");
	      for(i=0; i<Size; i++) {
	            
	    	  a[i]=sc.nextInt();
	      
	      }
	      
	        for(i=0;i<Size; i++) {
	        	if(a[i]>=0) {
	        		postiveCount++;
	        	}
	        	else if(a[i]<=0) {
	        		negativeSum +=a[i];
	        	}
	        }
	      
	        System.out.print(Arrays.toString(a));
	      System.out.println(" -> ["+postiveCount +" ,"+negativeSum+"]");
	     
	      
	      
		
	}

}
