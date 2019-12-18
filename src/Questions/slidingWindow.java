package Questions;

import java.util.*;
public class slidingWindow{

/*
 xyaoyz - has x y z
 zyx   - has x y z

 so shortestUniqueSubstring is zyx
     // LOOK SLIDING WINDOW APPROACH
 */

    private static String getShortestUniqueSubstring(char[] pattern, String input) {

        HashMap<Character, Integer> map = new HashMap<>();
        int missing = pattern.length;
        int[] res = {0,input.length()};

        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<pattern.length; i++)
        {
            if(map1.containsKey(pattern[i]))
            {
                map1.put(pattern[i],map1.get(pattern[i])+1);
            }
            else
            {
                map1.put(pattern[i],0);
            }

        }
        for(int i=0; i<pattern.length; i++)
        {
            map.put(pattern[i],0);
        }



        int k =0;
        for(int i=0; i< input.length(); i++)
        {
            if(map.containsKey(input.charAt(i)))
            {
                if(map.get(input.charAt(i)) <= map1.get(input.charAt(i)))
                {
                    missing -= 1;

                }
                map.put(input.charAt(i),map.get(input.charAt(i))+1);

            }
            while(missing == 0)
            {
                if((i - k) < (res[1] - res[0]))
                {
                    res[0] = k;
                    res[1] = i;
                }
                if(map.containsKey(input.charAt(k)))
                {
                    map.put(input.charAt(k),map.get(input.charAt(k))-1);
                    if(map.get(input.charAt(k)) <= map1.get(input.charAt(k)))
                    {

                        missing += 1;
                    }
                }
                k++;
            }

        }

        return input.substring(res[0],res[1]+1);
    }

    public static void main(String[] args) {
        System.err.println("Result : " + getShortestUniqueSubstring( new char[]{'x','y','z'},"xyaoyzyzyx"));
        System.err.println("Result : " + getShortestUniqueSubstring( new char[]{'x','y','z','y'},"xyaoyzyzyx"));
    }

}