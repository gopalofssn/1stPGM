package series;

import java.util.*;
public class series3
{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double sum = 0;
        int sign = 1;

        for(int i=1;i<=a; i++ )
        {
            if(i%2!=0)
            {

                sum += 1.0 *(power(a,i) * sign)/factorial(i);
                sign *= -1;
                System.out.println(sum);

            }
        }
        System.out.println("sin X :"+sum);
    }
    public static int factorial(int x)
    {
        int fac =1;
        for(int i=1; i<=x; i++)
        {
            fac *= i;
        }
        return fac;
    }
    public static int power(int y, int z)
    {
        int pow =1;
        for(int i=1; i<=z; i++)
        {
            pow *= y;
        }
        return pow;
    }
}
