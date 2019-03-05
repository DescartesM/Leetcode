import java.util.*;

public class Question107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> myque = new LinkedList<>();
        if (root == null)
            return null;
        myque.add(root);
        while (!myque.isEmpty()){
            int templen = myque.size();
            List<Integer> tempres = new ArrayList<>();
            for (int i=0;i<templen;i++){
                TreeNode tempnode = myque.poll();
                tempres.add(tempnode.val);
                if (tempnode.left != null){
                    myque.add(tempnode.left);
                }
                if (tempnode.right != null){
                    myque.add(tempnode.right);
                }
            }
            res.add(tempres);
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args){

    }
}
