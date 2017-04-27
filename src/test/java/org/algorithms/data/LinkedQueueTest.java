package org.algorithms.data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedQueueTest {
    @Test
    public void test() {
        LinkedQueue<String> queue = new LinkedQueue<>();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
        queue.enqueue("be");
        queue.enqueue("or");
        queue.enqueue("not");
        queue.enqueue("to");
        queue.enqueue("be");
        assertEquals(5, queue.size());
        assertEquals("be", queue.dequeue());
        assertEquals(4, queue.size());
        assertEquals("or", queue.dequeue());
        assertEquals("not", queue.dequeue());
        assertEquals("to", queue.dequeue());
        assertEquals("be", queue.dequeue());
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

}