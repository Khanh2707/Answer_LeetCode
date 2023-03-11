package Medium;

public class JumpGameII_45 {
    public static int jump(int[] nums) {
        int max = 0;
        int count = 0;
        int cur = -1;
        for (int i = 0; max < nums.length - 1; i++) {
            if (i > cur) {
                ++count;
                cur = max;
            }
            max = Math.max(max,nums[i] + i);
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1,1,1};
        System.out.println(jump(nums));
    }
}
