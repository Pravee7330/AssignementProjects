import java.util.Arrays;
import java.util.Scanner;

public class CountOccurance {
	
    public static void main(String[] args) {

    int m, n, i, j;   
    int count = 0;
    
         Scanner sc=new Scanner(System.in);   
                
         System.out.print("Enter the number of rows: ");   
         //taking row as input  
        m = sc.nextInt();   
        
           System.out.print("Enter the number of columns: ");   
           //taking column as input  
          n = sc.nextInt();   

          // Declaring the two-dimensional matrix   
          int array[][] = new int[m][n];   
         
          // Read the matrix values   
          System.out.println("Enter the elements of the array: ");   
        
              for (i = 0; i < m; i++)   //loop for row
                    
                    for (j = 0; j < n; j++)   //loop for column
                           array[i][j] = sc.nextInt();  
 
                          	for(int[] sarr : array)  { 
	                                for(int val : sarr) {
	                                	int num=1;
	                                	    if(val == num)
	                                         	count++; 
	                                } 
	                        } 
                          	System.out.print(Arrays.deepToString(array)+" -> "+count);
            }//main
}//class
