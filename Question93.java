import java.util.ArrayList;
import java.util.List;

public class Question93 {
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if(s.length()>12)
            return res;
        digui(s, 4, "", res);
        return res;
    }
    public static void digui(String s, int k, String out, List<String> res) {
        if (s.isEmpty() && k == 0){
            res.add(out);
        }
        else {
            for (int i = 1; i <= 3; ++i) {
                if (s.length() >= i && isValid(s.substring(0,i))) {
                    if (k == 1) {
                        digui(s.substring(i), k - 1, out + s.substring(0, i), res);
                    }

                    else {
                        digui(s.substring(i), k - 1, out + s.substring(0, i) + ".", res);
                    }
                }
            }
        }

    }
    public static boolean isValid(String str){
        if (str.length() > 1 && str.startsWith("0"))
            return false;
        int val = Integer.parseInt(str);
        if (val > 255)
            return false;

        return true;
    }
    public static void main(String[] args){
        List<String> res = new ArrayList<>();
        String input ="25500123";
        res = restoreIpAddresses(input);
    }
}
