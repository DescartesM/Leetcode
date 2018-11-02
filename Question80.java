import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 要求扫描一遍的方法大多可以采用双指针解决
 */
public class Question80 {
    public static int removeDuplicates(int[] nums) {
        int i = 1, k = 1;
        int count = 1;

        if (nums.length <= 2)
            return nums.length;

        for(; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                if(count < 2){
                    nums[k++] = nums[i];
                    count++;
                }
            }
            else {
                count = 1;
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList<>();
        int ans =0;
        int[] input ={1,1,1,1,2,3};
        ans = removeDuplicates(input);
        System.out.println();
    }
}
