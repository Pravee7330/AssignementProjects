package sample;

import java.util.Scanner;

public class IncreasingDecreasingString {

	
	public static String sortingString(String s) {
		StringBuilder sb= new StringBuilder();
		int count =s.length();
		
		int[] frequency=new int[26];
		  
		 for(int i=0; i<count; i++){
			 frequency[s.charAt(i) - 'a']++;
			 
		 }
		 while(count>0) {
			 for(int i=0; i<frequency.length;i++) {
				  if(frequency[i] !=0) {
					  sb.append((char)(i+97));
					     frequency[i]--;
					     count--;
					  
				  }
			 }
				  for(int i=frequency.length-1;i>=0;i--) {
					  if(frequency[i] !=0) {
						  sb.append((char)(i+97));
						  frequency[i]--;
						  count--;
						  
					  }//if
			 }	 //for
		 }//while
		return sb.toString();
	}//method
	
	
	
	public static void main(String[] args) {
	    Scanner scn= new Scanner(System.in);
	    System.out.println("Enter a String  :: " );
		String  str =scn.nextLine();
		
	//	IncreasingDecreasingString ids= new IncreasingDecreasingString();
		
		sortingString(str);
		
	}
	
	
	
	
	
	
	
	
	
}//class
