package Easy;

public class Length_of_LastWord_58 {
    public static int lengthOfLastWord(String s) {
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (total > 0)
                    break;
            }
            else
                total++;
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
