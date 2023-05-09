package com.cg.day2;

public class MultiDimenAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=2,columns=4;
		int [][] MatrixA= {{1,2,3,4},{5,6,7,8}};
		int [][] MatrixB= {{4,3,2,1},{8,7,6,5}};
		int[][] sum=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum[i][j]=MatrixA[i][j]+MatrixB[i][j];
			}
		}
		System.out.println("Sum of matrices : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
