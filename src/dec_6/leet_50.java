package dec_6;

public class leet_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));   // 1024.0
        System.out.println(myPow(2.0, -2));   // 0.25
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double base = x;
        while (N > 0) {
            if ((N & 1) == 1) ans *= base;
            base *= base;
            N >>= 1;
        }
        return ans;
    }
}