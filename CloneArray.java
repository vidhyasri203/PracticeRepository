package com.cg.day2;

import java.util.ArrayList;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Orginal arraylist : "+c1);
		ArrayList<String> newc1=(ArrayList<String>)c1.clone();
		System.out.println("Cloned arraylist : "+newc1);
		
	}

}
