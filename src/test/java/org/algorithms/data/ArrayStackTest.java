package org.algorithms.data;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayStackTest {
    @Test
    public void simple() {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<Integer>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        assertEquals(3, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void iterator() {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<Integer>();
        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        Iterator<Integer> it = stack.iterator();
        int i = 9;
        while (it.hasNext()) {
            int val = it.next();
            assertEquals(i, val);
            i--;
        }

    }
}