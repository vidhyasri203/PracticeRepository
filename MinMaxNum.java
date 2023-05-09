package com.cg.day2;

import java.util.Arrays;

public class MinMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{17, 28, 9, 4, 22, 7, 1, 3, 19, 42, 58, 47};
		Arrays.sort(array);
		System.out.println("Minimum value: " + array[0]);
		System.out.println("Maximum value: " + array[array.length - 1]);

	}

}
