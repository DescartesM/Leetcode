/*
二维DP，棋盘，i+j为index，判断能否从左上到右下
 */
public class Question97 {
    public static boolean isInterleave(String s1, String s2, String s3){
        if (s1.length() +s2.length() != s3.length())
            return false;
        if (s1.length() == 0){
            if (s2.equals(s3))
                return true;
            else return false;
        }
        if (s2.length() == 0){
            if (s1.equals(s3))
                return true;
            else return false;
        }
        int col = s1.length();
        int row = s2.length();
        int[][] dp = new int [row+1][col+1];
        dp[0][0] = 1;
        for (int i=1;i<=col;i++)
        {
            if (s1.charAt(i-1) == s3.charAt(i-1)){
                dp[0][i] = 1;
            }
            else break;
        }
        for (int i=1;i<=row;i++)
        {
            if (s2.charAt(i-1) == s3.charAt(i-1)){
                dp[i][0] = 1;
            }
            else break;
        }
        for (int i=1;i<=row;i++)
            for (int j=1;j<=col;j++){
            if ((dp[i-1][j] == 1 && s3.charAt(i+j-1) == s2.charAt(i-1))|| (dp[i][j-1] == 1 && s3.charAt(i+j-1) == s1.charAt(j-1)))
                dp[i][j] = 1;
            }
        if (dp[row][col] == 1)
            return true;
        else return false;
    }
    public static void main(String[] args){
        String s1 = "db";
        String s2 = "b";
        String s3 = "cbb";
        boolean res = isInterleave(s1,s2,s3);
    }
}
