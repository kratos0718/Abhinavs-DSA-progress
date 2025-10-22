package oct_22;
import java.util.*;

public class leet_1356 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] res = sortByBits(arr);
        for (int n : res) System.out.print(n + " ");
    }

    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            if (bitA == bitB) return a - b;
            return bitA - bitB;
        });
        return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
    }
}
