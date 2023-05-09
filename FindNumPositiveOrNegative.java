package com.cg.day1;

import java.util.Scanner;

public class FindNumPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if(num<0) {
        	System.out.println(num+" is negative.");
        }
        else if(num>0) {
        	System.out.println(num+" is positive.");
        }
        else {
        	System.out.println(num+" is zero.");
        }
	}

}
