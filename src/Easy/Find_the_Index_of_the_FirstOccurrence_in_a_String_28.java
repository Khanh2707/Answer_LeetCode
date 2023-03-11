package Easy;

public class Find_the_Index_of_the_FirstOccurrence_in_a_String_28 {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - (needle.length() - 1); i++) {
            String temp = haystack.substring(i,i + needle.length());
            if (needle.equals(temp))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
}
