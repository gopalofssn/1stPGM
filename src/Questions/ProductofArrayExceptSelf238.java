public class ProductofArrayExceptSelf238 {

	/*
	 Input:  [1,2,3,4]
     output: [24,12,8,6]  , 24 means multiply of 2**3*4 , except 1
     Note: Please solve it without division and in Time O(n) . O(n) - you should visit element only once
	 */
   public static int[] productExceptSelf(int[] nums) {
       if(nums==null || nums.length == 0)
    	   throw new IllegalArgumentException("Input array is either null or empty !!");
	   int[] result  = new int[nums.length];
       //@TODO - implement
	   return result;
    }

	public static void main(String[] args) {
	   System.err.println(productExceptSelf(null));
	   System.err.println(productExceptSelf(new int[] {}));
     System.err.println(productExceptSelf(new int[] {1,2,3,4}));
	}

}
