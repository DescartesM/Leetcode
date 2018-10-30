public class Question64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row][col];
        //init
        res[0][0] = grid[0][0];
        for(int i=1;i<col;i++){
            res[0][i] = grid[0][i] + res[0][i-1];
        }
        for(int i=1;i<row;i++){
            res[i][0] = grid[i][0] + res[i-1][0];
        }
        for(int i=1;i<row;i++)
            for(int j=1;j<col;j++){
                res[i][j] = Math.min(res[i-1][j] + grid[i][j], res[i][j-1] + grid[i][j]);
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
