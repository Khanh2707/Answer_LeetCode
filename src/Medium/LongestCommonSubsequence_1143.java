package Medium;

public class LongestCommonSubsequence_1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int F[][] = new int[l1+1][l2+1];

        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                if (i == 0 || j == 0) {
                    F[i][j] = 0;
                }
                else {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        F[i][j] = F[i - 1][j - 1] + 1;
                    }
                    else {
                        F[i][j] = Math.max(F[i - 1][j],F[i][j - 1]);
                    }
                }
            }
        }
        return F[l1][l2];
    }
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
}
