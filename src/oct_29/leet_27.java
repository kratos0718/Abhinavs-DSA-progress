package oct_29;

import java.util.Arrays;

public class leet_27 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;
        int len = removeElement(nums, val);

        System.out.println("Length after removal: " + len);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, len)));
    }
}
