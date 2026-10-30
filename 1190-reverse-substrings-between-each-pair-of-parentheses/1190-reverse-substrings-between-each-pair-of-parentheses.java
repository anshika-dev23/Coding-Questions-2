
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int[] pair = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(i);
            else if (s.charAt(i) == ')') {
                int j = st.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder ans = new StringBuilder();
        int dir = 1;

        for (int i = 0; i < s.length(); i += dir) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair[i];
                dir = -dir;
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
