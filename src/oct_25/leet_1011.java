package oct_25;

public class leet_1011 {

    // ✅ main method to test locally in IntelliJ
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;

        leet_1011 obj = new leet_1011();
        int result = obj.shipWithinDays(weights, days);
        System.out.println("Minimum capacity needed: " + result);
    }

    // ✅ LeetCode solution method
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;   // smallest possible capacity
        int right = 0;  // largest possible capacity (sum of all weights)

        for (int w : weights) {
            left = Math.max(left, w); // must be at least as heavy as the heaviest package
            right += w;
        }

        // binary search the capacity
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid; // try smaller capacity
            } else {
                left = mid + 1; // need more capacity
            }
        }

        return left;
    }

    // helper: checks if we can ship within D days using given capacity
    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return requiredDays <= days;
    }
}
