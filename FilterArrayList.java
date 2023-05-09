package com.cg.day4;

import java.util.ArrayList;

public class FilterArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Mango");
		System.out.println("ArrayList : ");
		fruits.forEach((e)-> {
			System.out.println(e+",");
		});
	}
}
