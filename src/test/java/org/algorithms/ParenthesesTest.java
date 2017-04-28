package org.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesesTest {
    private Parentheses p;

    @Before
    public void before() {
        p = new Parentheses();
    }

    @Test
    public void isBalanced() {
        assertTrue(p.isBalanced("()"));
        assertTrue(p.isBalanced("[()]{}{[()()]()}"));
        assertFalse(p.isBalanced("[(])"));
    }

    @Test
    public void fix() {
        assertEquals("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )", p.fix("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )"));
    }

    @Test
    public void infixToPostfix() {
        assertEquals("( ( 1 2 + ) ( ( 3 4 - ) ( 5 6 - ) * ) * )", p.infixToPostfix("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )"));
    }
}