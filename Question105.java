import static java.lang.System.arraycopy;

public class Question105 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return digui(preorder,0,len-1,inorder,0,len-1);
    }
    public static TreeNode digui(int[] preorder, int prestart, int preend,
                                 int[] inorder, int instart, int inend){

        if(prestart <= preend){
            TreeNode root = new TreeNode(0);
            root.val = preorder[prestart];
            int index = 0;
            for (int i=instart;i<=inend;i++){
                if (inorder[i] == root.val){
                    index = i;
                    break;
                }
            }
            int leftlen = index - instart;
            int rightlen = inend - index;
            root.left = digui(preorder, prestart+1, prestart + leftlen,
                    inorder, instart, index-1);
            root.right = digui(preorder, preend -rightlen+1, preend,
                    inorder, index+1, inend);
            return root;
        }
        else return null;
    }

    public static void main(String[] args){
        int[] preorder = {1,2,3};
        int[] inorder  = {2,3,1};
        TreeNode root = buildTree(preorder, inorder);
    }
}
