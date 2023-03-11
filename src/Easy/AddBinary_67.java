package Easy;

public class AddBinary_67 {
    public static String addBinary(String a, String b) {
//        String res = "";
//        int temp1 = 0;
//        int temp2 = 0;
//        String res1 = "";
//        String res2 = "";
//        int i1 = a.length() - 1;     int i2 = b.length() - 1;
//        for (int i = 0; i < (a.length() > b.length() ? a.length() : b.length()); i++) {
//            if (i1 >= 0) {
//                temp1 += ((a.charAt(i) - '0') % 10) * Math.pow(2, i1--);
//                res1 = String.valueOf(temp1);
//            }
//            if (i2 >= 0) {
//                temp2 += ((b.charAt(i) - '0') % 10) * Math.pow(2, i2--);
//                res2 = String.valueOf(temp2);
//            }
//        }
//        System.out.println(res1+ " " +res2);
//        return res;

        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;  int j = b.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            res.insert(0,sum % 2);
            sum /= 2;
        }
        if (sum > 0)
            res.insert(0,1);
        return res.toString();
    }

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a,b));
    }
}
