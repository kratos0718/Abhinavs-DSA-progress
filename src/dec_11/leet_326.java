package dec_11;

public class leet_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27)); // true
        System.out.println(isPowerOfThree(28)); // false
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}