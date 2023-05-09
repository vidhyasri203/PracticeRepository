package com.cg.day4;

public class SourceUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpcastingParent obj1=(UpcastingParent)new UpcastingChild();
		UpcastingParent obj2=(UpcastingParent)new UpcastingChild();
		obj1.PrintData();
		obj2.PrintData();
	}
}
