package Easy;

import java.util.Stack;

public class ValidParentheses_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && !stack.isEmpty()) {
                if (stack.peek() != '(')
                    return false;
                else
                    stack.pop();
            }
            else if (s.charAt(i) == ']' && !stack.isEmpty()) {
                if (stack.peek() != '[')
                    return false;
                else
                    stack.pop();
            }
            else if (s.charAt(i) == '}' && !stack.isEmpty()) {
                if (stack.peek() != '{')
                    return false;
                else
                    stack.pop();
            }
            else
                stack.push(s.charAt(i));
        }
        if (stack.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }
}
