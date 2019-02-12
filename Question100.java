import java.util.ArrayList;

public class Question100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if(p!=null && q!=null && p.val==q.val  ){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(3);
        boolean ans = isSameTree(p, q);
    }
}
