package com.cg.day1;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a num : ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
