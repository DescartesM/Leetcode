/**
 * 2018 jinritoutiao shixi
 * 1.count sort
 * 2. three pointer
 */
public class Question75 {
    public static void  sortColors(int[] nums) {
        int i=-1, j=-1, k=-1;
        for (int m=0;m<nums.length;m++){
            if (nums[m] == 0){
                nums[++k] = 2;
                nums[++j] = 1;
                nums[++i] = 0;
            }
            else if (nums[m] == 1){
                nums[++k] = 2;
                nums[++j] = 1;
            }
            else if (nums[m] == 2){
                nums[++k] = 2;
            }
        }
    }
    public static void main(String[] args){
        int m =1;
        int[] input ={2,0,2,1,1,0};
        sortColors(input);
        System.out.println();
    }
}
