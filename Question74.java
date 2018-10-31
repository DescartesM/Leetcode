public class Question74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int R = matrix.length, C = matrix[0].length, lo = 0, hi = R - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (matrix[mid][0] == target) return true;
            else if (target < matrix[mid][0]) hi = mid - 1;
            else lo = mid + 1;
        }
        if (lo == 0) return false;
        int row_idx = lo - 1;
        lo = 0;
        hi = C - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (matrix[row_idx][mid] == target) return true;
            else if (target < matrix[row_idx][mid]) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
    public static void main(String[] args){
        int m =1;
        int n =1;
        int[][] input =new int[m][n];
        int count = 1;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                input[i][j] = count;
                count++;
            }
        int target = 1;
        boolean ans = searchMatrix(input, target);
        System.out.println(ans);
    }
}
