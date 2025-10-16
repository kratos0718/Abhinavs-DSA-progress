package oct_16;

import java.util.*;

public class leet_523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = k == 0 ? sum : sum % k;
            if (remainder < 0) remainder += k;
            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) return true;
            } else remainderMap.put(remainder, i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
}
