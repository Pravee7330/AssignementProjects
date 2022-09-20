package sample;

import java.util.Scanner;

public class FindAndReplace {    
	   
	public static void main(String[] args) {
			
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the words  ::");
			 String str =scn.nextLine();
			 String a[] =str.split(" ");
			 
			 System.out.print("Pattern  : ");
			 String str2 =scn.next();

			 int n=a.length;
			 int found=0;
			 
			 System.out.print(" [ ");
			 for(int i=0; i<n; i++) {
			        if(pat(a[i])==pat(str2) ){
			        	System.out.print((a[i])+" , ");
			        	
			        	 found=1;
			        }
			 }
			 System.out.println("]");
			 
			 if(found==0) {
				 System.out.println(" ");
			 }
		}
	}
		public static int pat(String s) {
			  String p="";
			  char ch[]= s.toCharArray();
			  
			  for(int i=0; i<s.length(); i++) {
                           int c=1;
				  for(int j=i+1; j<s.length();j++) {
					   if(ch[i]==ch[j] && ch[i]!='*') {
						   c++;
						   ch[j] ='*';
					   }		   
				  }
                       if(ch[i]!='*') {
                    	   p=p+c;
                       }				  
			  }
			  return Integer.parseInt(p);
		  }
}	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	