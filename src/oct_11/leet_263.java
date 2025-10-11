package oct_11;

public class leet_263 {

    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] factors = {2, 3, 5};

        for (int i = 0; i < factors.length; i++) {
            int factor = factors[i];
            while (n % factor == 0) {
                n = n / factor;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        // This is the line that was corrected
        leet_263 solution = new leet_263();

        System.out.println("Is 6 ugly? " + solution.isUgly(6));
        System.out.println("Is 14 ugly? " + solution.isUgly(14));
        System.out.println("Is 1 ugly? " + solution.isUgly(1));
    }
}