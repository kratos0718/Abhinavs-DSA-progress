package dec_24;

public class leet_80 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int l = 1, r = 1;
        int count = 1;
        int atmost = 1;

        while (r < n) {
            if (nums[r] == nums[r - 1]) {
                if (atmost < 2) {
                    count++;
                    nums[l++] = nums[r++];
                    atmost++;
                } else {
                    r++;
                }
            } else {
                atmost = 1;
                nums[l++] = nums[r++];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leet_80 sol = new leet_80();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLen = sol.removeDuplicates(nums);

        System.out.println("New length: " + newLen);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLen; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}