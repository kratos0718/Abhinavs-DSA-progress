package dec_10;

public class leet_292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));  // false
        System.out.println(canWinNim(5));  // true
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}