package nov_18;

public class leet_717 {
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        int[] bits = {1, 0, 0};
        System.out.println("Is last character one-bit? " + isOneBitCharacter(bits));
    }
}