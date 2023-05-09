package com.cg.day1;

import java.util.Scanner;

public class Compare2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int a = in.nextInt();  
			System.out.print("Input the second number: ");
			int b = in.nextInt(); 
			if(a>b) {
				System.out.println(a +" is greater.");
			}
			else if(a<b) {
				System.out.println(b +" is greater.");
			}
			else {
				System.out.println(a+" and "+b+" are equal.");
			}
	}

}
