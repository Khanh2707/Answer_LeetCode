package Easy;

import java.util.Arrays;

public class TwoSum_01 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                //int sum = nums[j] + nums[j-i];
                if(nums[j] + nums[j-i] == target){
                    return new int[]{j-i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}
