import java.util.ArrayList;
import java.util.List;

public class Question94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        digui(root,res);
        return res;
    }
    public static void digui(TreeNode root, List<Integer> res){
        if (root != null) {
            digui(root.left, res);
            res.add(root.val);
            digui(root.right, res);
        }
    }
    public static void main(String[] args){

    }
}
