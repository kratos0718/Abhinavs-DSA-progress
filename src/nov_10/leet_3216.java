package nov_10;

public class leet_3216 {

    public static String getSmallestString(String s) {
        char[] a = s.toCharArray();
        for (int i = 1; i < a.length; i++) {
            if ((a[i - 1] % 2) == (a[i] % 2) && a[i - 1] > a[i]) {
                char t = a[i - 1];
                a[i - 1] = a[i];
                a[i] = t;
                break;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        String s = "45320";
        System.out.println("Smallest string: " + getSmallestString(s));
    }
}
