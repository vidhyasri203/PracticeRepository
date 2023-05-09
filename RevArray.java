package com.cg.day2;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Orginal array :");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+ " ");
		}
		System.out.println("Reversed array :");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+ " ");
		}
	}

}
