package dec_1;

public class leet_202 {
    public static void main(String[] args) {
        Solution202 s = new Solution202();
        System.out.println(s.isHappy(19));
    }
}

class Solution202 {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);
        return slow == 1;
    }

    int square(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
