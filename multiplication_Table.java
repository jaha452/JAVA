package com.capgemini.demos;
import java.util.Scanner;
public class multiplication_Table 
	{
	
	
	/*user defined input.we rotate the loop unto 10 and n=number.the loop is
	start with 1.increment the value of i and continuously multiply with num*/
	
	
	
	public static void main(String[] args) 
		{
		  Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=s.nextInt();
		        for(int i=1; i <= 10; i++)
		        {
		            System.out.println(n+" * "+i+" = "+n*i);
		        }
		    }
		

}
