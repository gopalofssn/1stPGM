package com.self.gs.digits;

import java.util.Arrays;

/*
  SparseMatrix means  majority of elements are 0, only  few valid elements
  consider 100X100 matrix can hold 10000 elements , but only 8 elements present and remainings are 0
  
  https://en.m.wikipedia.org/wiki/Sparse_matrix
  
 */
public class SparseMatrixMultiplication {

	/*
	 (2X3)*(3X3) = (2X3)
	  -       -
	 */
	private static int[][] multiplay(int[][] a, int[][] b) {
		 
		int[][] result = new int[a.length][b[0].length];
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[][] {
			{1,0,0},
			{-1,0,3}
		};
		
		int[][] b = new int[][] {
			{7,0,0},
			{0,0,0},
			{0,0,1}
		};
		
		System.out.println(Arrays.deepToString( multiplay(a,b)));
	}

}
