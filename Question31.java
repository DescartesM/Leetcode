/**
 * mplement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place and use only constant extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */

/** Tips: next permuation based on the ascending order sort
 * sketch :
 * current: 3   7  6  2  5  4  3  1  .
 *                    |  |     |     |
 *          find i----+  j     k     +----end
 *          从后向前查找第一个相邻元素对(i,j)，并且满足A[i] < A[j]。
 *          在[j,end)中从后向前寻找一个最小的k使其满足A[i]<A[k]。
 * swap i and k :
 *          3   7  6  3  5  4  2  1  .
 *                    |  |     |     |
 *               i----+  j     k     +----end
 * reverse j to end :
 *          3   7  6  3  1  2  4  5  .
 *                    |  |     |     |
 *          find i----+  j     k     +----end
 * */
public class Question31 {
    public static void nextPermutation(int[] nums) {
        if (isMax(nums)){
            for (int i = 0; i<nums.length/2; i++ ) {
                int temp = nums[i];
                nums[i] = nums[nums.length - i -1];
                nums[nums.length - i -1] = temp;
            }
        }
        else {
            //core
            int pos_i = 0, pos_j=0;
            for (int i = nums.length - 1; i > 0; i--){
                if (nums[i] > nums[i-1]){
                    pos_j  = i;
                    break;
                }

            }
            int temp_min = 999999;
            for (int i = nums.length - 1; i > pos_j -1; i--){
                if (nums[i] > nums[pos_j-1] && nums[i] < temp_min){
                    temp_min = nums[i];
                    pos_i = i;
                }
            }
            //swap pos_i and pos_j-1
            int temp = nums[pos_i];
            nums[pos_i] = nums[pos_j-1];
            nums[pos_j-1] = temp;
            // reverse
            int count = 0;
            for (int i = pos_j; i<nums.length - count -1; i++)
            {
                temp = nums[i];
                nums[i] = nums[nums.length - count -1];
                nums[nums.length - count -1] = temp;
                count++;
            }
        }


    }

    private static boolean isMax(int[] nums) {
        boolean flag = false;
        for (int i = 0; i<nums.length - 1; i++) {
            if (nums[i] < nums[i+1])
                flag= true;
        }
        if (flag)
            return false;
        else return true;
    }

    public static void main(String arg[]){
        int[] input = {2,3,1,3,3};
        nextPermutation(input);
        System.out.println();
    }

}
