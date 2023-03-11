package Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solution(res, "", 0, 0, n);
        return res;
    }

    private static void solution(List<String> result, String s, int open, int close, int n) {
        if (open == n && close == n) {
            result.add(s);
            return;
        }
        if (open < n)
            solution(result, s + "(", open + 1, close, n);
        if (close < open)
            solution(result, s + ")", open, close + 1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
