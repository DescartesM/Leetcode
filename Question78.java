import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * bitmanipution
 */
public class Question78 {
    public static void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums){
        res.add(new ArrayList<Integer>(temp));
        if (temp.size() == res.size()){
            return;
        }

        for (int i=0; i<nums.length; ++i){
            if(!temp.isEmpty() && nums[i]<=temp.get(temp.size()-1))
                continue;
            temp.add(nums[i]);
            dfs(res, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, temp, nums);
        return res;
    }
    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList<>();
        int[] input ={1,2,3};
        res = subsets(input);
        System.out.println();
    }
}
