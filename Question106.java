public class Question106 {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        return digui(inorder, 0, len-1, postorder,0,len-1);
    }
    public static TreeNode digui(int[] inorder, int instart, int inend,
                int[] postorder, int poststart, int postend){
        TreeNode root = new TreeNode(-1);
        if (instart <= inend){
            root.val = postorder[postend];
            int index = 0;
            for (index = instart;index<inend;index++){
                if (inorder[index] == root.val){
                    break;
                }
            }
            int leftlen = index - instart;
            int rightlen = inend - index;
            root.left = digui(inorder,instart,index-1,
                    postorder, poststart, poststart + leftlen -1);
            root.right = digui(inorder, index+1, inend,
                    postorder, postend - rightlen, postend - 1);
            return root;
        }
        else
            return null;
    }
    public static void main(String[] args){
        int[] inorder  = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        TreeNode root = buildTree(inorder,  postorder);
    }
}
