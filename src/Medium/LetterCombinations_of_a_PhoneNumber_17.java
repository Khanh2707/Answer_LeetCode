package Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations_of_a_PhoneNumber_17 {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty())
            return res;

        String[] listMap = new String[] {
                "Anirudh",
                "is awesome",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        solution(res, listMap, 0, digits, new StringBuilder());
        return res;
    }

    public static void solution(List<String> res, String[] listMap, int index, String digits, StringBuilder temp) {
        if (index == digits.length()) {
            res.add(temp.toString());
            return;
        }

        String sol = listMap[digits.charAt(index) - '0'];
        for (char c : sol.toCharArray()) {
            temp.append(c);
            solution(res,listMap,index + 1,digits,temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "234";
        System.out.println(letterCombinations(digits));
    }
}
