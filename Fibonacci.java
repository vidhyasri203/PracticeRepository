package com.cg.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int num1=0,num2=1,fibo;
		System.out.println(num1+"\n"+num2);
		for(int i=2;i<n;i++) {
			fibo=num1+num2;
			System.out.println(fibo);
			num1=num2;
			num2=fibo;
		}
	}

}
