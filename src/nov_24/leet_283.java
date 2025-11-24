package nov_24;

public class leet_283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) nums[index++] = num;
        }
        while (index < nums.length) nums[index++] = 0;
    }

    public static void main(String[] args) {
        leet_283 obj = new leet_283();
        int[] nums = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums);
        for (int n : nums) System.out.print(n + " ");
    }
}