package dec_26;

import java.util.Arrays;

public class leet_164 {
    static class Solution {
        public int maximumGap(int[] nums) {
            if (nums.length < 2) return 0;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            int n = nums.length;
            int gap = Math.max(1, (max - min) / (n - 1));
            int bucketCount = (max - min) / gap + 1;
            int[] bucketMin = new int[bucketCount];
            int[] bucketMax = new int[bucketCount];
            Arrays.fill(bucketMin, Integer.MAX_VALUE);
            Arrays.fill(bucketMax, Integer.MIN_VALUE);

            for (int num : nums) {
                int idx = (num - min) / gap;
                bucketMin[idx] = Math.min(bucketMin[idx], num);
                bucketMax[idx] = Math.max(bucketMax[idx], num);
            }

            int prev = min, ans = 0;
            for (int i = 0; i < bucketCount; i++) {
                if (bucketMin[i] == Integer.MAX_VALUE) continue;
                ans = Math.max(ans, bucketMin[i] - prev);
                prev = bucketMax[i];
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {3, 6, 9, 1};
        int[] nums2 = {10};
        int[] nums3 = {10, 3, 2, 1};

        System.out.println(sol.maximumGap(nums1)); // Expected 3
        System.out.println(sol.maximumGap(nums2)); // Expected 0
        System.out.println(sol.maximumGap(nums3)); // Expected 7
    }
}