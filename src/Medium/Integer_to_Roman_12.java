package Medium;

import java.util.TreeMap;

public class Integer_to_Roman_12 {
    public static String intToRoman(int num) {
        TreeMap<Integer,Character> map = new TreeMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');

        String res = "";
        int total = 0;
        while (total < num) {
            if (num >= 900 && num < 1000) {
                res = res + map.get(100) + map.get(1000);
                num -= 900;
            }
            else if (num >= 400 && num < 500) {
                res = res + map.get(100) + map.get(500);
                num -= 400;
            }
            else if (num >= 90 && num < 100) {
                res = res + map.get(10) + map.get(100);
                num -= 90;
            }
            else if (num >= 40 && num < 50) {
                res = res + map.get(10) + map.get(50);
                num -= 40;
            }
            else if (num == 9) {
                res = res + map.get(1) + map.get(10);
                num -= 9;
            }
            else if (num == 4) {
                res = res + map.get(1) + map.get(5);
                num -= 4;
            }
            else {
                total += map.floorKey(num);
                res += map.get(map.floorKey(num));
                num -= total;
                total = 0;
            }
        }
        return res;

//        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        StringBuilder sb = new StringBuilder();
//        int i = 0;
//        while (num >= 0 && i < nums.length) {
//            while (num >= nums[i]) {
//                sb.append(romans[i]);
//                num -= nums[i];
//            }
//            i++;
//        }
//        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }
}
