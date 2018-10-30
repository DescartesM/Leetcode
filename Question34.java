import java.util.Arrays;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class Question34 {

    public static int BinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        while(low <= high){
            middle = (low + high) / 2;
            if(arr[middle] > key){
                high = middle - 1;
            }else if(arr[middle] < key){
                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;		//not found, return -1.
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums.length == 0)
            return new int []{-1, -1};
        ans[0] = BinarySearch(nums, target);
        if (ans[0] == -1)
            return new int []{-1, -1};
        //get pre
        int pre_idx = ans[0], post_idx = ans[0];
        for (int i = ans[0]-1;i>=0;i--){
            if (nums[i] == nums[ans[0]])
                pre_idx = i;
            else break;
        }
        //get post
        for (int i= ans[0]+1;i<nums.length;i++){
            if (nums[i] == nums[ans[0]])
                post_idx = i;
            else break;
        }
        ans[0] = pre_idx;
        ans[1] = post_idx;
        return ans;
    }
    public static void main(String arg[]){
        int[] input = {5,7,7,8,8,8,8,10};
        int target = 8;
        int[] output = searchRange(input, target);
        System.out.println(Arrays.toString(output));
    }
}
