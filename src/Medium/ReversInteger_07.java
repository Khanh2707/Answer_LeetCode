package Medium;

public class ReversInteger_07 {
    public static int reverse(int x) {
        long y = 0;
        boolean checkam = false;
        if (x < 0) {
            x *= -1;
            checkam = true;
        }
        while (x > 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        if (y > Integer.MAX_VALUE)
            return 0;
        if (y >= Math.pow(-2,31) && y <= Math.pow(2,31) - 1 && checkam == true)
            return (int) (y *= -1);
        else if (y >= Math.pow(-2,31) && y <= Math.pow(2,31) - 1 && checkam == false)
            return (int) y;
        else
            return 0;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}
