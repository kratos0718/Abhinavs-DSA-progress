package nov_25;

import java.util.Arrays;

public class leet_34 {
    public int[] searchRange(int[] nums, int target) {
        int first = bound(nums, target, true);
        int last = bound(nums, target, false);
        return new int[]{first, last};
    }

    private int bound(int[] nums, int target, boolean first) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) l = m + 1;
            else if (nums[m] > target) r = m - 1;
            else {
                res = m;
                if (first) r = m - 1; else l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        leet_34 s = new leet_34();
        System.out.println(Arrays.toString(s.searchRange(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(s.searchRange(new int[]{}, 1)));
        System.out.println(Arrays.toString(s.searchRange(new int[]{1}, 1)));
    }
}