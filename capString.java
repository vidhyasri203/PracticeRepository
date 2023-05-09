package com.cg.eval;

import java.util.Scanner;

public class capString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.next();
		String newStr=null;
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);  
			if(ch[i]==' ') {
				i++;
				ch[i]=Character.toUpperCase(ch[i]);
				
			}
			newStr+=' '+ch[i];
		}
		System.out.println(newStr);
	}

}
