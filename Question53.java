import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question53 {
    public static int maxSubArray(int[] nums) {
        int maxSum = 0, thisSum = 0;
        for (int j = 0; j < nums.length; j++)
        {

            thisSum += nums[j];
            if (thisSum > maxSum)
                maxSum = thisSum;
            else if (thisSum < 0)
                thisSum = 0;

        }
        if(maxSum<=0){
            int mymax = Arrays.stream(nums).max().getAsInt();   //快速get数组minormax，stream处理
            return mymax;
        }
        return maxSum;
    }
    public static void main(String[] arg){
        int[] input = {1,2,3,4,5};
        int ans;
        ans = maxSubArray(input);
        System.out.println(ans);
    }
}
