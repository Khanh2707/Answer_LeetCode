package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return res;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;
                int start = j + 1;
                int end = n - 1;
                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum < target)
                        ++start;
                    else if (sum > target)
                        --end;
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        ++start;
                        --end;
                        while (start < end && nums[start] == nums[start - 1])
                            ++start;
                        while (start < end && nums[end] == nums[end + 1])
                            --end;
                    }
                }
            }
        }
        return res;
    }
    // -2 -1 0 0 1 2
    public static void main(String[] args) {
        int nums[] = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSum(nums, target));
    }
}
