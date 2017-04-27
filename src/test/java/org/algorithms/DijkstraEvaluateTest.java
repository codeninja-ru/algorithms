package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DijkstraEvaluateTest {
    @Test
    public void evaluate() {
        DijkstraEvaluate eval = new DijkstraEvaluate();
        assertEquals(101.0, eval.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"), 0);
        assertEquals(2.0, eval.evaluate("( 1 + 1 )"), 0);
    }
}