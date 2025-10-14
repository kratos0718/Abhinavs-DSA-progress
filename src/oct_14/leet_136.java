package oct_14;

public class leet_136 {

    // Function to find the single number using XOR
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n; // XOR each element
        }
        return result;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        int ans = singleNumber(nums);

        System.out.println("The single number is: " + ans);
    }
}
