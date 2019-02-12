import java.util.ArrayList;

public class Question98 {
    public static void InOrder(TreeNode node, ArrayList res) {
        if (node != null) {
            InOrder(node.left, res);
            res.add(node.val);
            InOrder(node.right, res);
        }
    }
    public static boolean isValidBST(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();
        InOrder(root, res);
        for (int i=1;i< res.size();i++){
            if (res.get(i-1) >= res.get(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        boolean ans = isValidBST(root);
    }
}
