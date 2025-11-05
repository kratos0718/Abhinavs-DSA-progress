package nov_5;

class VersionControl {
    boolean isBadVersion(int version) {
        return version >= 4; // dummy logic for testing
    }
}

public class leet_278 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        leet_278 obj = new leet_278();
        int n = 10;
        System.out.println("First bad version: " + obj.firstBadVersion(n));
    }
}
