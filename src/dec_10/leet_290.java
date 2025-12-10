package dec_10
        ;

import java.util.*;

public class leet_290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> rev = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (map.containsKey(c) && !map.get(c).equals(w)) return false;
            if (rev.containsKey(w) && rev.get(w) != c) return false;
            map.put(c, w);
            rev.put(w, c);
        }
        return true;
    }
}