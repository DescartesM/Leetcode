import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Question54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length  == 0)
            return res;
        int row = matrix.length;
        int col = matrix[0].length;
        //single row
        if (row==1 && col>1){
            for (int i=0;i< col;i++)
            res.add(matrix[0][i]);
            return res;
        }
        //single col
        if (col==1 && row>1){
            for (int i=0;i< row;i++)
                res.add(matrix[i][0]);
            return res;
        }

        for (int i=0;i<Math.min(row, col)/2;i++){
            //top to right;
            for (int j=i;j<col-1-i;j++){
                res.add(matrix[i][j]);
            }

            //right to bottom ;
            for (int j=i;j<row-1-i;j++){
                res.add(matrix[j][col-i-1]);
            }

            //bottom to left ;
            for (int j=col-1-i;j>i;j--){
                res.add(matrix[row-i-1][j]);
            }

            //left to top ;
            for (int j=row-1-i;j>i;j--){
                res.add(matrix[j][i]);
            }
        }
        //if odd row;
        if (row%2 == 1 && col%2 == 0){
            for (int i=Math.min(row, col)/2;i<col-Math.min(row, col)/2;i++){
                res.add(matrix[row/2][i]);
            }
        }
        if (col%2 == 1){
            for (int i=Math.min(row, col)/2;i<row-Math.min(row, col)/2;i++){
                res.add(matrix[i][col/2]);
            }
        }
        return res;
    }
    public static void main(String[] arg){
        int[][] input =  new int [4][3];
        int count=1;
        for (int i=0;i<input.length;i++)
            for (int j=0;j<input[0].length;j++){
                input[i][j] = count;
                    count++;
            }
        //new int [3][3];//定义一个二维数组
        List<Integer> ans = new ArrayList<>();
        ans = spiralOrder(input);
        System.out.println(ans);
    }
}
