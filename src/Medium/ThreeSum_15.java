package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        int end = 0;
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                start = i + 1;
                end = nums.length - 1;
                target = 0 - nums[i];
                while (start < end) {
                    if (nums[start] + nums[end] > target)
                        --end;
                    else if (nums[start] + nums[end] < target)
                        ++start;
                    else {
                        res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1])
                            ++start;
                        while (start < end && nums[end] == nums[end - 1])
                            --end;
                        ++start;
                        --end;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        System.out.println(threeSum(nums));
    }
}
