package nov_24;

public class leet_2460 {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int index = 0;
        for (int num : nums) {
            if (num != 0) nums[index++] = num;
        }
        while (index < nums.length) nums[index++] = 0;
        return nums;
    }

    public static void main(String[] args) {
        leet_2460 obj = new leet_2460();
        int[] nums = {1, 2, 2, 1, 1, 0};
        int[] result = obj.applyOperations(nums);
        for (int n : result) System.out.print(n + " ");
    }
}