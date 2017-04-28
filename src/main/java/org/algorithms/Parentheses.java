package org.algorithms;

/**
 * Created by vital on 27/04/2017.
 */

import org.algorithms.data.LinkedStack;
import org.algorithms.data.Stack;

public class Parentheses {
    /**
     *  1.3.4 Write a stack client Parentheses that reads in a text stream from standard input
     and uses a stack to determine whether its parentheses are properly balanced.
     For example, your program should print true for [()]{}{[()()]()} and false for [(]).
     */
    public boolean isBalanced(String expr) {
        Stack<Character> stack = new LinkedStack<>();
        int count = 0;
        for (char ch : expr.toCharArray()) {
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        break;
                    }
                    Character p = stack.pop();
                    if (p == '(' && ch == ')') {
                    } else if (p == '[' && ch == ']') {
                    } else if (p == '{' && ch == '}') {
                    } else {
                        count++;
                    }
                    break;
            }

        }

        return stack.isEmpty() && count == 0;
    }

    /**
     * 1.3.9 Write a program that takes from standard input an expression without left pa- rentheses and prints the equivalent infix expression with the parentheses inserted. For example, given the input:
     1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
     your program should print
     ( ( 1 + 2 ) * ( ( 3 -4 ) * ( 5 - 6 ) )

     */
    public String fix(String expr) {
        Stack<String> stack = new LinkedStack<>();

        for (String item : expr.split(" ")) {
            if (item.equals(")")) {
                String exp1 = stack.pop();
                String exp2 = stack.pop();
                String exp3 = stack.pop();

                stack.push("( " + exp3 + " " + exp2 + " " + exp1 + " )");
            } else {
                stack.push(item);
            }
        }

        assert stack.size() == 1;

        return stack.pop();
    }
}
