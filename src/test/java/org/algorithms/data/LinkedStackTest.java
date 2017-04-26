package org.algorithms.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest {

    @Test
    public void simple() {
        LinkedStack<Integer> stack = new LinkedStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(stack.size(), 3);
        assertEquals((int) stack.pop(), 3);
        assertEquals((int) stack.pop(), 2);
        assertEquals((int) stack.pop(), 1);
        assertEquals(stack.size(), 0);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertEquals(stack.size(), 1);
        assertEquals((int) stack.pop(), 1);
    }
}