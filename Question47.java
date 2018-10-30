import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        DFS(nums,nums.length,0, new boolean[nums.length], new ArrayList<>(), res);
        return  res;
    }

    public static void DFS(int[] nums, int len, int current, boolean[] visited, ArrayList<Integer>temp, ArrayList<List<Integer>> res) {
        if (current >=len){
            res.add(temp);
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(!visited[i]){
                if(i > 0 && nums[i] == nums[i-1] && visited[i-1])
                    continue;
                temp.add(nums[i]);
                visited[i] = true;
                DFS(nums, nums.length,current+1,visited,temp,res);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }


    }
    public static void main(String[] arg){
        int[] input = {1,1,2};
        List<List<Integer>> ans = new ArrayList<>();
        ans = permuteUnique(input);
        System.out.println();
    }
}
