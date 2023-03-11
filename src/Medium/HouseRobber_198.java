package Medium;

public class HouseRobber_198 {
    public static int rob (int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int res[] = new int[nums.length + 1];
        res[0] = 0;
        res[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res[i + 1] = Math.max(res[i], res[i - 1] + nums[i]);
        }
        return res[nums.length];
    }

    public static void main(String[] args) {
        int nums[] = {3,2,0,5,4};
        System.out.println(rob(nums));
    }
}
