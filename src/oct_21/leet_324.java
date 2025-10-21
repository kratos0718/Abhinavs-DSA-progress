package oct_21;

import java.util.*;

public class leet_324 {

    public static void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int mid = (n + 1) / 2;
        int j = mid - 1;
        int k = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                nums[i] = sorted[j--];
            else
                nums[i] = sorted[k--];
        }
    }


    public static void main(String[] args) {
        System.out.println("===== LeetCode 324: Wiggle Sort II =====");
        int[] nums = {1, 5, 1, 1, 6, 4};
        System.out.println("Before Wiggle Sort: " + Arrays.toString(nums));
        wiggleSort(nums);
        System.out.println("After Wiggle Sort:  " + Arrays.toString(nums));
    }
}
