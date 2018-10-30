import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> judge = new HashMap<String, List>();
        for (String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!judge.containsKey(key))
                judge.put(key, new ArrayList());
            judge.get(key).add(s);
        }


        return new ArrayList(judge.values());
    }
    public static void main(String[] arg){
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = new ArrayList<>();
        ans = groupAnagrams(input);
        System.out.println();
    }
}
