public class Solution3 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topElement = stack.pop();
                if ((ch == ')' && topElement != '(') || 
                    (ch == '}' && topElement != '{') || 
                    (ch == ']' && topElement != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}