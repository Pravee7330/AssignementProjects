package sample;

import java.util.ArrayList;
import java.util.Scanner;
public class IncreasingDecreasingString{
	
     public static String sortString(String s) {
	  
        ArrayList<Integer> frq = new ArrayList<Integer>();
       try {
             for(int i=0;i<26;i++)
                       frq.add(0);
             for(int i=0;i<s.length();i++)
                       frq.set(s.charAt(i)-'a', frq.get(s.charAt(i)-'a')+1);
       }catch( Exception e) {
    	   System.out.println(" Please dont enter Uppercase && special  characters  in the String   ");
       }

        int par = 0;
        
        StringBuilder ans = new StringBuilder();
       
        boolean can = false;
        do{
            can = false;
            StringBuilder ss = new StringBuilder();
          
            for(int i=0;i<26;i++)
                 if(frq.get(i)>0){
                      ss.append((char)(i+'a'));
                        frq.set(i, frq.get(i)-1);
                    can |= (frq.get(i) > 0);
                }
            if(par == 1)
                ss.reverse();
            par ^= 1;
            ans.append(ss);
        } while(can == true);
        return ans.toString();
    }
    
  public static void main (String[] args) throws java.lang.Exception  {
	 
	  try (Scanner scn = new Scanner(System.in)) {
		System.out.println("Enter the String :: ");
		  String str=scn.next();
         
           
		  if(str.length()>=50 ) {
		  
			  System.out.println(" invalid String Enter String with below 50 characters ");
		  
		  }else 
			  System.out.print(sortString(str));
	}
  }
}
