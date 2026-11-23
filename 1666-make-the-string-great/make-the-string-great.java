
class Solution {
    public String makeGood(String s) {

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (st.length() > 0 &&
                Math.abs(st.charAt(st.length() - 1) - ch) == 32) {

                st.deleteCharAt(st.length() - 1);

            } else {
                st.append(ch);
            }
        }

        return st.toString();
    }
}
