package nov_22;

import java.util.*;

public class leet_3190 {
    public int minimumOperations(int[] a) {
        int c = 0;
        for (int x : a) if (x % 3 != 0) c++;
        return c;
    }

    public static void main(String[] args) {
        leet_3190 obj = new leet_3190();
        int[] arr = {3, 6, 10, 15, 22};
        System.out.println(obj.minimumOperations(arr));
    }
}