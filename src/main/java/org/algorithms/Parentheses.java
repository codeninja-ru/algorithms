package org.algorithms;

/**
 * Created by vital on 27/04/2017.
 */

import org.algorithms.data.LinkedStack;
import org.algorithms.data.Stack;

/**
 *  1.3.4 Write a stack client Parentheses that reads in a text stream from standard input
 and uses a stack to determine whether its parentheses are properly balanced.
 For example, your program should print true for [()]{}{[()()]()} and false for [(]).
 */
public class Parentheses {
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
}
