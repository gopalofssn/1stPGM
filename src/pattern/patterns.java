package pattern;

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num of rows :");
        int a = s.nextInt();
        for(int i=0; i<a; i++)
        {


            System.out.println("");
        }
        for(int j=a; j>1; j--)
        {


            System.out.println("");
        }


    }
    public static void printime(int x)
    {
        if(x>=0)
        {
            System.out.print("*");
            printime(x-1);

        }

    }
    public static void prinSpace(int x)
    {
        if(x>1)
        {
            System.out.print(" ");
            prinSpace(x-1);
        }

    }
}
