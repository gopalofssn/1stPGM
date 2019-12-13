package Questions;

import java.util.*;
public class MainTopNFinder{
    /*
     input :
        toy : "ana","bella","crica"
        comments : "ana toy is better","bella is great than ana","best toy ana toy","crica is ok","bella good";
        top : <number of arraylist content>
     output:
       top = 1 , return ana ( because it comes 3 times in the comments )
       top = 2 , return ana and bella
    */
    public static void main(String[] args) {
        List<String> toys = new ArrayList<String>(Arrays.asList("ana","bella","crica"));
        List<String> comments = new ArrayList<String>(Arrays.asList("ana toy is better","bella is great than ana","best toy ana toy","crica is ok","bella good"));
        System.err.println(topNFinder(toys,comments,2));

    }

    private static List<String> topNFinder(List<String> toys, List<String> comments,int top) {

        int[] count = new int[toys.size()];

        List<String> res = new ArrayList<String>();

        for(int i=0; i< toys.size(); i++)
        {
            for(int j=0; j<comments.size(); j++)
            {


                if((comments.get(j)).contains(toys.get(i)))
                {
                    count[i]++;
                }
            }

        }

        int start = 1;

        while(top >= start)
        {

            res.add(toys.get(findNthLargest(count, start)));
            start++;
        }

        return res;
    }



    public static int findNthLargest(int[] nums, int k) {

        int[] copy = nums.clone();
        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == copy[copy.length-k])
                return i;
        return -1;
    }

}