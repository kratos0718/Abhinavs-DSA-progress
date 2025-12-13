package dec_13;

import java.util.Arrays;

public class leet_338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5))); // [0,1,1,2,1,2]
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) offset *= 2;
            res[i] = 1 + res[i - offset];
        }
        return res;
    }
}