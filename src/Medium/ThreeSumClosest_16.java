package Medium;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int total = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum <= target)
                    ++start;
                else
                    --end;
                if (Math.abs(total - target) > Math.abs(sum - target))
                    total = sum;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
