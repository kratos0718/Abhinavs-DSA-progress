package oct_14;

import java.util.HashSet;

public class leet_217 {

    // Function to check if the array contains any duplicates
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true; // Found a duplicate
            }
            set.add(n);
        }

        return false; // All elements are unique
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("nums1 -> " + containsDuplicate(nums1)); // true
        System.out.println("nums2 -> " + containsDuplicate(nums2)); // false
    }
}
