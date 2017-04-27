package org.algorithms;

import java.util.Stack;

/**
 * Created by vital on 27/04/2017.
 */
public class Evaluate {
    /**
     * evaluates expression like ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
     * @param expr
     * @return
     */
    public double evaluate(String expr) {
        Stack<String> operations = new Stack<>();
        Stack<Double> numbers = new Stack<>();

        String[] split = expr.split(" ");
        for(String operand : split) {
            if (operand.equals("(")) {
                // do nothing
            } else if (operand.equals(")")) {
                String operation = operations.pop();
                if (operation.equals("+")) {
                    Double num2 = numbers.pop();
                    Double num1 = numbers.pop();

                    numbers.push(num1 + num2);
                } else if (operation.equals("-")) {
                    Double num2 = numbers.pop();
                    Double num1 = numbers.pop();

                    numbers.push(num1 - num2);
                } else if (operation.equals("*")) {
                    Double num2 = numbers.pop();
                    Double num1 = numbers.pop();

                    numbers.push(num1 * num2);
                } else if (operation.equals("sqrt")) {
                    Double num1 = numbers.pop();

                    numbers.push(Math.sqrt(num1));
                }
            } else {
                try {
                    Double num = Double.parseDouble(operand);
                    numbers.push(num);
                } catch (NumberFormatException e) {
                    operations.push(operand);
                }
            }
        }

        return numbers.pop();
    }
}
