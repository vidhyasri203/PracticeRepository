package com.cg.day2;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,4,6,2};
		int temp=0;
		System.out.println("Original array :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted in ascending order : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
	}

}
