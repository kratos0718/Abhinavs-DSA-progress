package oct_15;

public class leet_1071 {

    public String gcdOfStrings(String str1, String str2) {
        // Check if the strings have the same repetitive pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the gcd of their lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // The gcd string is the prefix of that length
        return str1.substring(0, gcdLength);
    }

    // Helper method to find gcd of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Main method for testing
    public static void main(String[] args) {
        leet_1071 sol = new leet_1071();

        System.out.println(sol.gcdOfStrings("ABCABC", "ABC"));   // Output: ABC
        System.out.println(sol.gcdOfStrings("ABABAB", "ABAB"));  // Output: AB
        System.out.println(sol.gcdOfStrings("LEET", "CODE"));    // Output: (empty)
    }
}
