package nov_19;

import java.util.HashSet;
import java.util.Set;

public class leet_2154 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        System.out.println(findFinalValue(nums, original));
    }

    public static int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        while (set.contains(original)) original *= 2;
        return original;
    }
}