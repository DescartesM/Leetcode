public class Question63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //init
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        boolean[][] block = new boolean[row][col];
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
            if (obstacleGrid[i][j] == 1)
                block[i][j] =true;
            }
        int[][] res = new int[row][col];
        for(int i=0;i<col;i++){
            if (obstacleGrid[0][i] == 1){
                res[0][i] = 0;
                break;// after here all zero
            }
            else
                res[0][i] = 1;
        }
        for(int i=0;i<row;i++){
            if (obstacleGrid[i][0] == 1){
                res[i][0] = 0;
                break;// after here all zero
            }
            else
                res[i][0] = 1;
        }
        //DP
        for(int i=1;i<row;i++)
            for(int j=1;j<col;j++){
                if (obstacleGrid[i][j] == 1)
                    res[i][j] = 0;
                else
                    res[i][j] = res[i-1][j] +res[i][j-1];
            }
        return res[row-1][col-1];
    }
    public static void main(String[] args){
        int m = 4;
        int n = 4;
        int[][] input = new int[m][n];
        System.out.println();
    }
}
