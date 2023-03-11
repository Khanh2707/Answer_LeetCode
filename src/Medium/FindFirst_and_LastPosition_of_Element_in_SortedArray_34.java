package Medium;

import java.util.Arrays;

public class FindFirst_and_LastPosition_of_Element_in_SortedArray_34 {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || (nums.length == 1 && nums[0] != target))
            return new int[]{-1,-1};
        if (nums.length == 1 && nums[0] == target)
            return new int[]{0,0};
        int start = 0;
        int end = nums.length - 1;
        int i = 1, j = 1;
        int kq1 = -1, kq2 = -1;
        int check1 = 0;
        int check2 = 0;
        while (start <= end) {
            int m = (start + end) / 2;
            if (nums[m] == target) {
                i = m;
                ++check1;
                break;
            }
            else if (nums[m] > target)
                end = m - 1;
            else
                start = m + 1;
        }
        if (check1 == 0) {
            return new int[]{-1,-1};
        }
        if (i == 0) {
            kq1 = i;
            while (nums[i] == nums[i + 1]) {
                j = i + 1;
                ++i;
                ++check2;
                if (i + 1 > nums.length - 1)
                    break;
            }
            if (check2 == 0)
                return new int[]{kq1,kq1};
            kq2 = j;
            return new int[]{kq1,kq2};
        }
        if (i == nums.length - 1) {
            kq2 = i;
            while (nums[i] == nums[i - 1]) {
                j = i - 1;
                --i;
                ++check2;
                if (i - 1 < 0)
                    break;
            }
            if (check2 == 0)
                return new int[]{kq2,kq2};
            kq1 = j;
            return new int[]{kq1,kq2};
        }
        while ((nums[i] == nums[i + 1]) && (nums[i] == nums[i - 1])) {
            int i_copy = i;
            while (i_copy >= 0 && nums[i_copy] == target) {
                kq1 = i_copy;
                i_copy--;
            }
            i_copy = i;
            while (i_copy <= nums.length - 1 && nums[i_copy] == target) {
                kq2 = i_copy;
                i_copy++;
            }
            return new int[]{kq1,kq2};
        }
        while ((nums[i] == nums[i + 1]) || (nums[i] == nums[i - 1])) {
            if (nums[i] == nums[i + 1]) {
                kq1 = i;
                while (nums[i] == nums[i + 1]) {
                    j = i + 1;
                    ++i;
                    ++check2;
                    if (i + 1 > nums.length - 1)
                        break;
                }
                if (check2 == 0)
                    return new int[]{kq1,kq1};
                kq2 = j;
                break;
            }
            if (nums[i] == nums[i - 1]) {
                kq2 = i;
                while (nums[i] == nums[i - 1]) {
                    j = i - 1;
                    --i;
                    ++check2;
                    if (i - 1 < 0)
                        break;
                }
                if (check2 == 0)
                    return new int[]{kq2,kq2};
                kq1 = j;
                break;
            }
        }
        if (check2 == 0)
            return new int[]{i,i};
        return new int[]{kq1,kq2};
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,3,3,3,4,5,9};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
