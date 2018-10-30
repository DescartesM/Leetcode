import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] subres = new int[candidates.length];//这个设计，挺聪明的，不用考虑变长了
        combo(candidates, target, res, subres, 0, 0);
        return res;
    }

    private static void combo(int[] candidates, int target, List<List<Integer>> res, int[] subres, int sum, int index) {
        if (sum > target) return;

        if (sum == target) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < subres.length; i++) {
                for (int j = 0; j < subres[i]; j++) {
                    list.add(candidates[i]);
                }
            }

            res.add(list);
            return;
        }

        for (int i = index; i < subres.length; i++) {
            subres[i]++;
            combo(candidates, target, res, subres, sum + candidates[i], i);
            subres[i]--;
        }
    }

    public static void main(String arg[]){
        int[] input = {5,7,7,8,8,8,8,10};
        int target = 8;
    }
}
