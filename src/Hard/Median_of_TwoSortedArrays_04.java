package Hard;

public class Median_of_TwoSortedArrays_04 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int r = nums1.length + nums2.length;
        int result[] = new int[r];

        int i = 0, i1 = 0, i2 = 0;
        while (i < r) {
            if (i1 < nums1.length && i2 < nums2.length) {
                if (nums1[i1] < nums2[i2]) {
                    result[i] = nums1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = nums2[i2];
                    i++; i2++;
                }
            }
            else {
                if (i1 < nums1.length) {
                    result[i] = nums1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = nums2[i2];
                    i++; i2++;
                }
            }
        }
        double res;
        if (r % 2 != 0)
            return result[r / 2];
        else {
            res = (result[r / 2] + result[(r / 2) - 1]);
            return res / 2;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2,7};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
