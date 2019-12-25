package com.self.gs.digits;
import java.util.*;
/*
 Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 
 Given array nums = [-1, 0, 1, 2, -1, -4 , 2],

A solution set is:
[
  [-4, 2, 2],
  [-1, 0, 1],
  [-1, -1, 2]
]

 */
public class ThreeSum {

	/*
    sort the array first
    
	    -4 -1 -1 0 1 2  2
	    
	    -4           2  2
	       -1  -1    2
	       -1  -1       2    but duplicate , dont include
	           -1 0 1
	              0          above , no need to go further , because in sorted array , you can get result after 0
	                
	    o/p
	        -4  2 2
	        -1 -1 2
	        -1  0 1 
	 */
	private static List<List<Integer>> find(int[] nums) {
		 
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		 // Arrays.sort(nums); -- ?
		 
		
		return result;
	}


	public static void main(String[] args) {
		  System.err.println(find(new int[] {-1, 0, 1, 2, -1, -4}));
		  System.err.println(find(new int[] {0,0,0,0}));

	}	

}
