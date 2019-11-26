package Questions;


public class googleimage
{
    public static void main(String args[])
    {
        int[][] arr = new int[][]{{ 0,1,0,1,1 }, { 0,0,0,0,1 }, {1,1,0,0,1}};

        fun(arr);



    }

    public static void fun(int[][] a){

        exit:
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                if((a[i][j] == 0) && (a[i][j+1] == 0))
                {
                    if(fun2(i+1 , j , a) == true)
                    {

                        System.out.println(i+ " , " + j);
                        break exit;

                    }

                }
            }
        }
    }

    public static boolean fun2(int x, int y, int[][] z )
    {
        if((z[x][y] == 0 ) && (z[x][y+1] == 0))
        {
            return true;
        }
        return false;



    }

}