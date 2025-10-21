package oct_21;

import java.util.*;

public class leet_229 {

    // ==============================
    // Leetcode 229: Majority Element II
    // ==============================
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
            else if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(num1);
        if (count2 > n / 3) result.add(num2);
        return result;
    }

    // ==============================
    // Leetcode 324: Wiggle Sort II
    // ==============================
    public static void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int mid = (n + 1) / 2;
        int j = mid - 1;   // smaller half
        int k = n - 1;     // larger half

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                nums[i] = sorted[j--];
            else
                nums[i] = sorted[k--];
        }
    }

    // ==============================
    // MAIN FUNCTION
    // ==============================
    public static void main(String[] args) {
        System.out.println("===== LeetCode 229: Majority Element II =====");
        int[] arr1 = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> majors = majorityElement(arr1);
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Majority Elements (> n/3): " + majors);

        System.out.println("\n===== LeetCode 324: Wiggle Sort II =====");
        int[] arr2 = {1, 5, 1, 1, 6, 4};
        System.out.println("Before Wiggle Sort: " + Arrays.toString(arr2));
        wiggleSort(arr2);
        System.out.println("After Wiggle Sort:  " + Arrays.toString(arr2));
    }
}
