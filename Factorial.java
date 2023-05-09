package com.cg.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println();
		int n=sc.nextInt(),factorial=1;
		for(int i=n;i>=1;i--) {
			factorial*=i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);
	}

}
