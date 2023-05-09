package com.cg.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The one is not two";
		char ch;
		String nstr=" ";
		System.out.println("String "+ str);
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reversed String :"+nstr);
	}

}
