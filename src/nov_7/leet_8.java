package nov_7;

public class leet_8 {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        int sign = 1;
        if (i < n) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                if (c == '-') sign = -1;
                i++;
            }
        }
        int res = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;
            int d = c - '0';
            if (res > (Integer.MAX_VALUE - d) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + d;
            i++;
        }
        return res * sign;
    }

    public static void main(String[] args) {
        String input1 = "   -42";
        String input2 = "4193 with words";
        String input3 = "2147483648";

        System.out.println("Input: '" + input1 + "' → " + myAtoi(input1));
        System.out.println("Input: '" + input2 + "' → " + myAtoi(input2));
        System.out.println("Input: '" + input3 + "' → " + myAtoi(input3));
    }
}
