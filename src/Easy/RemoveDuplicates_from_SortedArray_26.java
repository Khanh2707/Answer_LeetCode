package Easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_from_SortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        int i = 0;
        for (Integer x : set) {
            nums[i] = x;
            i++;
        }
        for (int j = set.size(); j < nums.length; j++) {
            nums[j] = -1;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
