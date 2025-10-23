package oct_23;

public class leet_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        if (k == 0) return;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] a, int i, int j) {
        while (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        leet_189 obj = new leet_189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        obj.rotate(nums, 3);

        System.out.print("Rotated Array: ");
        for (int x : nums) System.out.print(x + " ");
        // Output: 5 6 7 1 2 3 4
    }
}
