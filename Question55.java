import java.util.ArrayList;
import java.util.List;

/**Think in DP
 *
 *     int max = 0;
 *     for(int i=0;i<nums.length;i++){
 *         if(i>max) {return false;}
 *         max = Math.max(nums[i]+i,max);
 *     }
 */
public class Question55 {
    public static boolean canJump(int[] nums) {
        boolean[] res = new boolean[nums.length];
        res[0] = true;
        for (int i=0;i<nums.length-1;i++){
            if (res[i] == true){
                for (int j=0;j<=nums[i];j++){
                    if(i+j< nums.length)
                        res[i+j] = true;
                }
            }

        }
        return res[nums.length-1];
    }
    public static void main(String[] arg){
        int[]input =  {3,2,1,0,4};
        boolean ans = false;
        ans = canJump(input);
        System.out.println(ans);
    }
}
