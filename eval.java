package com.cg.day2;

import java.util.Scanner;

public class eval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[10];
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Array size : ");
		n=sc.nextInt();
		System.out.println("Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
