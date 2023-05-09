package com.cg.eval;

public class AddNum{
	public static void main(String args){
		NumAdd addition=(int a,int b)->(a+b);
		System.out.println(addition.add(7, 8));
	}
}
