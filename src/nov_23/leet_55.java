package nov_23;

public class leet_55 {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};
        System.out.println(new leet_55().canJump(nums1)); // true
        System.out.println(new leet_55().canJump(nums2)); // false
    }

    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i <= reach && i < nums.length; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (reach >= nums.length - 1) return true;
        }
        return nums.length == 1;
    }
}