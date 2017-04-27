package org.algorithms;

import java.util.Stack;

/**
 * Created by vital on 27/04/2017.
 */
public class DijkstraEvaluate {
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
            switch (operand) {
                case "(":
                    // do nothing
                    break;
                case ")":
                    String operation = operations.pop();
                    switch (operation) {
                        case "+": {
                            Double num2 = numbers.pop();
                            Double num1 = numbers.pop();

                            numbers.push(num1 + num2);
                            break;
                        }
                        case "-": {
                            Double num2 = numbers.pop();
                            Double num1 = numbers.pop();

                            numbers.push(num1 - num2);
                            break;
                        }
                        case "*": {
                            Double num2 = numbers.pop();
                            Double num1 = numbers.pop();

                            numbers.push(num1 * num2);
                            break;
                        }
                        case "sqrt": {
                            Double num1 = numbers.pop();

                            numbers.push(Math.sqrt(num1));
                            break;
                        }
                    }
                    break;
                default:
                    try {
                        Double num = Double.parseDouble(operand);
                        numbers.push(num);
                    } catch (NumberFormatException e) {
                        operations.push(operand);
                    }
                    break;
            }
        }

        return numbers.pop();
    }
}
