package com.cg.day4;

public class SourcePrinter implements PrintInterface {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		SourcePrinter obj=new SourcePrinter();
		obj.print();
	}
}
