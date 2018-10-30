public class Question69 {
    public static int mySqrt(int x) {
        //return (int) Math.sqrt(x);
        //Newton
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
    public static void main(String[] args){
        int input =8;
        int ans = mySqrt(input);
        System.out.println(ans);
    }
}
