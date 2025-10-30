package oct_30;

public class leet_7 {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int num1 = 123;
        int num2 = -456;
        int num3 = 1534236469;  // overflow test
        System.out.println(sol.reverse(num1)); // expected: 321
        System.out.println(sol.reverse(num2)); // expected: -654
        System.out.println(sol.reverse(num3)); // expected: 0
    }
}

class Solution7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
