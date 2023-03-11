package Easy;

public class PalindromeNumber_09 {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int copyX = x;
        int newX = 0;
        while (x > 0) {
            newX = newX * 10 + (x % 10);
            x /= 10;
        }
        if (copyX == newX)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
