import java.util.ArrayList;
import java.util.List;

/**
 * 给出的n代表有n个节点，1,2,3,4,5，……n，这些节点组成的不同形态的二叉查找树，是说中序遍历这些树，得到的序列就是 1,2,3,4,5，……n。
 * 根据二叉查找树可以知道，某根节点x，它的左子树的值全<=x（当然本题不存在等于的情况），它的右子树的值全>=x，所以，当它的根节点是 1 的时候，左子树个数为 0 ，右子树的个数为 n-1， 当它的根节点为 2 的时候， 左子树个数为 1， 右子树的个数为 n-2……
 * 还有一个规律，就是这棵树的不同形态的二叉查找树的个数，就是根节点的  左子树的个数*右子树的个数，想想还是很容易理解的，就是左边的所有情况乘以右边的所有情况，知道这个规律就好做啦。
 * 动态规划，从前到后计算出当有i个节点时,它有多少种不同形态的树。nums[i] += nums[j] * nums[i-1-j]  （初始j==0，每做完一步j++）。（这里i-1-j 减掉的 1 代表是根节点占了一个位置）

 */
public class Question96 {
    public static int numTrees(int n) {
        if (n == 0)return 0;
        if (n == 1) return 1;

        int[] nums = new int[n+1];
        nums[0] = 1; nums[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] = nums[i] + nums[j] * nums[i-1-j];
            }
        }
        return nums[n];

    }
    public static void main(String[] args){
        int res;
        int n= 3;
        res = numTrees(n);
    }
}
