package com.cg.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int flag = 0,i=2;
			while (i<=n/2) {
				if (n%i== 0) {
			        flag = 1;
			    	break;
				}
			    i += 1;
			}
			if (n == 1)
			    System.out.println("1 is neither prime nor composite");
			else if (flag == 0)
				System.out.println(n+" is a prime number.");
			else if (flag == 1)
				System.out.println(n+" is not a prime number.");
	}

}
