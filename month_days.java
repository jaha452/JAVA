package com.capgemini.demos;

public class month_days {
	
	/*we take a input num=78 and if i divided it by 30
	then we get 'month' and the remainder is the day*/
	public static void main(String[] args) {
		
	
	int num = 78;
    int days = num%30;
    int month = num/30;
    
    System.out.println(num+" days equal to ");
    System.out.println(month+" month ");
    System.out.println(days+" days ");
}
}