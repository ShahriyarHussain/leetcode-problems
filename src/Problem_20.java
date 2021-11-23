import java.util.Stack;

public class Problem_20 {

    /*
    Problem Name: Valid Parenthesis
    link: https://leetcode.com/problems/valid-parentheses/
     */

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char brace = s.charAt(i);
            switch (brace){
                case ']':
                    if (stack.empty()) return false;
                    if (stack.peek() != '[' ) return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.empty()) return false;
                    if (stack.peek() != '{' ) return false;
                    stack.pop();
                    break;
                case')':
                    if (stack.empty()) return false;
                    if (stack.peek() != '(' ) return false;
                    stack.pop();
                    break;
                default:
                    stack.push(brace);
            }
        }
        return stack.empty();
    }
}
