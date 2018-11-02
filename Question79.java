import java.util.ArrayList;
import java.util.List;

public class Question79 {
    public static boolean dfs(char[][] board, boolean[][] visited, char[] word, int x, int y, int idx){

        if (idx == word.length)
            return true;
        if (x<0||y<0||x>board.length-1||y>board[0].length-1)
            return false;
        if (board[x][y] != word[idx])
            return false;
        if (visited[x][y])
            return false;
        visited[x][y] = true;
        boolean res = dfs(board, visited, word, x+1, y, idx+1) || dfs(board, visited, word, x-1, y, idx+1) ||
        dfs(board, visited, word, x, y-1,idx+1) || dfs(board, visited, word, x, y+1, idx+1);
        visited[x][y] = false;
        /*f (x+1<board.length){
            visited[x+1][y] = false;
        }
        if (y+1<board[0].length){
            visited[x][y+1] = false;
        }
        if (x-1>=0){
            visited[x-1][y] = false;
        }
        if (y-1>=0){
            visited[x][y-1] = false;
        }*/
        return res;
    }
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        char[] charset = word.toCharArray();
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
                boolean[][] visited = new boolean[row][col];
                if (dfs(board, visited, charset, i, j, 0))
                    return true;
            }
        return false;
    }

    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList<>();
        char[][] board =
                {
                        {'a','a','a','a'},
                        {'a','a','a','a'},
                        {'a','a','a','a'}
                };
        String word = "aaaaaaaaaaaaa";

        boolean ans = exist(board, word);
        int[] input ={1,2,3};
    }
}
