package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_03 {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int iPointer = 0;
        int jpointer = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();
        while (jpointer < s.length()) {
            if (set.add(s.charAt(jpointer))) {
                ++jpointer;
                max = Math.max(max,set.size());
            }
            else {
                set.remove(s.charAt(iPointer));
                ++iPointer;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
