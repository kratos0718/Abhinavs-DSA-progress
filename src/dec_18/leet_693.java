package dec_18;

public class leet_693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));  // true (101)
        System.out.println(hasAlternatingBits(7));  // false (111)
    }

    public static boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;
        while (n > 0) {
            int curr = n & 1;
            if (curr == prev) return false;
            prev = curr;
            n >>= 1;
        }
        return true;
    }
}