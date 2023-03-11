package Medium;

public class LongestPalindromicSubstring_05 {
    public static String longestPalindrome(String s) {
        if (s.isEmpty())
            return s;
        int size = s.length();
        int max = 0;
        int i = 0;
        int start = 0; int end = 0;
        while (i < size) {
            int left = i;
            int right = i;
            while (right < size - 1 && s.charAt(right) == s.charAt(right + 1))
                ++right;
            if (right - left >= max) {
                max = right - left;
                start = left;
                end = right;
            }
            while (left > 0 && right < size - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
                --left;
                ++right;
            }
            if (right - left >= max) {
                max = right - left + 1;
                start = left;
                end = right;
            }
            ++i;
        }
        return s.substring(start,end + 1);
    }

    public static void main(String[] args) {
        String s = "bananas";
        System.out.println(longestPalindrome(s));
    }
}
