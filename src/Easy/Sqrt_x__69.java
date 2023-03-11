package Easy;

public class Sqrt_x__69 {
    public static int mySqrt(int x) {
        long res = 0;
        long l = 0;
        long r = x;
        if (x == 0 || x == 1)
            return x;
        while (l <= r) {
            long m = l + (r - l)/2;
            if (m * m <= x) {
                l = m + 1;
                res = m;
            }
            else
                r = m - 1;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(mySqrt(x));
    }
}
