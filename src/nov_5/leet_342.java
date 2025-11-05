package nov_5;

public class leet_342 {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        leet_342 obj = new leet_342();
        int n1 = 16, n2 = 8, n3 = 64;
        System.out.println(n1 + " -> " + obj.isPowerOfFour(n1));
        System.out.println(n2 + " -> " + obj.isPowerOfFour(n2));
        System.out.println(n3 + " -> " + obj.isPowerOfFour(n3));
    }
}
