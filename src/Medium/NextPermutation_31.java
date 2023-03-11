package Medium;

import java.util.Arrays;

public class NextPermutation_31 {
    public static int[] nextPermutation(int[] nums) {
        int j = 0,k = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                j = i - 1;
                break;
            }
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[j]) {
                k = i;
                break;
            }
        }
        if (j == 0 && k == 0) {
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length-1-i];
                nums[nums.length-1-i] = temp;
            }
            return nums;
        }
        swap(nums,j,k);
        for (int i = j + 1; i < ((nums.length - (j + 1)) / 2) + (j + 1); i++) {
            int temp1 = nums[i];
            nums[i] = nums[(nums.length + j + 1)-i-1];
            nums[(nums.length + j + 1)-i-1] = temp1;
        }
        return nums;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(nextPermutation(nums)));
    }
}
