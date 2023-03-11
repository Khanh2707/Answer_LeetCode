package Easy;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs == null || strs.length == 0) {
            return res;
        }
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min,strs[i].length());
        }
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return res;
                }
            }
            res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        String s[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
