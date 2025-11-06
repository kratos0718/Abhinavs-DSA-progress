package nov_6;

public class leet_275 {

    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] == n - mid) {
                return n - mid;
            } else if (citations[mid] < n - mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return n - left;
    }

    public static void main(String[] args) {
        leet_275 solution = new leet_275();
        int[] citations = {0, 1, 3, 5, 6};
        int result = solution.hIndex(citations);
        System.out.println("H-Index: " + result);
    }
}