public class Question59 {
        public int[][] generateMatrix(int n) {
            int[][] res = new int[n][n];
            int count =1;
            for(int circle=0;circle<n/2;circle++){
                //top
                for(int i=circle;i<n-1-circle;i++){
                    res[circle][i] = count;
                    count++;
                }
                //right
                for(int i=circle;i<n-1-circle;i++){
                    res[i][n-1-circle] = count;
                    count++;
                }
                //bottom
                for(int i=n-1-circle;i>circle;i--){
                    res[n-1-circle][i] = count;
                    count++;
                }
                //left
                for(int i=n-1-circle;i>circle;i--){
                    res[i][circle] = count;
                    count++;
                }

            }
            if(n%2 == 1)
                res[n/2][n/2] = n*n;
            return res;
        }
}
