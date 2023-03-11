package Medium;

public class String_to_Integer_atoi__08 {
    public static int myAtoi(String s) {
        final int MIN = (int) Math.pow(-2,31);
        final int MAX = (int) (Math.pow(2,31) - 1);
        s = s.replaceAll("^\\s+","");
        double res = 0;
        int i = 0;
        if (s.length() == 0)
            return 0;
        boolean check = s.charAt(0) == '+' || s.charAt(0) != '-' ? true : false;
        if (s.charAt(0) == '+' || s.charAt(0) == '-')
            ++i;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            res = res * 10 + (s.charAt(i) - '0');
            ++i;
        }
        if (!check)
            res *= -1;
        if (res > MAX)
            return MAX;
        else if (res < MIN)
            return MIN;
        else {
            return (int) res;
        }
    }

    public static void main(String[] args) {
        String s = "9223372036854775808";
        System.out.println(myAtoi(s));
    }
}
