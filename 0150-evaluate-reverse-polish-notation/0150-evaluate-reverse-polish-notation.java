import java.util.*;

class Solution {

    public int op(int a, int b, String x) {
        if (x.equals("+"))
            return a + b;
        if (x.equals("-"))
            return a - b;
        if (x.equals("*"))
            return a * b;
        if (x.equals("/"))
            return a / b;

        return 0;
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        int n = tokens.length;

        for (int i = 0; i < n; i++) {

            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("/") &&
                !tokens[i].equals("*")) {

                st.push(Integer.parseInt(tokens[i]));
            } 
            else {
                int x = st.pop();
                int y = st.pop();

                st.push(op(y, x, tokens[i]));
            }
        }

        return st.pop();
    }
}