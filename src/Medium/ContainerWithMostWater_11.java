package Medium;

public class ContainerWithMostWater_11 {
    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int soNhoHon = Math.min(height[i], height[j]);
            max = Math.max(max,soNhoHon * (j - i));
            if (soNhoHon == height[i])
                ++i;
            else
                --j;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
