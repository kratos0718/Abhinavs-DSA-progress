package oct_22;
import java.util.*;

public class leet_532 {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums, k));
    }

    public static int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int count = 0;
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) count++;
            } else if (map.containsKey(num + k)) count++;
        }
        return count;
    }
}
