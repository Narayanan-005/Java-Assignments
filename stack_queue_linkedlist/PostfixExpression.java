import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {
        System.out.println(new PostfixExpression().expression("(A+B)*C-D/(E+F)"));
        //                                                           AB+C*DEF+/-
    }

    private static int precidence(char ch) {
        switch (ch) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

    public String expression(String str) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                builder.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    builder.append(stack.pop());
                }
                if (stack.isEmpty()) {
                    return "Not a Valid Expression";
                }
                stack.pop();
            } else if (!stack.isEmpty() && precidence(ch) <= precidence(stack.peek())) {
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
                stack.push(ch);
            } else {
                stack.push(ch);
            }
        }
        return builder.toString();
    }
}
