package com.capgemini.demos;


public class primenumber {
	/*Inside the for loop, we check if the number is divisible by any number 
	 * in the given range (2...num/2).If num is divisible, flag is set to
	 *  true(1) and we break out of the loop. This determines num is not a prime number.
      If num isn't divisible by any number, flag is false(0) and num is a prime number.*/
	

	public static void main(String[] args) {
		int num = 13;
	    int flag = 0;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = 1;
	        break;
	      }
	    }

	    if (flag!=1)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	    }
	}
