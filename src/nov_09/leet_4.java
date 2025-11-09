package nov_9;

public class leet_4 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median1 = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median 1: " + median1);
        // Expected output: Median 1: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        double median2 = solution.findMedianSortedArrays(nums3, nums4);
        System.out.println("Median 2: " + median2);
        // Expected output: Median 2: 2.5
    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int m = nums1.length;
            int n = nums2.length;
            int low = 0;
            int high = m;
            int totalLeft = (m + n + 1) / 2;

            while (low <= high) {
                int partitionX = (low + high) / 2;
                int partitionY = totalLeft - partitionX;

                int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
                int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

                int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
                int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

                if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                    if ((m + n) % 2 == 0) {
                        return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                    } else {
                        return (double) Math.max(maxLeftX, maxLeftY);
                    }
                } else if (maxLeftX > minRightY) {
                    high = partitionX - 1;
                } else {
                    low = partitionX + 1;
                }
            }
            return 0.0;
        }
    }
}