package nov_27;

public class leet_58 {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // 6
    }
}