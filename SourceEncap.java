package com.cg.day3;

public class SourceEncap extends PersonEncap{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonEncap obj=new PersonEncap();
		obj.setName("John");
		obj.setAge(20);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
