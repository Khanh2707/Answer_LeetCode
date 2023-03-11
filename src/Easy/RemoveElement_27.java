package Easy;

import java.util.ArrayList;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        for (int i = list.size(); i < nums.length; i++) {
            nums[i] = -1;
        }
        return list.size();
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
