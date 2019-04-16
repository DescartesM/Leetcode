import java.util.*;
/*
* 本题对回文串的判别方法使用动态规划的思路。对于字符串s，如果其首字符和末字符不相同，显然其不是一个回文串。如果其首字符和末字符相同，那么我们去判断字符串s出去首字符和末字符的子串是否是回文串。
状态定义：judge(i, j) -------- 字符串s中[i, j]范围内的子串是否是回文串
状态转移：
（1）如果s.charAt(i) != s.charAt(j)，judge(i)(j) = false。
（2）如果s.charAt(i) == s.charAt(j)，
a：如果此时j - i <= 1，即[i, j]范围内的字符个数小于等于2个，judge(i)(j) = true。
b：否则，judge(i)(j) = judge(i + 1)(j - 1)。
很显然的一点是，如果字符串s本身就是一个回文串，那么其需要分割的次数就是0。
通过上述状态定义和状态转移，我们很容易地得到大小为n * n的二维矩阵judge，用来判断字符串s中[i, j]范围内的子串是否是回文串。
而题目要求的是将s分割成一些子串，使每个子串都是回文串，求解这个最少分割次数，我们还需要一个状态定义和状态转移方程。
状态定义：dp(i) -------- 表示s中第i个字符到第（n-1）个字符所构成的子串的最小分割次数
状态转移：
在[i, n - 1]范围内寻找切点j，使得满足s中[i, j]范围的子串是一个回文串，在所有的切点j中寻找总的最少的切分次数。即1 + dp[j + 1]的最小值，如果j + 1越界，即j已经是s中第n - 1个字符，那么说明s中[i, j]范围内的整个子串就是一个回文串。该最小值就是dp[i]的值。
对于上述两个状态定义和状态转移，其实可以一起进行，因为切分需要满足的条件是s中[i, j]范围内的子串是一个回文串。
时间复杂度和空间复杂度均是O(n ^ 2)。
*/
public class Question132 {
    public static int minCut(String s) {
        int n = s.length();
        boolean[][] judge = new boolean[n][n];
        int[] dp = new int[n]; // dp[i]表示s中第i个字符到第（n-1）个字符所构成的子串的最小分割次数
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || judge[i + 1][j - 1])) {
                    judge[i][j] = true;
                    if (j + 1 < n) {
                        dp[i] = Math.min(dp[i], 1 + dp[j + 1]);
                    }else{
                        dp[i] = 0;
                    }
                }
            }
        }
        return dp[0];
    }
    public static void main(String[] args){

    }
}
