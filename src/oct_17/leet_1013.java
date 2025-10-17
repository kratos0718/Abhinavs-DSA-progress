package oct_17;

public class leet_1013 {

    public static boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // if total sum isn't divisible by 3, can't partition equally
        if (totalSum % 3 != 0) {
            return false;
        }

        int target = totalSum / 3;
        int count = 0;
        int currentSum = 0;

        // go through array and count how many parts match the target sum
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum == target) {
                count++;
                currentSum = 0; // reset for next segment
            }
        }

        // need at least 3 parts summing to target
        return count >= 3;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {0,2,1,-6,6,-7,9,1,2,0,1},
                {0,2,1,-6,6,7,9,-1,2,0,1},
                {3,3,6,5,-2,2,5,1,-9,4},
                {1,-1,1,-1,1,-1,1,-1},
                {1,1,1,1,1,1}
        };

        boolean[] expectedResults = {
                true,
                false,
                true,
                false,
                true
        };

        System.out.println("🔹 Testing LeetCode 1013 — Partition Array Into Three Parts With Equal Sum 🔹\n");

        for (int i = 0; i < testCases.length; i++) {
            boolean result = canThreePartsEqualSum(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + arrayToString(testCases[i]));
            System.out.println("Expected: " + expectedResults[i]);
            System.out.println("Output:   " + result);
            System.out.println(result == expectedResults[i] ? "✅ Passed\n" : "❌ Failed\n");
        }
    }

    // Helper function to print array nicely
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
