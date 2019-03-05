import static java.lang.Math.abs;

public class Question110 {
    public boolean isBalanced(TreeNode root) {
        if (getTreeDepth(root) == -1)
            return false;
        else return true;
    }
    public int getTreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = getTreeDepth(root.left);
        int rightDepth = getTreeDepth(root.right);
        if(leftDepth == -1 || rightDepth == -1){
            return -1;
        }
        if(abs(leftDepth - rightDepth) > 1){
            return -1;
        }

        return leftDepth > rightDepth ? 1 + leftDepth : 1 + rightDepth;
    }
    public static void main(String[] args){

    }
}
