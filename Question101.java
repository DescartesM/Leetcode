import java.util.ArrayList;
import java.util.Queue;

public class Question101 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        ArrayList<TreeNode> myque1 = new ArrayList<>();
        ArrayList<TreeNode> myque2 = new ArrayList<>();
        myque1.add(root.left);
        myque2.add(root.right);
        while (myque1.size()>0 && myque2.size()>0){
            TreeNode node1 = myque1.get(0);
            TreeNode node2 = myque2.get(0);
            myque1.remove(0);
            myque2.remove(0);
            if((node1==null && node2 !=null) || (node1!=null && node2==null))
                return false;
            if (node1!=null) {
                if (node1.val != node2.val)
                    return false;
                myque1.add(node1.left);
                myque1.add(node1.right);
                myque2.add(node2.right);
                myque2.add(node2.left);
            }
        }
        return true;
    }
    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);
        boolean ans = isSymmetric(p);
    }
}
