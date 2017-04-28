package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesesTest {

    @Test
    public void isBalanced() {
        Parentheses p = new Parentheses();
        assertTrue(p.isBalanced("()"));
        assertTrue(p.isBalanced("[()]{}{[()()]()}"));
        assertFalse(p.isBalanced("[(])"));
    }

    @Test
    public void fix() {
        Parentheses p = new Parentheses();
        assertEquals("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )", p.fix("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )"));
    }
}