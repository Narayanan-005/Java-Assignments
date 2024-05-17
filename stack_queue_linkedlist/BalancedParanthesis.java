import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(new BalancedParanthesis().balanceParanthesis("{{([()])}"));
    }

    public String balanceParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                if (ch == ')' && stack.pop() != '(') {
                    return "Not Balanced";
                } else if (ch == ']' && stack.pop() != '[') {
                    return "Not Balanced";
                } else if (ch == '}' && stack.pop() != '{') {
                    return "Not Balanced";
                }
            } else {
                return "Not Balanced";
            }
        }
        if (stack.isEmpty()) {
            return "Balanced";
        }
        return "Not Balanced";
    }
}
