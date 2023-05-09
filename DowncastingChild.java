package com.cg.day4;

public class DowncastingChild extends DowncastingParent{
	int age;
	@Override
	void showMessage() {
		System.out.println("Child class is called");
	}
}
