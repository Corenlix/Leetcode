// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (var c : s.toCharArray()) {
            if (c == '(' || c =='{' || c == '[') {
                stack.push(c);
            } else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            } else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            } else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}