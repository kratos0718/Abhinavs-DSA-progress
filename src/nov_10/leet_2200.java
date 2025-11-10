package nov_10;

import java.util.*;

public class leet_2200 {

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == key) pos.add(i);

        List<Integer> ans = new ArrayList<>();
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            while (p < pos.size() && pos.get(p) < i - k) p++;
            if (p < pos.size() && Math.abs(pos.get(p) - i) <= k)
                ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        int key = 9, k = 1;
        List<Integer> res = findKDistantIndices(nums, key, k);
        System.out.println("Result: " + res);
    }
}
