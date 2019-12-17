package Questions;

public class removeDup{

    // dup allowded once
    private static int remove(int[] nums) {

        int temp1 =nums[0], temp=nums[1];
        if(nums==null || nums.length ==0)
            return 0;
        int k =2;
        for(int i=2; i< nums.length; i++)
        {
            if(temp1 != nums[i])
            {
                nums[k] = nums[i];
                k++;
            }
            temp1 = temp;
            temp = nums[i];
        }

        return k;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,1,1,2,2,3};//{0,0,1,1,1,1,2,3,3};//
        int k = remove(a);
        for(int i=0;i<k;i++)
            System.err.print(a[i]+", ");

    }

}
