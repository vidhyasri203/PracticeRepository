package com.cg.day1;

import java.util.Scanner;

public class FindLargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.print("Input the third number: ");
		int c = in.nextInt(); 
		if(a>b&&a>c) {
			System.out.println(a +" is greater.");
		}
		else if(b>a&&b>c) {
			System.out.println(b +" is greater.");
		}
		else if(c>a&&c>b) {
			System.out.println(c +" is greater.");
		}
		else {
			System.out.println("all are equal.");
		}
	}

}
