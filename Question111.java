public class Question111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftdepth = minDepth(root.left);
        int rightdepth = minDepth(root.left);
        return leftdepth < rightdepth ? (1+leftdepth):(1+rightdepth);
    }
}
