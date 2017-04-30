package org.algorithms.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResizingArrayQueueOfStringsTest {
    private ResizingArrayQueueOfStrings q;

    @Before
    public void before() {
        q = new ResizingArrayQueueOfStrings();
    }

    @Test
    public void test() {
        assertEquals(0, q.size());
        assertTrue(q.isEmpty());
        q.enqueue("1");
        assertEquals(1, q.size());
        assertFalse(q.isEmpty());
        q.enqueue("2");
        q.enqueue("3");
        assertEquals(3, q.size());
        assertEquals("1", q.dequeue());
        assertEquals(2, q.size());
        q.enqueue("4");
        q.enqueue("5");
        assertEquals(4, q.size());
    }

    @Test
    public void resize() {
        for(int i = 0; i < 255; i++) {
            q.enqueue(Integer.toString(i));
            q.dequeue();
        }
    }
}