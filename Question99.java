import java.util.ArrayList;
import java.util.Stack;

public class Question99 {
    public static void recoverTree(TreeNode root) {
        TreeNode pre = new TreeNode(Integer.MIN_VALUE), p = null, q = null;
        Stack<TreeNode> stack = new Stack<>();

        while(null != root){
            stack.push(root);
            root = root.left;
        }
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            if(treeNode.val < pre.val){
                //trick here only yi ci nixu
                if(null == p){
                    p = pre;
                    q = treeNode;
                }
                else{
                    q = treeNode;
                }
            }
            pre = treeNode;

            if(null != treeNode.right){
                stack.push(treeNode.right);
                while(null != stack.peek().left)
                    stack.push(stack.peek().left);
            }
        }

        int tmp = p.val;
        p.val = q.val;
        q.val = tmp;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        recoverTree(root);
    }
}
