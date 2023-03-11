package Easy;

public class SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
}
