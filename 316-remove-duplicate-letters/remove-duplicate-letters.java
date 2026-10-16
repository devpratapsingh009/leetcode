import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {

        int[] frequency = new int[26];
        boolean[] used = new boolean[26];

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            int index = ch - 'a';

            frequency[index]--;

            if (used[index]) {
                continue;
            }
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && frequency[stack.peek() - 'a'] > 0) {

                char removed = stack.pop();
                used[removed - 'a'] = false;
            }

            stack.push(ch);
            used[index] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
}