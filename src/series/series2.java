package series;
import java.util.*;
public class series2
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double x=0, y=0, z=0;
        System.out.println("Enter Range :");
        int a = s.nextInt();

        for(int i=1; i<=a; i++)
        {
            if(i%2==0)
            {
                x += 1.0/i;
            }
            else
            {
                y += 1.0/i;
            }
        }
        z = y - x;
        System.out.println("Sum is :"+z);
    }
}