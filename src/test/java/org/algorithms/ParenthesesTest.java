package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesesTest {

    @Test
    public void test() {
        Parentheses p = new Parentheses();
        assertTrue(p.isBalanced("()"));
        assertTrue(p.isBalanced("[()]{}{[()()]()}"));
        assertFalse(p.isBalanced("[(])"));
    }
}