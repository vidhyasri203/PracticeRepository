package com.cg.day1;

import java.util.Scanner;

public class AddTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int sum=0,i=1;
		do {
			sum+=i;
			i++;
		}
		while(i<=n);
		System.out.println("Sum is "+ sum);
	}

}
