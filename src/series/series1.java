package series;

import java.util.*;

public class series1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        double  x=0;
        System.out.println("Enter lenth :");
        int a = s.nextInt();

        for(int i=1; i<=a;i++)
        {
            x += 1.0/i;


        }
        System.out.println("Sum of value :"+x);


    }
}