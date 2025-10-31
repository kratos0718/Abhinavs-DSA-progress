package oct_31;

public class leet_29 {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int sign = ((dividend > 0) ^ (divisor > 0)) ? -1 : 1;
        long res = 0;
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                res += 1L << i;
                a -= b << i;
            }
        }
        res = sign == 1 ? res : -res;
        if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(-2147483648, -1));
        System.out.println(divide(1, 1));
    }
}
