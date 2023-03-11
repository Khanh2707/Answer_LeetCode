package Easy;

import java.util.Arrays;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 9) {
            int res[] = new int[2];
            res[0] = 1;
            res[1] = 0;
            return res;
        }

        int sum = digits[digits.length - 1] + 1;
        int du = sum / 10;
        digits[digits.length - 1] = sum % 10;
        for (int i = digits.length - 2; i >= 0; i--) {
            digits[i] += du;
            if (digits[0] / 10 > 0) {
                int res[] = new int[digits.length + 1];
                res[0] = digits[0] / 10;
                digits[0] %= 10;
                for (int j = 1; j < res.length; j++) {
                    res[j] = digits[j - 1];
                }
                return res;
            }
            if (digits[i] / 10 > 0) {
                du = digits[i] / 10;
                digits[i] %= 10;
            }
            else
                du = 0;
        }
        return digits;
    }

    public static void main(String[] args) {
        int digits[] = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
