public class Question60 {
    public String getPermutation(int n, int k) {
        StringBuilder res = new StringBuilder();
        int[] jiecheng = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                jiecheng[i] = 1;
                continue;
            }
            jiecheng[i] = jiecheng[i - 1] * (i);
        }
        boolean[] used = new boolean[n];
        int temp = k-1;
        for(int i=0;i<n;i++){
            int kth = (temp)/jiecheng[n-i-1];
            int ans = findKth(kth,used);
            res.append(ans);
            temp = (temp)%jiecheng[n-i-1];

        }

        return res.toString();
    }
    public int findKth(int digit, boolean[] used) {
        int res = -1;
        while (digit >= 0) {
            if (!used[++res]) { //从小到大的去取值，同时进行标记
                digit--;
            }
        }
        used[res] = true;
        return res + 1;//从0-4，变为1-5

    }
}
