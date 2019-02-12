import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question95 {
    public static List<TreeNode> generateTrees(int n) {
        // write your code here
        if(n==0){
            List<TreeNode> R = new LinkedList<TreeNode>();
            R.add(null);
            return R;
        }
        return generateTrees(1,n);
    }
    private static TreeNode copy(TreeNode Old){
        if(Old==null)
            return null;
        TreeNode T = new TreeNode(Old.val);
        T.right = copy(Old.right);
        T.left = copy(Old.left);
        return T;
    }
    private static List<TreeNode> generateTrees(int start, int last){
        if(start>last)
            return null;
        List<TreeNode> result = new LinkedList<TreeNode>();
        for(int i=start;i<=last;++i){
            TreeNode root = new TreeNode(i);
            List<TreeNode> left = generateTrees(start,i-1);
            List<TreeNode> right = generateTrees(i+1,last);
            if(left==null&&right==null)
                result.add(root);
            else if(left==null){
                for(TreeNode R:right){
                    root.right = R;
                    result.add(copy(root));
                }
            }
            else if(right==null){
                for(TreeNode L:left){
                    root.left = L;
                    result.add(copy(root));
                }
            }
            else{
                for(TreeNode L:left)
                    for(TreeNode R:right){
                        root.left = L;
                        root.right = R;
                        result.add(copy(root));
                    }
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<TreeNode> res = new ArrayList<>();
        int n= 5;
        res = generateTrees(n);
    }
}
