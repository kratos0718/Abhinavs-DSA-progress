package oct_20;

import java.util.*;

public class leet_2956   {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        int answer1 = 0, answer2 = 0;

        for (int num : nums1) {
            if (set2.contains(num)) answer1++;
        }

        for (int num : nums2) {
            if (set1.contains(num)) answer2++;
        }

        return new int[]{answer1, answer2};
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};

        int[] result = findIntersectionValues(nums1, nums2);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
