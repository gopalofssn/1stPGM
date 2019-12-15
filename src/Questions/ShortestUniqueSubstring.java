/*
 Given an array of unique characters arr and a string str, Implement a function getShortestUniqueSubstring that finds the smallest substring of str containing all the characters in arr. Return "" (empty string) if such a substring doesn’t exist.

Come up with an asymptotically optimal solution and analyze the time and space complexities.

Example:

input:  pattern = ['x','y','z'], str = "xyyzyzyx"

output: "znyx"
 */
public class ShortestUniqueSubstring {
	
/*
 xyaoyz - has x y z
 zyx   - has x y z
 
 so shortestUniqueSubstring is zyx
     // LOOK SLIDING WINDOW APPROACH
 */
 
  private static String getShortestUniqueSubstring(char[] pattern, String input) {
// TODO
}

public static void main(String[] args) {
		   System.err.println("Result : " + getShortestUniqueSubstring( new char[]{'x','y','z'},"xyaoyzyzyx"));
		   System.err.println("Result : " + getShortestUniqueSubstring( new char[]{'x','y','z','y'},"xyaoyzyzyx"));
	}
  
  }
