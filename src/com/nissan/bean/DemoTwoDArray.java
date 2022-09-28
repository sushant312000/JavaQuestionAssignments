package com.nissan.bean;

public class DemoTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArrGrids = new  int[4][5];
		int numRows = intArrGrids.length;
		int numCols = intArrGrids[0].length;
		
		for(int row = 0; row < numRows; row++) {
			for(int col = 0; col < numCols; col++) {
				System.out.printf("%3d",intArrGrids[row][col] = row*numCols + col+1);
			}
		}
	}

}
