import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question90 {
    public static void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int idx){
        res.add(new ArrayList<Integer>(temp));
        if (temp.size() == res.size()){
            return;
        }

        for (int i=idx; i<nums.length; ++i){
            if(i>idx && nums[i]==nums[i-1])
                continue;
            temp.add(nums[i]);
            dfs(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, temp, nums,0);
        return res;
    }
    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList<>();
        int[] input ={1,2,2};
        res = subsetsWithDup(input);
        System.out.println();
    }
}
