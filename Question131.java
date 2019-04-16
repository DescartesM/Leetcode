import java.util.*;

public class Question131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList();
        List<String> sub = new ArrayList();
        dfs(s, 0, sub, result);
        return result;
    }

    public void dfs(String s, int index, List<String> sub, List<List<String>> result) {
        if(index == s.length()) {
            result.add(new ArrayList<String>(sub));
            return;
        }
        String prefix = "";
        for (int i = index; i < s.length(); i ++) {
            prefix += s.charAt(i);
            if (!isPalindrome(prefix)) {
                continue;
            }
            sub.add(prefix);
            dfs(s, i + 1, sub, result);
            sub.remove(sub.size() - 1);
        }
    }
    public boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
    public static void main(String[] args){

    }
}
