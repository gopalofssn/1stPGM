package Questions;

import java.util.*;
public class FacebookQues{
    /*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    Example:
    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Note:
                     _____________________________________________
    You must do this |in-place without making a copy of the array.|
                     ---------------------------------------------
    Minimize the total number of operations.
    */
    public static void move(int[] nums) {
        int k =0, count =0;
        for(int i =0; i< nums.length; i++)
        {
            if(nums[i]!=0)
            {
                nums[k] = nums[i];
                k++;
            }
            else
            {
                count++;
            }
        }
        int last = nums.length - 1;
        for( int j = count; j > 0; j--)
        {
            nums[last] = 0;
            last--;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[] {0,1,0,3,12};
        move(a);
        System.err.println(Arrays.toString(a));
    }

}