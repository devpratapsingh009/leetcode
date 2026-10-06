import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans = new ArrayList<>();

        for (String word : words) {

            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();

            boolean valid = true;

            for (int i = 0; i < word.length(); i++) {

                char w = word.charAt(i);
                char p = pattern.charAt(i);

                if (map1.containsKey(w)) {
                    if (map1.get(w) != p) {
                        valid = false;
                        break;
                    }
                } else {
                    map1.put(w, p);
                }

                // pattern -> word
                if (map2.containsKey(p)) {
                    if (map2.get(p) != w) {
                        valid = false;
                        break;
                    }
                } else {
                    map2.put(p, w);
                }
            }

            if (valid) {
                ans.add(word);
            }
        }

        return ans;
    }
}