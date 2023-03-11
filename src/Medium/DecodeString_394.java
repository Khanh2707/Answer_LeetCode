package Medium;

import java.util.Stack;

public class DecodeString_394 {
    public static String DecodeString(String st) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c == ']') {
                String ss = "";
                while (stack.peek() != '[') {
                    ss = stack.pop() + ss;
                }
                stack.pop();
                String numberString = "";
                //Lưu ý quan trọng là phải có " stack.isEmpty() == false "
                while (stack.isEmpty() == false && Character.isDigit(stack.peek())) {
                    numberString = stack.pop() + numberString;
                }
                System.out.println("Stack trước: "+stack);
                int number = Integer.parseInt(numberString);
                ss = ss.repeat(number);
                for (int j = 0; j < ss.length(); j++) {
                    stack.push(ss.charAt(j));
                }
                System.out.println("Stack sau: "+stack);
            }
            else {
                stack.push(c);
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(DecodeString(s));
    }
}
